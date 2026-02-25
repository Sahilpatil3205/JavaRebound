package Strings;

public class Compression {
    public static String  compression(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count;
            }
        }
        return newStr;

    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compression(str));
        
    }
}

//Using stringbuilder--

// public static String compression(String str) {
//     StringBuilder newStr = new StringBuilder();
//     for (int i = 0; i < str.length(); i++) {
//         int count = 1;
//         while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//             count++;
//             i++;
//         }
//         newStr.append(str.charAt(i));
//         if (count > 1) {
//             newStr.append(count);
//         }
//     }
//     return newStr.toString();
// }
