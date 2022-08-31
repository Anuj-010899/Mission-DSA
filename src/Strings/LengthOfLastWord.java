package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="";

        int i=str.length()-1;
        int count=0;

        while(str.charAt(i)!=' '  ){
            if(i==0){
                count++;
                break;
            }
            count++;
            i--;
        }

        System.out.println(count);


    }
}
