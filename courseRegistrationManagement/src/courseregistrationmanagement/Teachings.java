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

public class Teachings {
     public static void readfile() {
        try {
            FileReader reader = new FileReader("Teaching.txt");
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
            FileWriter writer = new FileWriter("Teaching.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Teaching ID: ");
            int id = input.nextInt();
            Teaching.setTID(id);
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter class code: ");
            String code = input1.nextLine();
            Teaching.setClassCode(code);
            
            String line = String.valueOf(Teaching.getTID());
            line = line + "   " + Teaching.getTID() ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
    public static void delete() throws FileNotFoundException {
 try{      
    File originalFile = new File("Teaching.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Teaching ID: ");
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
  //new file has all contents of original file except the record that matches given teaching id

    catch (IOException e) {
            e.printStackTrace();
        }
}

public static void modify() throws FileNotFoundException {
 try{  
 
       File originalFile = new File("Teaching.txt");
           BufferedReader br = new BufferedReader(new FileReader(originalFile));

           // Construct the new file that will later be renamed to the original
           // filename.
           File tempFile = new File("tempfile.txt");
           PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

           String line = null;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Teaching ID: ");
            int id = input.nextInt();
            Teaching.setTID(id);

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
           
           FileWriter writer = new FileWriter("Teaching.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter class code: ");
            String code = input1.nextLine();
            Teaching.setClassCode(code);
            
            System.out.println("NEW RECORD: ");
  
            Teaching T = new Teaching();
            System.out.println(T.toString());
            line = String.valueOf(id) + "   " + Teaching.getClassCode() ;
            
            bufferedWriter.write(line );
            bufferedWriter.newLine();

 
            bufferedWriter.close();
           
 }
    catch (IOException e) {
            e.printStackTrace();
        }
}
}


