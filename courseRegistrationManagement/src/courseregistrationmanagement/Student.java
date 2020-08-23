/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class Student extends Person {
    
    static String RegistrationDate;
    static int StudentID;
    static int MajorID;
   
    public Student(){
    super();}
    
    public  Student(int SID, int ID, String FName, String LName, String Bdate,String Rdate, int MajID) {
        super(ID, FName, LName, Bdate);
        RegistrationDate = Rdate;
        StudentID = SID;
        MajorID = MajID;
    }
   
    
    public static String getRegistrationDate() {
        return Student.RegistrationDate;
    }
    public static void setRegistrationdate(String date) {
        Student.RegistrationDate = date;
             
    }
    public static int getStudentID() {
        return Student.StudentID;
    }
 
    public static void setStudentID(int id) {
       Student.StudentID = id;
    }
    
   public static int getMajorID() {
        return Student.MajorID;
    }
   public static void setMajorID(int id) {
       Student.MajorID = id;
    }
}
