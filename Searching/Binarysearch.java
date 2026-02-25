package Searching;

import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={5,8,12,45,67,21,9,71,7,10};

        Arrays.sort(a);

        System.out.println("Sorted array is");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the element you want to search:: ");
        int search=sc.nextInt();
        int f=0,l=a.length-1;
        boolean found=false;
        while(f<=l){
            int mid=(f+l)/2;
            if(a[mid]==search){
                System.out.println(search+" is found at:- "+mid);
                found=true;
                break;
            }
            if(search>a[mid]){
                f=mid+1;
            }
            if(search<a[mid]){
                l=mid-1;
            }
        }
        if(found==false){
            System.out.println(search+" is not found.");
        }
        sc.close();
    }

    
}
