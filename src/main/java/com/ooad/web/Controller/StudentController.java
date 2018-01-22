/*
 * Created by Sandeep Tadepalli on 20/01/18 23:11
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.Controller;

//Created by Harsha Raj

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentController")
public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*        final int studentId = Integer.parseInt(request.getParameter("studentId"));
        final StudentDao studentDao = new StudentDao();
        final Student student = studentDao.getStudent(1);
        request.setAttribute("student",student);*/
        RequestDispatcher rd = request.getRequestDispatcher("jsp/marks.jsp");
        rd.forward(request,response);

    }
}
