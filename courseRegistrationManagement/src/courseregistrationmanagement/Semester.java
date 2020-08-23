/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;

public class Semester {
    static int SemesterID;
    static String SemesterName;
    static String SemesterDesc;
    
    public Semester(){}
    public Semester(int id, String name, String des){
    this.SemesterID = id;
    this.SemesterName = name;
    this.SemesterDesc = des;
    
    }
    public static int getSemesterID(){
    return Semester.SemesterID;
    }
    public static void setSemesterID(int id){
    Semester.SemesterID = id;
    Teaching.semesterID = id;
    }
    public static String getSemesterName(){
    return Semester.SemesterName;
    }
    public static void setSemesterName(String name){
    Semester.SemesterName = name;
    }
    public static String getSemesterDesc(){
    return Semester.SemesterDesc;
    }
    public static void setSemesterDesc(String desc){
    Semester.SemesterDesc = desc;
    }
    
    @Override
    public String toString(){
    return ("The SemesterID is: "+getSemesterID()+", the semesterName is: "+getSemesterName()+", the semesterDesc is: " +getSemesterDesc());
    }
}


