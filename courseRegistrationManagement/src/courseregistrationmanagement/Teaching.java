/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class Teaching  {
    static String classCode;
    static int TID;
    static int instructorID;
    static int courseID;
    static int semesterID;

    public Teaching(){}
    
    public Teaching(String code, int TID){
    this.classCode = code;
    this.TID = TID;
    ;
    }
    public static String getClassCode(){
        return Teaching.classCode;
    }
    
    public static void setClassCode(String code){
        Teaching.classCode = code;
    }
    public static int getTID(){
        return Teaching.TID;
    }
    
    public static void setTID(int TID){
        Teaching.TID = TID;
    }
    
    @Override
    public String toString(){
    return ("The Class code is: "+getClassCode()+" and the TID is: "+getTID());
    }
    
}
