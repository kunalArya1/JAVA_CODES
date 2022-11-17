package COLLEGE_JAVA;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a= sc.nextInt();
        System.out.println("Enter second number : ");
        int b= sc.nextInt();
        //Assignment operator
       // (+,-,*,/,%)

        //For addition
        System.out.println("Addition of given numbers is : "+(a+b));
        //for substraction
        System.out.println("Subtraction of given numbers is :  "+(a-b));
        //for multipaction
        System.out.println("Multiplaction of given numbers is : "+(a*b));
        //for division
        System.out.println("Division of given numbers is : "+(a/b));
        //for modouls
        System.out.println("Moduls of given numbers is : "+(a%b));
    }
}
