package Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="a";
        if(s.length()<=1){
            System.out.println(s);
            System.exit(0);
        }
        int i=0;
        int j=1;
        while(i<s.length() && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                if(i==0){
                    s=s.substring(j+1);
                }else{
                    s=s.substring(0,i)+s.substring(j+1);
                    i--;
                    j--;
                }
            }else{
                i++;
                j++;
            }
        }

        System.out.println(s);
    }
}
