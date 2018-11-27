package com.javalemon.controller;

import com.javalemon.common.datasource.DruidUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */
@WebServlet(name = "dataSourceTest")
public class DataSourceTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuffer msg = new StringBuffer();
        int id = 2;
        String sql ="select * from smu_blog where id = ?";
        Connection connection = DruidUtil.getConnection();
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, id + "");
            ResultSet resultSet = prepareStatement.executeQuery();
            msg.append(resultSet.getString("title"));
//            while (resultSet.next()) {
//                msg.append(resultSet.);
//                request.getRequestDispatcher("/welcome").forward(request, response);
//            }
//            else{
//                System.out.println("aaaaa");
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        request.getRequestDispatcher("/WEB-INF/jsp/navigation.jsp").forward(request, response);
        response.getWriter().print(msg);
//        response.sendRedirect("https://seemoonup.github.io/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
