/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.context;

import java.sql.Connection;

/**
 *
 * @author Administrator
 */
public interface IConnection {
    public Connection connectToDB();
}
