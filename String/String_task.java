package org.example;

import java.util.Scanner;

public class String_task {

    public static void concatening(String s1, String s2) {
        String ss = s1 + s2;
        System.out.println("after concataning s1 with s2= " + ss);
    }

    public static void compare_lexico(String s, String s1) {
        int a = s.compareTo(s1);
        if (a > 0) {
            System.out.println("S1 is lexicographically greater S2");
        } else if (a < 0) {
            System.out.println("S2 is lexicographically greater S1");
        } else {
            System.out.println("S1 and S2 are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

// Comparing to string lexicographically
        compare_lexico(s1, s2);
// Concatenation of two String
        concatening(s1, s2);


    }
}
