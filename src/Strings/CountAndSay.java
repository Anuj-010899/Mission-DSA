package Strings;

public class CountAndSay {
    public static void main(String[] args) {
        int n=5;

        if(n==1){
            System.out.println(1);
        }
        if(n==2){
            System.out.println(11);
        }
        String s="11";
        for(int i=3;i<=n;i++){

            String t="";
            int count=1;
            s=s+'&';
            for(int j=1;j<s.length();j++){

                if(s.charAt(j-1)!=s.charAt(j)){
                    t+=count;

                    t+=s.charAt(j-1);
                    count=1;
                }else{
                    count++;

                }
            }
            s=t;
        }
        System.out.println(s);
    }
}
