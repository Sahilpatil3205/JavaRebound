package Strings;
import  java.util.*;
public class removevowels {
    public static void Removevowels(String name){
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Removevowels(name);
        sc.close();
    }
}
