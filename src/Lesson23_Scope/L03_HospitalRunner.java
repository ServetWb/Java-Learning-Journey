package Lesson23_Scope;

public class L03_HospitalRunner {
    public static void main(String[] args) {

        // Creating the first staff object from C03_Hospital class
        L03_Hospital staff1 = new L03_Hospital();

        // Accessing instance and static variables through staff1
        System.out.println(staff1.staffName);        // Output: name not assigned
        System.out.println(staff1.staffAddress);     // Output: address not assigned
        System.out.println(staff1.hospitalName);     // Output: Yildiz Hospital
        System.out.println(staff1.chiefPhysician);   // Output: Dr. Eda

        // Setting instance variable values for staff1
        staff1.staffName = "Fulya";
        staff1.staffAddress = "Fulya / Istanbul";
        staff1.staffPhone = "5321232334";

        // Creating a second staff object
        L03_Hospital staff2 = new L03_Hospital();

        // Setting instance variable values for staff2
        staff2.staffName = "Sevda";
        staff2.staffAddress = "Besiktas";
        staff2.staffPhone = "5454565667";

        // Changing static variables through staff2
        staff2.chiefPhysician = "Dr. Merve";         // Affects ALL objects
        staff2.hospitalAddress = "Istanbul";         // Affects ALL objects

        // Verifying how static variables affect all objects (even if changed via staff2)
        System.out.println(staff1.hospitalAddress);  // Output: Istanbul (changed by staff2)
        System.out.println(staff1.staffName);        // Output: Fulya (unique to staff1)
        System.out.println(staff1.chiefPhysician);   // Output: Dr. Merve (changed by staff2)
        System.out.println(staff1.staffAddress);     // Output: Fulya / Istanbul

    }
}

