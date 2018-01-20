package com.ooad.web.Dao;

import com.ooad.web.Model.Student;
import com.ooad.web.utils.database;

import java.sql.*;

public class StudentDao {
    public Student getStudent(final int sId){
        final String connectionUrl = "jdbc:mysql://localhost:3306/studentDb?useSSL=false";
        final String username = database.username;
        final String password = database.password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection(connectionUrl,username,password);
            final Statement st = con.createStatement();
            final String getStudentQuery = "SELECT * FROM student WHERE id = " + sId;
            final ResultSet rs = st.executeQuery(getStudentQuery);

            if(rs.next()){
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
}
