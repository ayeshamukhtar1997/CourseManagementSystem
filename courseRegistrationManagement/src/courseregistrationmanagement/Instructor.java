/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;

public class Instructor extends Person{
    
    
    static int InstructorID;
    public Instructor(){};
    
    public Instructor(int InsID ,String FName,String LName,String Bdate,int ID ){
    super(ID, FName, LName, Bdate);
    InstructorID = InsID;
    }
    
    public static int getInstructorID(){
    return Instructor.InstructorID;
    }
    
    public static void setInstructorID(int id) {
        Instructor.InstructorID = id;
        Teaching.instructorID = id;
    }
            
    }
    
