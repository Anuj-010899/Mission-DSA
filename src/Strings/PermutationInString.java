package Strings;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s2="eidboaoo";
        String s1="ab";
        int count1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
        }
        int i=0;
        int windowSize=s1.length();
        int count2[]=new int[26];
        while(i<windowSize && i<s2.length()){
            count2[s2.charAt(i)-'a']++;
            i++;
        }
        if(Arrays.equals(count1,count2)){
            System.out.println(true);
            System.exit(0);
        }
        while(i<s2.length()){
            char newChar=s2.charAt(i);
            count2[newChar-'a']++;

            char oldChar=s2.charAt(i-windowSize);
            count2[oldChar-'a']--;
            i++;
            if(Arrays.equals(count1,count2)){
                System.out.println(true);
                System.exit(0);
            }

        }

        System.out.println(false);

    }
}
