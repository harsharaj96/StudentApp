/*
 * Created by Sandeep Tadepalli on 20/01/18 23:11
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.Dao;

import com.ooad.web.Model.Student;
import com.ooad.web.utils.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public Student getStudent(final int sId) {

        try {
            final Connection con = database.getConnection();
            final Statement st = con.createStatement();
            final String getStudentQuery = "SELECT * FROM student WHERE id = " + sId;
            final ResultSet rs = st.executeQuery(getStudentQuery);

            if (rs.next()) {
                final Student student = new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("marks"),
                        rs.getString("url"));
                System.out.println(student);
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean createStudent(String studentName, int studentMarks) {
        try {
            final Connection con = database.getConnection();
            final Statement st = con.createStatement();
            final String query = " insert into student (name, marks, url)"
                    + " values (?, ?, ?)";
            final PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, studentName);
            preparedStmt.setInt (2, studentMarks );
            preparedStmt.setString   (3, "#");
            preparedStmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
