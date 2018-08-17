package com.LamaBook.servlet;


import com.LamaBook.dao.LamaDao;
import com.LamaBook.model.Lama;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/addLama")
@Transactional
public class AddLamaServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(com.LamaBook.servlet.AddLamaServlet.class);
    @Inject
    private LamaDao lamaDao;

    private void addLama(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        final Lama lama = new Lama();
        lama.setName(req.getParameter("name"));
        lama.setLogin(req.getParameter("login"));
        lama.setPassword(req.getParameter("password"));
        lama.setDateOfBirth(LocalDate.parse(req.getParameter("date")));
        lama.setBio(req.getParameter("bio"));
        lama.setPhotoURL(req.getParameter("pic"));


        lamaDao.save(lama);
        logger.info("Saved a new Lama object: {}", lama);

    }
}
