package com.example.storeproject.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCONTEXT {
    public static String URL = "jdbc:sqlserver://localhost\\DESKTOP-LJPR3LT\\MSSQLSERVER01:1433;databaseName=project2;trustServerCertificate=true";
    public static String USERNAME = "sa";
    public static String PASS = "211224";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy driver");
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (SQLException ex) {
            System.out.println("Ket noi khong thanh cong .");
            ex.printStackTrace();
        }
        return con;
    }



    public static void main(String[] args) {
        Connection con = DBCONTEXT.getConnection();
        if (con != null) {
            System.out.println("Ket noi thanh cong");
        } else {
            System.out.println("Failed to connect to SQL Server!");
        }
    }
}