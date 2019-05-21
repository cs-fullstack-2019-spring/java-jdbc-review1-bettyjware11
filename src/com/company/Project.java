package com.company;

import java.sql.*;

public class Project {

//setting up connection
    private final static String url = "jdbc:postgresql://localhost:postgres.public.eteam.teamname";
    private final static String user = "student";
    private final static String password = "C0d3Cr3w";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    public static void main (String[]args){
//    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            getMatchResults(conn);
//            addGoal(conn);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

//        return conn;
    }

    public static void getMatchResults(Connection conn) {
        try {
            String SQL = "INSERT INTO eteam(id,teamname,coach) VALUES ('POL','Poland','Franciszek Smuda'); ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from eteam");
            stmt.executeQuery("Select * from eteam");
            System.out.println(rs.getString(0));
            while (rs.next())
            {
                System.out.println(rs.getInt("teamname"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }




    }
}