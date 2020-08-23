/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;

public class Registration {
    static int RegID;
    static String Grade;
    
    
    public void Registration(){}
    
    public void Registration(int RID,
    String grade){
    
    RegID = RID ;
    Grade = grade;
    }
    
    public static int getRegID(){
    return Registration.RegID;
    }
    
    public static void setRegID(int id) {
        Registration.RegID = id;}
    
        public static String getGrade(){
    return Registration.Grade;
    }
    
    public static void setGrade(String g) {
        Registration.Grade = g;}
    
    @Override
    public String toString(){
    return("The Registration ID is: "+getRegID()+" and the grade is: "+getGrade());
    
    }
}
