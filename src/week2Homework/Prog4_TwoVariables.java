package week2Homework;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Prog4_TwoVariables {
    //4.1 Declare two instance and two static variables.
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(a);
        System.out.println(Prog4_TwoVariables.b);
    }

    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Prog4_TwoVariables prog4_twoVariables = new Prog4_TwoVariables();
        System.out.println(prog4_twoVariables.Name);
        System.out.println(prog4_twoVariables.Surname);
        System.out.println(a);
        System.out.println(b);
    }

    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Prog4_TwoVariables programme_4 = new Prog4_TwoVariables();
        programme_4.instanceMethod();
        staticMethod();
    }

}
