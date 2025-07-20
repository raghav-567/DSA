package Recursion;

public class SkipChar {
    public static void main(String[] args) {
        String up = "abcdndaam";
        String neww = " ";
        skip(neww, up);
    }
    public static void skip(String neww ,String up ){
        if(up.isEmpty()){
            System.out.println(neww);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
         skip(neww,up.substring(1));
        }
        else{
            skip(neww + ch , up.substring(1));
        }
    }
}
