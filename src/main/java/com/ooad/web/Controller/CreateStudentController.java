/*
 * Created by Sandeep Tadepalli on 21/01/18 14:23
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.Controller;

import com.ooad.web.Dao.StudentDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateStudentController")
public class CreateStudentController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final RequestDispatcher rd = request.getRequestDispatcher("jsp/createStudent.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String studentName = request.getParameter("inputName");
        final int studentMarks = Integer.parseInt(request.getParameter("inputMarks"));
        final StudentDao studentDao = new StudentDao();
        studentDao.createStudent(studentName, studentMarks);
        final RequestDispatcher rd = request.getRequestDispatcher("jsp/marks.jsp");
        rd.forward(request,response);
    }
}
