package org.example;

import java.util.Scanner;

public class String_reverse_with_without_stringbuffer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
  //Without using String buffer

        String ans="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            ans+=s1.charAt(i);
        }
        System.out.println(ans);

        // Using StringBuffer

        StringBuffer s=new StringBuffer(s1);
        s.reverse();
        System.out.println(s);

    }
}
