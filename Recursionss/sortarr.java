package Recursionss;

public class sortarr {
    public static boolean Sortarr(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            
           return Sortarr(arr,idx+1);
        }
        else{
            return false;            
        }
      

    }
    public static void main(String[] args) {
        int arr[]={1,7,5};
        System.out.println(Sortarr(arr,0));
        
    }
 }
