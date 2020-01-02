/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.xtel.context.DBContext;
import com.xtel.insertstudent.GetListOfStudentFromUser;
import com.xtel.insertstudent.IWorkWithDB;
import com.xtel.insertstudent.InsertToDB;
import com.xtel.model.Student;
import com.xtel.validate.ValidateInput;
import java.util.ArrayList;
import com.xtel.context.IConnection;
/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ValidateInput validate = new ValidateInput();
        IConnection conn = new DBContext();
        IWorkWithDB dbAcrion = new InsertToDB(conn);
        
        System.out.print("Enter number of Student : ");
        int numberOfStudent = validate.validatedInt();
        ArrayList<Student> studentArr = new GetListOfStudentFromUser(validate).getListStudent(numberOfStudent);
        dbAcrion.insertFromList(studentArr);
        
    }
}
