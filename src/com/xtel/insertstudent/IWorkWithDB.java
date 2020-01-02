/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.insertstudent;

import com.xtel.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface IWorkWithDB {
    public void insertFromList(ArrayList<Student> list) throws Exception;
    public void insert(Object inputObject) throws Exception;

}
