package Strings;
import java.util.*;

public class reversevowels {
    public static void reverseVowels(String name) {
        char[] arr = name.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println(new String(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        reverseVowels(name);
        sc.close();
    }
}
