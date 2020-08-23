package courseregistrationmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Students {

    public static void readfile() {
        try {
            FileReader reader = new FileReader("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\studentFile.txt");
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
 
    public static void insert(int id, int id2, String name1, String name2, String date1, String date2, int mid1) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\studentFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            Student.setStudentID(id);
            
        
            Person.setCivilID(id2);
            
            
            Person.setFirstName(name1);
            
           
            Person.setLastName(name2);
            
      
            Person.seBirthdate(date1);
            
           
            Student.setRegistrationdate(date2);
            
           
            Student.setMajorID(mid1);
            
            
            
            String line = String.valueOf(Student.getStudentID());
            line = line + " /  "+String.valueOf(Person.getCivilID());
            line = line + " /  " + Person.getFirstName();
            line = line + " /  " + Person.getLastName();
            line = line + " /  " + Person.getBirthdate();
            line = line + " /  " + Student.getRegistrationDate();
            line = line + " /   "+ String.valueOf(Student.getMajorID());
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete(int id) throws FileNotFoundException {
 try{      
    File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\studentFile.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            
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
 }
  //new file has all contents of original file except the record that matches given student id

    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify(int id, int id2, String name1, String name2, String date1, String date2, int mid1) throws FileNotFoundException {
 try{  
 
       File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\studentFile.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
          
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
           
           FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\studentFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
         
            Person.setCivilID(id2);
            
            
            Person.setFirstName(name1);
            
            
            Person.setLastName(name2);
            
        
            Person.seBirthdate(date1);
            

            Student.setRegistrationdate(date2);
     
            Student.setMajorID(mid1);
            
            
            
            String line1 = String.valueOf(Student.getStudentID());
            line1 = line1 + "  / "+String.valueOf(Person.getCivilID());
            line1 = line1 + "  / " + Person.getFirstName();
            line1 = line1 + "  / " + Person.getLastName();
            line1 = line1 + "  / " + Person.getBirthdate();
            line1 = line1 + "  / " + Student.getRegistrationDate();
            line1 = line1 + "  / "+ String.valueOf(Student.getMajorID());
            
            Student s1 = new Student(id,id2,name1,name2,date1,date2,mid1);
            System.out.println(" ");
            System.out.println("NEW RECORD: ");
            System.out.println(s1.toString());
            System.out.println(" ");
            
            line = String.valueOf(id);
            line = line + " /  " +String.valueOf(Person.getCivilID());
            line = line + " /  " + Person.getFirstName();
            line = line + " /  " + Person.getLastName();
            line = line + " /  " + Person.getBirthdate();
            line = line + " /  " + Student.getRegistrationDate();
            line = line + " /   "+ String.valueOf(Student.getMajorID());
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}

}