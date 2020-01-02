
package com.xtel.insertstudent;


import java.util.ArrayList;
import com.xtel.model.Student;
import com.xtel.validate.ValidateInput;
import java.util.Scanner;

public class GetListOfStudentFromUser {
    Scanner sc = new Scanner(System.in);
    ValidateInput validate;

    public GetListOfStudentFromUser(ValidateInput validate) {
        this.validate = validate;
    }
    
    public ArrayList<Student> getListStudent(int numOfStudent){
        ArrayList<Student> studentArr = new ArrayList<>();
        for (int i = 0; i < numOfStudent; i++) {
            Student student = getStudent();
            studentArr.add(student);
        }
        return studentArr;
    }
    public Student getStudent(){
        System.out.print("Enter student's Name : ");
        String name = sc.nextLine().trim();
        System.out.println("Enter gender : ");
        String gender = sc.nextLine().trim();
        System.out.println("Enter Address : ");
        String address = sc.nextLine().trim();
        System.out.println("Enter age ; ");
        int age = validate.validatedInt();
        return new Student(name, gender, address, age);
              
    }
    
}
