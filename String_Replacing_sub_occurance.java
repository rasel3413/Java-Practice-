package org.example;

import java.util.Scanner;

public class String_Replacing_sub_occurance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     String s,sub,result="";
     s=scanner.nextLine();
     sub=scanner.nextLine();
     int i=0;
     while(i!=-1)
     {
         i=s.indexOf(sub);
         if(i!=-1)
         {
             result=s.substring(0,i);
             result=result+"@";
             result=result+s.substring(i+sub.length());
             s=result;
         }
     }
        System.out.println(result);
    }
}
