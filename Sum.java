package com.company;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
