/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.log;

import java.io.File;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Administrator
 */
public class LoggerClass {

    public static Logger logger;

    public LoggerClass() {
        File fileXML = new File("./config/log4j.xml");
        DOMConfigurator.configureAndWatch(fileXML.getPath());
        logger = LogManager.getLogger(LoggerClass.class);
    }

    public static Logger getLogger() {
        return logger;
    }

    
}
