package com.javalemon.controller;

import com.javalemon.controller.data.WhiteShirtData;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */
@WebServlet(name = "pub.json")
public class WhiteShirtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Map<String, Object>> result = WhiteShirtData.data;

        response.setHeader("content-type","text/html;charset=UTF-8");
        response.getWriter().print(JSONArray.fromObject(result));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
