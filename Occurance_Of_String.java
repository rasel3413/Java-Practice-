package org.example;

import java.util.Scanner;

public class Occurance_Of_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String ocr=scanner.nextLine();
        int cnt=0;
        int i=-1;
        i=s.indexOf(ocr);
        while(i!=-1)
        {
            cnt++;
            i=s.indexOf(ocr,i+1);

        }
        System.out.println("The string "+"\"ocr\" "+"occurs in the main string  "+cnt+" times");
    }
}
