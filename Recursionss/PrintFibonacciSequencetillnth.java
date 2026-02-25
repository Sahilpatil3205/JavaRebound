package Recursionss;

public class PrintFibonacciSequencetillnth {
    public static void Fibonacci(int a,int b,int n){
        if(n==0){
            return;

        }
        int c=a+b;
        System.out.println(c);
        Fibonacci(b, c, n-1);

    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        Fibonacci(a, b, n-2);
    }

}
