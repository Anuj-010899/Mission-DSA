package Strings;

public class ConvertToPalindrome {
    private static boolean pallindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="adbbdca";
        int i=0,j=str.length()-1;
        int count=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Possible");
        }

        String s1=str.substring(i,j);
        String s2=str.substring(i+1,j+1);

        if(pallindrome(s1)||pallindrome(s2)){
            System.out.println("Possible");
        }else{
            System.out.println("Not Possible");
        }

        String s="abcd";
        System.out.println(s.substring(1,2));

    }
}
