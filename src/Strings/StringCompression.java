package Strings;

public class StringCompression {
    public static void main(String[] args) {
        char ch[]={'a','a','b','b','c','c','c'};
        int len=ch.length;
        int i=0;
        int ansIndex=0;

        while(i<len){
            int j=i+1;
            while(j<len && ch[i]==ch[j] ){
                j++;
            }

            ch[ansIndex++]=ch[i];
            int count=j-i;
            if(count>1){
                String cnt=String.valueOf(count);
               for(int k=0;k<cnt.length();k++){
                   ch[ansIndex++]=ch[k];
               }
            }
            i=j;
        }
        System.out.println(ansIndex);
    }
}
