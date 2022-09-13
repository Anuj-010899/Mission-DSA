//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class printEncodings {
//    private static int memory[]=new int[101];
//
//    private static int decodeWays(int i, String str) {
//        if(i>=str.length())// i have exhausted the string so return 1
//            return 1;
//        if(memory[i]!=-1) // if already calculated return the ans to avoid TLE.
//            return memory[i];
//
//        int ans=0;
//        int option1= str.charAt(i)-'0';//left call
//        int option2=0;//for right call
//
//        if(i<str.length()-1){// Then only we have only 2 numbers left in string
//            option2=option1*10+(str.charAt(i+1)-'0');
//            //option1*10 for number in tens position
//            //(str.charAt(i+1)-'0') for number in ones position
//        }
//
//        if(option1>0)//if it is 0 then we cant calculate
//            ans+=decodeWays(i+1,str);
//        if(option1>0 && option2>0 && option2<=26 )
//            //if we have "06" as input then after calling the below recursive call
//            //it will consider 0 and 6 and will take F as an answer .So to avoid that we
//            //are checking option1>0
//            ans+=decodeWays(i+2,str);
//
//        return memory[i]=ans;
//
//    }
//    public static void main(String[] args) {
//
//        String str="06";
//
//        Arrays.fill(memory,-1);
//
//        System.out.println(decodeWays(0,str));
//
//
//    }
//
//
//
//}
package Recursion;

import java.util.Arrays;

public class printEncodings {
    private static int memory[]=new int[101];

    private static void decodeWays(int i, String str, String output) {
        if(i>=str.length()){
            System.out.println(new String(output));
            return;
        }

        int option1= str.charAt(i)-'0';//left call
        char op1D=(char) ('a'+option1-1);
        int option2=0;//for right call
        char op2D = 0;

        if(i<str.length()-1){
            option2=option1*10+(str.charAt(i+1)-'0');
            op2D=(char) ('a'+option2-1);

        }

        if(option1>0){
            output+=op1D;
            decodeWays(i+1, str, new String(output));
            output=output.substring(0,output.length()-1);
        }

        if(option1>0 && option2>0 && option2<=26 ){
            output+=op2D;
            decodeWays(i+2, str, new String(output));
            output=output.substring(0,output.length()-1);
        }


    }
    public static void main(String[] args) {

        String str="11111111";
        String output="";
        Arrays.fill(memory,-1);

        decodeWays(0,str,output);


    }



}

