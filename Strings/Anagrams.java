package Strings;
import java.util.Arrays;

public class Anagrams{
    public static void anagram(String str1,String str2) {
        
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram.");
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        
    }
    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        anagram(str1,str2);

        
    }

}