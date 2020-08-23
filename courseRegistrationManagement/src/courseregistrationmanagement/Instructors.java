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

public class Instructors {
    

    public static void readfile() {
        try {
            FileReader reader = new FileReader("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\Instructor .txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void insert(int id, String name1, String lname, String bdate, int cid) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\Instructor .txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
           
            Instructor.setInstructorID(id);
            
            
        
          
            Person.setFirstName(name1);
            

            Person.setLastName(lname);
            
 
            Person.seBirthdate(bdate);

            Person.setCivilID(cid);
            
            
            String line = String.valueOf(Instructor.getInstructorID());
            line = line + "  / " + Person.getFirstName();
            line = line + "  / " + Person.getLastName();
            line = line + "  / " + Person.getBirthdate();
            line = line + "  / " + String.valueOf(Person.getCivilID());

            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete(int id) throws FileNotFoundException {
 try{      
    File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\Instructor .txt");
    BufferedReader br = new BufferedReader(new FileReader(originalFile));

         
    File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile1.txt");
    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

    String line = null;
            
          
           while ((line = br.readLine()) != null) {

               if (!line.contains(String.valueOf(id))) {
                   pw.println(line);
                   }

               }
               pw.flush();
           
           pw.close();
           br.close();

           if (!originalFile.delete()) {
               System.out.println("Could not delete file");
               return;
           }

           if (!tempFile.renameTo(originalFile))
               System.out.println("Could not rename file");
 }
  //new file has all contents of original file except the record that matches given instructor id

    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify(int id,String fname,String lname,String bdate,int cid) throws FileNotFoundException {
 try{  
 
       File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\Instructor .txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempFile1.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;

         
           while ((line = br.readLine()) != null) {

               if (!line.contains(String.valueOf(id))) {
                   pw.println(line);
                   }

               }
               pw.flush();
           
           pw.close();
           br.close();

           if (!originalFile.delete()) {
               System.out.println("Could not delete file");
               return;
           }

           if (!tempFile.renameTo(originalFile))
               System.out.println("Could not rename file");
           
           FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\Instructor .txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
 
            Person.setFirstName(fname);
            

            Person.setLastName(lname);
            

            Person.seBirthdate(bdate);

            Instructor.setInstructorID(cid);
            
            String line1 = String.valueOf(Instructor.getInstructorID());
            line1 = line1 + " /  " + Person.getFirstName();
            line1 = line1 + "  / " + Person.getLastName();
            line1 = line1 + "  / " + Person.getBirthdate();
            line1 = line1 + "  / " + String.valueOf(Person.getCivilID());
             
           
            
            
            
            bufferedWriter.write(line1 );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}

}
