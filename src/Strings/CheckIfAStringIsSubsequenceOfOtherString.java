package Strings;

public class CheckIfAStringIsSubsequenceOfOtherString {
    public static void main(String[] args) {
        String s1="paabcbbcd";
        String s2="";

        int i=0;
        int k=0;
        int flag=0;

        while(k<s2.length()){
            for(;i<s1.length();i++){
                if(s2.charAt(k)==s1.charAt(i)){
                    flag=1;
                    i++;
                    break;
                }
            }
            if(flag==0){
                System.out.println("False");
                System.exit(0);
            }
            k++;
            flag=0;
        }
        System.out.println(true);
    }
}
