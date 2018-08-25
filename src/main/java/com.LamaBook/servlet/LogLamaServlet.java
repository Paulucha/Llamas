package com.LamaBook.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/logLama")
@MultipartConfig
public class LogLamaServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(com.LamaBook.servlet.AddLamaServlet.class);

}