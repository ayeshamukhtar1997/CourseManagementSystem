/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class Major {
   static int MajorID;
    static String MajorName;
    static String MajorDescription;
    
    
    public Major(){}
    
    public Major(int MajID,
    String MajName,
    String MajorDesc){
    
    MajorID = MajID;
     MajorName = MajName;
     MajorDescription = MajorDesc;
    
    }
    
    public static int getMajorID() {
        return Major.MajorID;
    }
 
    public static void setMajorID(int id) {
        Major.MajorID = id;}
    
    public static String getMajorName() {
        return Major.MajorName;
    }
 
    public static void setMajorName(String name) {
        Major.MajorName = name;
    
}
    public static String getMajorDesc() {
        return Major.MajorDescription;
    }
 
    public static  void setMajorDesc(String desc) {
        Major.MajorDescription = desc;
    
}
}