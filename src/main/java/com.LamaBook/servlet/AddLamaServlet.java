package com.LamaBook.servlet;


import com.LamaBook.bean.PhotoUploadBean;
import com.LamaBook.dao.LamaDao;
import com.LamaBook.exceptions.UserImageNotFound;
import com.LamaBook.freeMarkerConfig.FreeMarkerConfig;
import com.LamaBook.model.Lama;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/addLama")
@MultipartConfig
public class AddLamaServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(com.LamaBook.servlet.AddLamaServlet.class);

    @Inject
    private LamaDao lamaDao;

    @Inject
    private FreeMarkerConfig freeMarkerConfig;

    @Inject
    PhotoUploadBean photoUpload;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String nameParam = req.getParameter("name");
        String loginParam = req.getParameter("login");
        String passwordParam = req.getParameter("password");
        String bioParam = req.getParameter("bio");
        String birthParam = req.getParameter("dateOfBirth");


        if (!isParamsValid(nameParam, loginParam, passwordParam)) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        Lama lama = new Lama();

        try {
            lama.setId(lamaDao.getLastId() + 1);


        } catch (NullPointerException e) {

        }
        lama.setDateOfBirth(LocalDate.parse(birthParam));
        lama.setName(nameParam);
        lama.setLogin(loginParam);
        lama.setPassword(passwordParam);
        lama.setBio(bioParam);


        Part filePart = req.getPart("photoURL");
        File file = null;
        try {
            file = photoUpload.uploadImageFile(filePart);
            lama.setPhotoURL("/lamasImages/" + file.getName());
        } catch (UserImageNotFound userImageNotFound) {
            logger.info(userImageNotFound.getMessage());
        }

        lamaDao.save(lama);

        resp.sendRedirect("/lamaList");
    }

    private boolean isParamsValid(String... params) {

        for (String param : params) {
            if (param == null || param.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
