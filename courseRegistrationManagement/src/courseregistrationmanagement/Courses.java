/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Courses {
    
        public static void readfile() {  //displays records of courses file
        try {
            FileReader reader = new FileReader("course.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 //reads file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void insert(int id,String Des,String name,int maj) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\course.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner input = new Scanner(System.in);
            
            Course.setCourseID(id);
            
           
            Course.setCourseDes(Des);
            
          
            Course.setCourseName(name);
            
            Major.setMajorID(maj);
            
            String line = String.valueOf(Course.getCourseID());
            line = line + "  /  " +  Course.getCourseName() +"  / " + Course.getCourseDes()+ " / " + Major.getMajorID() ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete(int id) throws FileNotFoundException {
 try{      
    File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\course.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new temporary file 
           
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
           
            
           // Read from the original file and write to the new tempfile unless content matches data to be removed.
           while ((line = br.readLine()) != null) {

               if (!line.contains(String.valueOf(id))) {
                   pw.println(line);
                   }

               }
               pw.flush();
           
           pw.close();
           br.close();

           // Delete the original file

           if (!originalFile.delete()) {
               System.out.println("Could not delete file");
               return;
           }
          
           // Rename the new tempfile to the filename the original file had.
           if (!tempFile.renameTo(originalFile))
               System.out.println("Could not rename file");
 }
 //new file has all contents of original file except the record that matches given course id
    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify(int id, String name,String des, int majid) throws FileNotFoundException {
 try{  
 
       File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\course.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file 
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            Course.setCourseID(id);
           // Read from the original file and write to the new
           // unless content matches data to be removed.
           while ((line = br.readLine()) != null) {

               if (!line.contains(String.valueOf(id))) {
                   pw.println(line);
                   }

               }
               pw.flush();
           
           pw.close();
           br.close();

           // Delete the original file
           
           if (!originalFile.delete()) {
               System.out.println("Could not delete file");
               return;
           }

           // Rename the new file to the filename the original file had.
           if (!tempFile.renameTo(originalFile))
               System.out.println("Could not rename file");
           
           FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\course.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            
            Course.setCourseDes(des);
            
           
            Course.setCourseName(name);
             Major.setMajorID(majid);
            

            String line1 = String.valueOf(Course.getCourseID());
            line1 = line1 + "  /  " +  Course.getCourseName() +"  / " + Course.getCourseDes()+ " / " + Major.getMajorID() ;
          
            bufferedWriter.write(line1 );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}
}