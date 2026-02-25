package Recursionss;

public class Print1to5 {
    public static void PrintNumb2(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNumb2(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        PrintNumb2(n);
    }
}
