package com.javalemon.controller;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-11-26
 * @desc
 */
@WebServlet(name = "timeline.json")
public class WhiteShirtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("id", 5);
        result.put("nickname", "lemon");
        result.put("avatarUrl", "");
        result.put("time", "");
        result.put("text", "第一个消息（白衬衫）");
        result.put("original_pic", "");
        result.put("comment_count", 12);
        result.put("like_count", 12);
        response.getWriter().print(JSONObject.fromObject(result));

//        request.getRequestDispatcher("/WEB-INF/jsp/daohang.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
