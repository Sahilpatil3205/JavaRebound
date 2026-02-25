package Strings;

import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        boolean isPalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                isPalindrome=false;
            }
        }
            if(isPalindrome==true){
                System.out.println("The string is a palindrome");
                
            }
            else{
                System.out.println("The string is not a palindrome");
                }
            
        
        sc.close();
    }
}