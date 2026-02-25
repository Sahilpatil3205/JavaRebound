package Recursionss;
//here stack heigth is n
public class power {
    public static int calcPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xcalpown1=calcPow(x, n-1);
        int xPown=x*xcalpown1;
        return xPown;
    }
    public static void main(String[] args) {
        System.out.println(calcPow(2,5));
    }
}
