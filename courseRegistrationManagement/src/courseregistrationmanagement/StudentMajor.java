/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class StudentMajor {
    static int SemesterID;
    static int StudentID;
    static int MajorID;
    Student s = new Student();
    
    public StudentMajor(){
    //Constructor
    
    }
    public StudentMajor(    int SemID,
    int StudID,
    int MajID){
    //Constructor
    SemesterID = SemID;
    s.StudentID = StudID;
    MajorID = MajID;
    
    }
    
    public static int getStudentID() {
        return StudentMajor.StudentID;
    }
 
    public static void setStudentID(int id) {
        Student.StudentID = id;
    }
     public int getMajorID() {
        return StudentMajor.MajorID;
    }
 
    public static void setMajorID(int id) {
        StudentMajor.MajorID = id;
    }
    
     public static int getSemesterID() {
        return StudentMajor.SemesterID;
    }
 
    public static void setSemesterID(int id) {
        StudentMajor.SemesterID = id;
    };

        @Override
    public String toString(){
    return ("\nStudent: "+getStudentID()+" is enrolled in major  "+getMajorID() + "of semester "+ getSemesterID());
    }
    
}