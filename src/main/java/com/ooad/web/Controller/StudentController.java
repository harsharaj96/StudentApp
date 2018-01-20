package com.ooad.web.Controller;

//Created by Harsha Raj

import com.ooad.web.Dao.StudentDao;
import com.ooad.web.Model.Student;

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
        final int studentId = Integer.parseInt(request.getParameter("studentId"));
        final StudentDao studentDao = new StudentDao();
        final Student student = studentDao.getStudent(1);
        request.setAttribute("student",student);

        //TODO check the path
        RequestDispatcher rd = request.getRequestDispatcher("jsp/marks.jsp");
        rd.forward(request,response);

    }
}
