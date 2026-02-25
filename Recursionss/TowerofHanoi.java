package Recursionss;
//T.C=2^(n-1) or 2^(n)
public class TowerofHanoi {
    public static void TOH(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Move disk "+n+" from source "+src+" to destination "+dest);
            return;
        }
        TOH(n-1, src, dest, helper);
        System.out.println("Move disk "+n+" from source "+src+" to destination "+dest);
        TOH(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        TOH(3, "S", "H", "D");
    }
}
