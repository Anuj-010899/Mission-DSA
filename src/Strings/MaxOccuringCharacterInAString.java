package Strings;

public class MaxOccuringCharacterInAString {
    public static void main(String[] args) {
        String s="emememememememememem";

        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
//            if(currChar>='A' && currChar<='Z'){
//                arr[currChar-'A']++;
//            }else if(currChar>='a' && currChar<='z'){
                arr[currChar-'a']++;

        }
        int max=-1,index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println((char) (index+'a'));

    }
}
