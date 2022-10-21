package week2Homework;
/**
 * Write a Java programme using the following steps.
 *  Declare one instance and one static variable.
 * Declare one instance method.
 *  Declare one static method.
 *  Call both instance and static variables into both instance and static methods inside the print statement.
 *  Declare the Main method.
 *  Call both instance and static methods into the Main method and run the programme.
 */

public class Prog3_Method {
    // Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    // Declare one instance method.
    // Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Prog3_Method.surname);
    }

    // Declare one static method.
    // Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Prog3_Method   programme_3 = new Prog3_Method();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Prog3_Method programme_3 = new Prog3_Method();
        programme_3.instanceMethod();
        staticMethod();
    }
}


