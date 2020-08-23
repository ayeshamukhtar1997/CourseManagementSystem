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
import java.util.Scanner;

public class studentMajors {
    public static void readfile() {
        try {
            FileReader reader = new FileReader("studentMajor.txt");
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
 
    public static void insert() {
        try {
            FileWriter writer = new FileWriter("studentMajor.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter student ID: ");
            int sid = input.nextInt();
            StudentMajor.setStudentID(sid);
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter major ID: ");
            int mid = input1.nextInt();
            StudentMajor.setMajorID(mid);
            
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter semester ID: ");
            int semid = input2.nextInt();
            StudentMajor.setSemesterID(semid);
            
            String line = String.valueOf(Registration.getRegID());
            line = line + "   " + Registration.getGrade() ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete() throws FileNotFoundException {
 try{      
    File originalFile = new File("studentMajor.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter student ID: ");
            int id = input.nextInt();
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
  //new file has all contents of original file except the record that matches given Student id

    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify() throws FileNotFoundException {

 try{  
 
       File originalFile = new File("studentMajor.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter student ID: ");
            int id = input.nextInt();
            Registration.setRegID(id);

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
           
           FileWriter writer = new FileWriter("studentMajor.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter major ID: ");
            int mid = input1.nextInt();
            StudentMajor.setMajorID(mid);
            
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter semester ID: ");
            int semid = input2.nextInt();
            StudentMajor.setSemesterID(semid);
            
            System.out.println("NEW RECORD: ");
  
            StudentMajor sm = new StudentMajor();
            System.out.println(sm.toString());
            line = String.valueOf(id) + "   " + String.valueOf(mid) +"   "+String.valueOf(semid) ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}
}
