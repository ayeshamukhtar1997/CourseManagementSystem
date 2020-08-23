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

public class Semesters {
public static void readfile() {
        try {
            FileReader reader = new FileReader("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\semester.txt");
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
 
    public static void insert(int id, String code,String desc ) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\semester.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            Semester.setSemesterID(id);
            
            
            Semester.setSemesterName(code);
            
           
            Semester.setSemesterDesc(desc);
            
            String line = String.valueOf(Semester.getSemesterID());
            line = line + "  /   " + Semester.getSemesterName()+ "  /     " +  Semester.getSemesterDesc() ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete(int id) throws FileNotFoundException {
 try{      
    File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\semester.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile1.txt");
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
  //new file has all contents of original file except the record that matches given semester id

    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify(int id, String code, String desc) throws FileNotFoundException {
 try{  
 
       File originalFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\semester.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\tempfile1.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
           
            Semester.setSemesterID(id);
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
           
           FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\courseRegistrationManagement\\src\\courseregistrationmanagement\\semester.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
           
            Semester.setSemesterName(code);
            
            
            Semester.setSemesterDesc(desc);
            
            System.out.println("NEW RECORD: ");
 
            String line1 = String.valueOf(Semester.getSemesterID());
            line1 = line1 + " /   " + Semester.getSemesterName()+ "  /    " +  Semester.getSemesterDesc() ;
          
            bufferedWriter.write(line1 );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}
}
