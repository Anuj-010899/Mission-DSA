package Recursion;

public class checkPalindrome {
    private static boolean check(String str, int i) {
        if(i>str.length()-1)
            return true;

        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }else{
            i++;
            return check(str,i);
        }
    }
    public static void main(String[] args) {
        String str="AnujjunA";

        System.out.println(check(str,0));
    }


}
