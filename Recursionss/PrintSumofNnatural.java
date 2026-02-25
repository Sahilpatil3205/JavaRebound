package Recursionss;

public class PrintSumofNnatural {
    public static void SumNo(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SumNo(i+1,n,sum);
    //     System.out.println(sum);
    }
    public static void main(String[] args) {
        SumNo(1,5,0);
    }
}
