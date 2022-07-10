package Strings;

import java.util.ArrayList;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s="a                               m    the mean teaj    ki  ";
        s=s.trim();
        int i=s.length()-1;
        int j=i;
        String ans="";

        while(j>=0 ){
               if((int) s.charAt(j)==32 || j==0){
                   if(j==0){
                       if(s.substring(j,i+1).trim().length()!=0)
//                            list.add(s.substring(j,i+1));
                           ans=ans+s.substring(j,i+1)+" ";

                   }else{
                       if(s.substring(j+1,i+1).trim().length()!=0)
//                            list.add(s.substring(j+1,i+1));
                           ans=ans+s.substring(j+1,i+1)+" ";
                   }
                   i=j;
               }
               j--;
        }
        String test="     ";
        System.out.println(test.trim().length());



        
    }
}
