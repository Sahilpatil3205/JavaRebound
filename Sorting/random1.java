package Sorting;

import java.util.*;

class random {
    public static int search(int[] nums, int target) {
        int f=0,l=nums.length-1;
         boolean found=false;
        while(f<=l){
            int mid=(f+l)/2;

            if(nums[mid]==target){
                System.out.println(mid);
                found=true;
            }
            if(target>nums[mid]){
                f=mid+1;
            }
            if(target<nums[mid]){
                l=mid-1;
            }
        }
        if(!found){
            System.out.println("not found");
        }
        return -1;

    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         Arrays.sort(nums);
        int target=sc.nextInt();
        search(nums,target);
}
}