package Recursion;

import java.util.*;

public class keypadProblem {
    private static void solve(String str, List<String> ans, int index, String output, String[] mapping) {
        if(index>=str.length()){
            ans.add(new String(output));
            return;
        }

        int digit= str.charAt(index)-'0';
        //System.out.println(digit);
        String value=mapping[digit];
        System.out.println(value);
        for(int i=0;i<value.length();i++){
            output+=value.charAt(i);
            solve(str,ans,index+1,new String(output),mapping);
            output=output.substring(0,output.length()-1);
        }

    }
    public static void main(String[] args) {
        String str="234";

        if(str.length()==0){
            System.out.println("Not Found");
            System.exit(0);
        };

        List<String> ans=new ArrayList<>();
        int index=0;
        String output="";

        String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        solve(str,ans,index,output,mapping);

        for(String s:ans){
            System.out.println(s);
        }
    }


}
