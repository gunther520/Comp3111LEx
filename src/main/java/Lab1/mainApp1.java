package Lab1;


/* Comp3111LEx\Lab\mainApp1.java
        main Application for Lab1 exercise */

public class mainApp1 {

    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println(b + " to power " + n + "=" + myLibrary.Power(b, n));
        System.out.println(n + "! = " + myLibrary.factorial(n));
        System.out.println("Program ..Ended ...");
    }
}
