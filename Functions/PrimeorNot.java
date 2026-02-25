package Functions;

import java.util.*;

public class PrimeorNot {
    public static void Isprime(int n) {
        
        if(n<=1){
            System.out.println("Not Prime");
        }
        if(n==2){
            System.out.println("Is Prime");
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Is Not Prime");
                isPrime=false;
                return;
            }
        }
        if(isPrime==true){
            System.out.println("Number is Prime.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:: ");
        int n=sc.nextInt();
        Isprime(n);
        sc.close();

    }
}
