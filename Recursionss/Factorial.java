package Recursionss;

public class Factorial {
    public static void FactNo(int n,int fact){
        if(n==1 || n==0){
            fact*=n;
            System.out.println(fact);
            return;
        }
        fact*=n;
        FactNo(n-1,fact);
    }
    public static void main(String[] args) {
        FactNo(6, 1);
    }
}
