package Strings;

public class AmazingSubstrings {
    public static void main(String[] args) {
        String str="ABECahubEeio";
        int count=0;
        int len=str.length();

        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count+=len-i;
            }
        }

        System.out.println(count % 10003);
    }
}
