/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uquetignywebapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author yacinemaghezzi
 */
public class ConnectionPostgresDB {
    Connection con = null;
    
    public ConnectionPostgresDB() throws SQLException {
        String url = "jdbc:postgresql://localhost:45432/granulaoperate";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");
        props.setProperty("ssl", "false");
        con = DriverManager.getConnection(url, props);
    }
    
    public void getAllTables() throws SQLException{
        Statement statement = (Statement) con.createStatement();
            ResultSet rs = statement
                    .executeQuery("SELECT datname FROM pg_database");
            while (rs.next()) {
                System.out.println("DB Name : " + rs.getString(1));
           //i need another while here to list tables 
           //inside the selected database
}
    }

}
