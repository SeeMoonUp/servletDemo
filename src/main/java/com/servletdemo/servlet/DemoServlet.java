package com.servletdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "doDemo")
public class DemoServlet extends HttpServlet {
    private int testNum = 0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            Thread.sleep(new Random().nextInt() * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        testNum++;
        int tempNum = testNum;
//        String name = request.getParameter("name");
        System.out.println(tempNum + ",thread" + Thread.currentThread().getName());
        request.getRequestDispatcher("/WEB-INF/jsp/navigation.jsp").forward(request, response);
//        response.getWriter().print(tempNum);
//        response.sendRedirect("https://seemoonup.github.io/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
