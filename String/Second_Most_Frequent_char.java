package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second_Most_Frequent_char {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        int mx=0,mx1=0;
        char ch=' ',ch1=' ';
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            int val=0;
            if(mp.containsKey(s1.charAt(i)))
            {
                val=mp.get(s1.charAt(i));
            }
            mp.put(s1.charAt(i),val+1);

        }
       for(int i=0;i<s1.length();i++)
       {
           char ch2=s1.charAt(i);
           int d=mp.get(ch2);
           if(d>mx1)
           {
               if(d>=mx)
               {
                   if(ch==' '){
                       ch=ch2;
                   mx=d;
                   continue;
                   }
                   else if(d==mx){
                       if(ch2!=ch)
                       {

                           mx1=d;
                           ch1=ch;
                       }
                   }
                   else{
                       ch1=ch;
                       mx1=mx;
                       ch=ch2;
                       mx=d;
                   }
               }
               else if(d>mx1)
               {
                   mx1=d;ch1=ch2;
               }

           }
       }
       if(ch1==' '){
           System.out.println("there is no second most frequent character");
       }
       else
        System.out.println("The second most frequent character is = "+ch1);
    }
}
