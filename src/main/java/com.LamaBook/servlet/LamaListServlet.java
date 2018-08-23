package com.LamaBook.servlet;

import com.LamaBook.dao.LamaDao;
import com.LamaBook.freeMarkerConfig.FreeMarkerConfig;
import com.LamaBook.model.Lama;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/lamaList")
public class LamaListServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(com.LamaBook.servlet.AddLamaServlet.class);

    @Inject
    private FreeMarkerConfig freeMarkerConfig;

    @EJB
    private LamaDao lamaDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Lama> lamaList = lamaDao.findAll();

        Template template = freeMarkerConfig.getTemplate("index.ftlh", getServletContext());
        Map<String, Object> model = new HashMap<>();
        model.put("lamas", lamaList);

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.warn(e.getMessage());
        }
    }
}
