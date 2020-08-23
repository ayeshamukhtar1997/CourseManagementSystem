/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class Course {
 
    static int  courseID;
    static String courseCode;
    static String courseName;
    static String courseDes;
    
    public Course (){}
    
    public Course(int id, String code, String name, String Des ){
    this.setCourseID(id);
    this.setCourseCode(code);
    this.setCourseName(name);
    this.setCourseDes(Des);
    }
    
    public static int getCourseID(){
    return Course.courseID;
    
    }
    public static void setCourseID(int id){
    Course.courseID = id;
    Teaching.courseID = id;
    }
    public static String getCourseCode(){
    return Course.courseCode;
    }
    public static void setCourseCode(String code){
    Course.courseCode = code;
 
    }
    public static String getCourseName(){
    return Course.courseName;
    }
    public static void setCourseName(String name){
    Course.courseName = name;
    }
    public static String getCourseDes(){
    return Course.courseDes;
    }
    public static void setCourseDes(String Des){
    Course.courseDes = Des;
    }
    
    @Override
    public String toString(){
    return("The courseID is: "+getCourseID()+"and the Course code is: "+getCourseCode()+", of Course: "+getCourseName());
    }
}
