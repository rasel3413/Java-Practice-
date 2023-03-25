package org.example;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Remove_duplicate_char {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        String ans="";
        ConcurrentHashMap<Character,Integer>mp=new ConcurrentHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int val=0;
            if(mp.containsKey(ch))
            {
                val=mp.get(ch);

            }
            val++;
            mp.put(ch,val);

            if(val==1)
            {
                ans=ans+ch;
            }
        }
        System.out.println(ans);

    }
}
