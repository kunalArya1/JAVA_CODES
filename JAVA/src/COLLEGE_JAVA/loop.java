package COLLEGE_JAVA;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        for (int i = 1; i <a ; i++) {
            System.out.println(i);
        }
    }
}
