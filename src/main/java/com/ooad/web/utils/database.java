/*
 * Created by Sandeep Tadepalli on 20/01/18 23:11
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sandeep";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/jsp?useSSL=false";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
    }
}
