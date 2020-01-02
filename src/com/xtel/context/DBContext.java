/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DBContext implements IConnection{
        private Connection getConnection(){          
            try {
                String url = null ;
                if (instance == null || instance.trim().isEmpty()) {
                    url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
                }
                Class.forName("oracle.jdbc.driver.OracleDriver");
                return DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
    private final String serverName = "localhost"; 
    private final String portNumber = "1521";
    private final String sid = "orcl";
    private final String instance = "";
    private final String username = "hoi";
    private final String password = "hoi1999bac";

    @Override
    public Connection connectToDB() {
        return getConnection();
    }
}
