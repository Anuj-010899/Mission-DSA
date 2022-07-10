package Strings;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("ABCD"));

        int strings= list.size();
        int min=Integer.MAX_VALUE;
        for (String s : list) {
            min=Math.min(min,s.length());
        }
        boolean match=true;
        String ans="";
        loop1:
        for(int i=0;i<min;i++){
            char ch=list.get(0).charAt(i);
            char ch1 = 0;

            for(int j=1;j<strings;j++){
                ch1=list.get(j).charAt(i);
                if(ch!=ch1){
                    match=false;
                    break loop1;
                }

            }
            ans+=ch1;
        }

//        if(match==false ){
//            System.out.println("NO PREFIX");
//        }
        System.out.println(ans);


    }
}
