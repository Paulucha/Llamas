package com.LamaBook.servlet;
import com.LamaBook.bean.CommonOperations;
import com.LamaBook.model.Lama;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logLama")
public class LogLamaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login=request.getParameter("login");
        String password=request.getParameter("password");

        Lama lama= new Lama();
        CommonOperations co=new CommonOperations();
        lama.setLogin(login);
        lama.setPassword(password);

        lama=co.getLoginDetails(lama);
        if(lama.isValid()){
            HttpSession session=request.getSession();
            session.setAttribute("currentsession", lama);
            response.sendRedirect("lamahome.ftlh?id="+lama.getId()+"&uname="+lama.getLogin());
        }else{
            response.sendRedirect("index.ftlh");
        }
    }
}
