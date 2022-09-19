package Strings;

public class reverseAndRepeat {
    private static String solve(String s){
        int start,end;
        //int len=s.length();
        for(int i=0;i<s.length();i++){

            if(Character.isDigit(s.charAt(i))){
                start=i;end=i;int k=start;
                while(Character.isDigit(s.charAt(k))){//Finding the start and end index of number
                    end=k;
                    k++;
                    if(k==s.length())// If last index reached
                        break;
                }

                int num=Integer.parseInt(s.substring(start,end+1));// Extracting the number...
                //int num=Integer.parseInt(s.charAt(i));
                String to_Append=s.substring(start-1,start).repeat(num); //Repeating the character

                int len=s.length();// Calculating the length before conversion to avoid arrayOutOfBound

                s=s.substring(0,start-1)+to_Append+s.substring(end+1);

                if(i!=len-1){
                    i+=num-2;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str="hacker2ank of world the to welcome anu3j hi";

        String strArr[]=str.split(" ");

        for(int i=0;i< strArr.length;i++){
            strArr[i]=solve(strArr[i]);
        }

        int i=0;int j= strArr.length-1;
        while(i<=j){
            String temp=strArr[i];
            strArr[i]=strArr[j];
            strArr[j]=temp;
            i++;
            j--;
        }
        System.out.println(String.join(" ",strArr));
    }
}
