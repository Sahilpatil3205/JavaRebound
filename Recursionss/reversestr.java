package Recursionss;

public class reversestr {
    public static void Stringrev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Stringrev(str, idx-1);

    }
    public static void main(String[] args) {
        String name="abcd";
        System.out.println(name);
        Stringrev(name,name.length()-1);
        
    }
}
