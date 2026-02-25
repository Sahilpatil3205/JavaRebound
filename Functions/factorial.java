package Functions;

import java.util.*;

public class factorial {
    public static void factorialno(int n){
        int fact=1;
        if(n==0){
            System.out.println("Factorial of 0 is 1");
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorialno(n);
        sc.close();
    }
    
}
