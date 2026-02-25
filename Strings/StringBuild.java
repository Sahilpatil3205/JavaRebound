package Strings;


public class StringBuild {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder ("Sahil");

        //print
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'A');
        System.out.println(sb);

        //insert
        sb.insert(0,'S');
        System.out.println(sb);

        //delete
        sb.deleteCharAt(1);
        System.out.println(sb);

        //append
        sb.append(" Patil");
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        //reverse
        sb.reverse();
        System.out.println(sb);
            
    }
    
}
