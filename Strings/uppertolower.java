package Strings;

import java.util.Scanner;

public class uppertolower {
    public static void UppertoLowercase(String name) {
        char s[]=name.toCharArray();
        for(int i=0;i<s.length;i++){
            char c=s[i];
            if(c>='A' &&  c<='Z'){
                char ansch=(char)(c-'A'+'a');//to get lowercase letter
                s[i]=ansch;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        UppertoLowercase(name);
        sc.close();    
    }
}
