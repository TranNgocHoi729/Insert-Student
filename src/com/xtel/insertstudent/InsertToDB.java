/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.insertstudent;

import com.xtel.context.IConnection;
import com.xtel.log.LoggerClass;
import com.xtel.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Administrator
 */
public class InsertToDB implements IWorkWithDB {

    IConnection connecton;
    Logger logger;

    public InsertToDB(IConnection connection) {
        this.connecton = connection;
        logger = LoggerClass.getLogger();
    }

    public void insertOneStudent(Student studen) throws Exception {
        Connection conn = connecton.connectToDB();
        String sql = "insert into student (name,gender,address,age)\n"
                + "values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, studen.getName());
        ps.setString(2, studen.getGender());
        ps.setString(3, studen.getAddress());
        ps.setInt(4, studen.getAge());
        int check = ps.executeUpdate();
        if (check == 0) {
            logger.error("Can not insert !!");
        }
    }

    @Override
    public void insertFromList(ArrayList<Student> list) throws Exception {
        for (Object list1 : list) {
            insert(list1);
        }
    }

    @Override
    public void insert(Object inputObject) throws Exception {
        Student student = (Student) inputObject;
        Connection conn = connecton.connectToDB();
        String sql = "insert into student (name,gender,address,age)\n"
                + "values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, student.getName());
        ps.setString(2, student.getGender());
        ps.setString(3, student.getAddress());
        ps.setInt(4, student.getAge());
        int check = ps.executeUpdate();
        if (check == 0) {
            logger.error("Can not insert !!");
        }
    }
}
