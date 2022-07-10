package Strings;

public class LeftMostCharacterThatRepeatsInAString {
    public static void main(String[] args) {
        String s="go";

        int arr[]=new int[26];
        int len=s.length();

        for(int i=0;i<len;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<len;i++){
            if(arr[s.charAt(i)-'a']>=2){
                System.out.println(s.charAt(i));
                System.exit(0);
            }
        }
        System.out.println('#');

    }
}
