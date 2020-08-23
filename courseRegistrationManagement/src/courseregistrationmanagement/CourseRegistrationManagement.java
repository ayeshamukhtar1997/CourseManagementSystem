/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class CourseRegistrationManagement {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException {

      
    System.out.println("  COURSE REGISTRATION MANAGEMENT SYSTEM");
boolean flag = true;    
while (flag) {   
    System.out.println("\nChoose from menu \n1.Courses \n2.Instructors \n3.Majors \n4.Registrations \n5.Semesters \n6.Students \n7.Teachings \n8.Enroll Student in major \n9.Exit System");
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter Option: ");
    String option = input.nextLine();
    if("1".equals(option)){
        System.out.println("\nWelcome to Courses");
        Courses c = new Courses();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            c.readfile();
        };
        if("2".equals(option1)){
            c.insert();
            c.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            c.modify();
            c.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            c.delete();
            c.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
            
        };

    };
    if("2".equals(option)){
        System.out.println("\nWelcome to Instrctors");
        Instructors I = new Instructors();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            I.readfile();
        };
        if("2".equals(option1)){
            I.insert();
            I.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            I.modify();
            I.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            I.delete();
            I.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("3".equals(option)){
        System.out.println("\nWelcome to Majors");
        Majors m = new Majors();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            m.readfile();
        };
        if("2".equals(option1)){
            m.insert();
            m.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            m.modify();
            m.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            m.delete();
            m.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("4".equals(option)){
        System.out.println("\nWelcome to Registrations");
        Registrations reg = new Registrations();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            reg.readfile();
        };
        if("2".equals(option1)){
            reg.insert();
            reg.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            reg.modify();
            reg.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            reg.delete();
            reg.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("5".equals(option)){
        System.out.println("\nWelcome to Semesters");
        Semesters sem = new Semesters();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            sem.readfile();
        };
        if("2".equals(option1)){
            sem.insert();
            sem.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            sem.modify();
            sem.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            sem.delete();
            sem.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("6".equals(option)){
        System.out.println("\nWelcome to Students");
        Students std = new Students();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
           std.readfile();
        };
        if("2".equals(option1)){
            std.insert();
            std.readfile();
            System.out.println("\n ADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            std.modify();
            std.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            std.delete();
            std.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("7".equals(option)){
        System.out.println("\nWelcome to Teachings");
        Teachings t = new Teachings();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            t.readfile();
        };
        if("2".equals(option1)){
            t.insert();
            t.readfile();
            System.out.println("\nADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            t.modify();
            t.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            t.delete();
            t.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
    };
    if("8".equals(option)){
        System.out.println("\nWelcome to Student Majors");
        studentMajors sm = new studentMajors();
        System.out.println("\nChoose from menu \n1.Display Records \n2.Insert new record \n3.Update record \n4.Delete record");
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nEnter Option: ");
        String option1 = input1.nextLine();
        if("1".equals(option1)){
            sm.readfile();
        };
        if("2".equals(option1)){
            sm.insert();
            sm.readfile();
            System.out.println("\nADDED SUCCESSULLY\n");
        };
        if("3".equals(option1)){
            sm.modify();
            sm.readfile();
            System.out.println("\n MODIFIED SUCCESSULLY\n");
        };
        if("4".equals(option1)){
            sm.delete();
            sm.readfile();
            System.out.println("\n DELETED SUCCESSULLY\n");
        };
        };
    
        if("9".equals(option)){
        System.out.println("\n\nExiting.....");
        flag = false;
        };
    };


        
    };
    
}
