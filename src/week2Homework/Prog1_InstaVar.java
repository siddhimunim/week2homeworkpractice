package week2Homework;
/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Prog1_InstaVar {
    //declare two instance variable
    int a =10;
    int b= 20;
    // declare instance method
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //declare main method
    public static void main(String[] args) {
        Prog1_InstaVar prog1_instaVar = new Prog1_InstaVar();
        prog1_instaVar.instanceMethod();
    }


}
