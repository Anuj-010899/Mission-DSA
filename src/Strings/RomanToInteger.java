package Strings;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String str="XXIV";

        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);

        int ans=0;

        for(int i=0;i<str.length()-1;i++){
            if(symbolMap.get(str.charAt(i))>= symbolMap.get(str.charAt(i+1))){
                ans+=symbolMap.get(str.charAt(i));
            }else{
                ans-=symbolMap.get(str.charAt(i));
            }
        }

        ans+=symbolMap.get(str.charAt(str.length()-1));

        System.out.println(ans);


    }
}
