package Searching;

import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
    
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the target:: ");
        int target=sc.nextInt();

        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(target+" found at index:- "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

        sc.close();
    }
}
