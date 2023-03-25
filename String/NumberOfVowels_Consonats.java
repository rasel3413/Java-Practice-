package org.example;

import java.util.Scanner;

public class NumberOfVowels_Consonats {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int vo=0,co=s.length();
        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vo++;
                co--;
            }
        }
        System.out.println("Number of vowels are :"+vo);
        System.out.println("Numbers of consonants are: "+co);
    }
}
