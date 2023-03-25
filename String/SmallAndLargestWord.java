package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SmallAndLargestWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        StringTokenizer token=new StringTokenizer(s1);
        String small = null,large = null;
        int mx=0,mn=Integer.MAX_VALUE;

        while(token.hasMoreTokens())
        {
            String ss=token.nextToken();
            int d=ss.length();
            if(d>mx)
            {
                mx=d;
                large=ss;
            }
            if(d<mn)
            {
                mn=d;
                small=ss;
            }
        }
        System.out.println("Smallest word :"+small);
        System.out.println("Largest word :"+large);

    }
}
