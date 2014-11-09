package com.test.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    private String greetMessage;

    public FirstServlet() {
    }

    public FirstServlet(String greetMessage) {
        this.greetMessage = greetMessage;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter pw = response.getWriter();
        String message = "<h1>Hi, this is my Sample test servlet.</h1>";
        pw.println("<h1>Hi, this is my Sample test servlet.</h1>");
        pw.println("<h2>Hi,"+greetMessage+"</h2>");
        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/home.jsp");
        rd.forward(request, response);
    }
}
