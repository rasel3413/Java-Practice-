package org.example;

import java.util.Scanner;

public class Remove_duplicate_char {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int dd=ans.indexOf(ch);
            if(dd==-1)
            {
                ans=ans+ch;
            }
        }
        System.out.println(ans);

    }
}
