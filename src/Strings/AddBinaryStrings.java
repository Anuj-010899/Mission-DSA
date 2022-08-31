package Strings;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        int alen=a.length();//2
        int blen=b.length();//1
        String ans="";
        int carry=0,i=0;

        while(i<alen|| i<blen || carry!=0){
            int x=0;
            if(i<alen && a.charAt(alen-i-1)=='1'){
                x=1;
            }
            int y=0;
            if(i<blen && b.charAt(blen-i-1)=='1'){
                y=1;
            }
            ans=Integer.toString((x+y+carry)%2)+ans;
            carry=(x+y+carry)/2;
            i++;
        }

        System.out.println(ans);

    }
}
