package com.LamaBook.servlet;

import com.LamaBook.freeMarkerConfig.FreeMarkerConfig;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/lama")

public class WelcomeServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(WelcomeServlet.class);
    @Inject
    private FreeMarkerConfig freeMarkerConfig;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Template template;
        response.setContentType("text/html;charset=UTF-8");
        template = freeMarkerConfig.getTemplate("index.ftlh", getServletContext());
        Map<String, Object> model = new HashMap<>();

        try {
            template.process(model, response.getWriter());
        } catch (TemplateException e) {
            logger.warn("Template doesn't exist", e);
        }
    }
}
