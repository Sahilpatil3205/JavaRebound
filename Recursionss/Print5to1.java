package Recursionss;


public class Print5to1 {
    public static void Printnumb(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        Printnumb(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        Printnumb(n);
    }
    
}
