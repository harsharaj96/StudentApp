/*
 * Created by Sandeep Tadepalli on 21/01/18 14:23
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.Controller;

import com.ooad.web.Dao.StudentDao;
import com.ooad.web.utils.BaseUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateStudentController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 5)
public class CreateStudentController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final RequestDispatcher rd = request.getRequestDispatcher("jsp/createStudent.jsp");
        rd.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String savePath = BaseUtils.BASE_DIR + BaseUtils.IMAGE_DIR;

        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        final String studentName = request.getParameter("inputName");
        final int studentMarks = Integer.parseInt(request.getParameter("inputMarks"));
        Part file = request.getPart("image");
        String fileName = extractfilename(file);
        file.write(savePath + File.separator + fileName);
        String url = "/public/images/" + fileName;

        final StudentDao studentDao = new StudentDao();
        studentDao.createStudent(studentName, studentMarks, url);
        final RequestDispatcher rd = request.getRequestDispatcher("jsp/marks.jsp");
        rd.forward(request,response);

    }

    private String extractfilename(Part file) {
        String cd = file.getHeader("content-disposition");
        String[] items = cd.split(";");
        for (String string : items) {
            if (string.trim().startsWith("filename")) {
                return string.substring(string.indexOf("=") + 2, string.length() - 1);
            }
        }
        return "";
    }
}
