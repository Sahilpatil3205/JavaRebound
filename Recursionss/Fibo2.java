package Recursionss;

public class Fibo2 {
    public static void Fibo(int i,int n,int a,int b){
        if(i>n){
            return;
        }
        System.out.println(a);
        Fibo(i+1,n,b,a+b);

    }
    public static void main(String[] args) {;
        int i=1;
        int n=7;
        Fibo(i, n,0,1);
    }
}
