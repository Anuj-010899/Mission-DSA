package Strings;
import java.util.*;

public class ZigZagStrings {
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        int n=4;

        String arr[]=new String[n];
        Arrays.fill(arr,"");
        int curRow=0;int mod=1;

        for(int i=0;i<str.length();i++){
            arr[curRow]=arr[curRow]+str.charAt(i);
            if(curRow==0){
                mod=1;
            }
            if(curRow==n-1){
                mod=-1;
            }
            curRow+=mod;
        }
        str="";

        for( String s: arr){
         str+=s;
        }
        System.out.println(str);

    }
}
