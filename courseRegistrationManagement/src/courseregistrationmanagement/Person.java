/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationmanagement;


public class Person{
    static int CivilID;
    static String FirstName;
    static String LastName;
    static String Birthdate;
    
public Person(){}
public  Person(int ID,String FName,String LName,String Bdate){
    
    CivilID = ID;
    FirstName = FName;
    LastName = LName;
    Birthdate = Bdate;
}

public static int getCivilID() {
        return Person.CivilID;
    }
 
    public  static void setCivilID(int id) {
        Person.CivilID = id;
    }


public static String getFirstName() {
        return Person.FirstName;
    }
 
public static void setFirstName(String name) {
        Person.FirstName = name;
    }

public static String getLastName() {
        return Person.LastName;
    }
 
public static void setLastName(String name) {
        Person.LastName = name;
    }

public static String getBirthdate() {
        return Person.LastName;
    }
 
public static void seBirthdate(String date) {
        Person.LastName = date;
    }

    
}