package Strings;

public class PalindromicSubstring {
    private static String findPalindrome(String str,int l,int r){
        while(l>=0 && r<str.length()){
            if(str.charAt(l)==str.charAt(r)){
                l--;
                r++;
            }else{
                break;
            }
        }
        return str.substring(l+1,r);
    }
    public static void main(String[] args) {
        String str="babad";

        String res="";

        for(int i=0;i<str.length();i++){
            String s1=findPalindrome(str,i,i);
            String s2=findPalindrome(str,i,i+1);

            res=s1.length()>res.length()?s1:res;
            res=s2.length()>res.length()?s2:res;
        }

        System.out.println(res);
    }
}
