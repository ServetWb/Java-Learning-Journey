package Lesson23_Scope;

public class L04_Hospital {

     /*
        Among the variables created at the class level,
        those that we want to have the SAME value for ALL OBJECTS should be declared as static.

        Those that we want to have a SEPARATE value for EACH OBJECT should be defined as instance variables.
     */

    // Static variables: Shared across all objects
    static String hospitalName = "Yildiz Hospital";
    static String hospitalAddress = "Cankaya";
    static String hospitalPhone = "3122343434";
    static String chiefPhysician = "Dr. Eda";

    // Instance variables: Each object will have its own copy
    String staffName = "name not assigned";
    String staffAddress = "address not assigned";
    String staffPhone = "phone not assigned";
}
