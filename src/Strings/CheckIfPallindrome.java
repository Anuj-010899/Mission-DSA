package Strings;
import java.util.*;
public class CheckIfPallindrome {
    private static boolean isValid(char ch) {
        if((ch>='a' && ch <='z')||(ch>='A' && ch <='Z')||(ch>='0' && ch <='9')){
            return true;
        }
        return false;
    }
    private static char toLowerCase(char ch) {
        if((ch>='a' && ch <='z')||(ch>='0' && ch <='9')){
            return ch;
        }
        return Character.toLowerCase(ch);

    }
    private static boolean isPallindrome(StringBuilder temp){
        int s=0;
        int e=temp.length()-1;

        while(s<=e){
            if(temp.charAt(s)!=temp.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="race a car";
        StringBuilder temp=new StringBuilder();
        //faltu character aur space hata diya
        for(int i=0;i<s.length();i++){
            if(isValid(s.charAt(i))){
                temp.append(s.charAt(i));
            }
        }
        //ab sab ko lowercase krdo...

        for(int j=0;j<temp.length();j++){
            temp.setCharAt(j,toLowerCase(temp.charAt(j)));
        }

        System.out.println(isPallindrome(temp));

    }

}
