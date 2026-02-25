package Recursionss;
//stack heigth =logn which is more efficient and fast
public class power2 {
    public static int calculatePower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        //if n:- is even
        if(n%2==0){
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        }
        else{
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        System.out.println(
            calculatePower(2, 4)
        );
    }
}
