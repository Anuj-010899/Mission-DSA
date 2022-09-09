package Recursion;

import java.util.ArrayList;

public class subSequenceOfStrings {
    private static void solve(String s, ArrayList<String> ans, String output, int index) {
        if(index>=s.length()){
            ans.add(new String(output));
            return;
        }

        //exclude kardo yaar
        solve(s,ans,new String(output),index+1);

        //include kardo yaar
        char element = s.charAt(index);
        output+=element;
        solve(s,ans,output,index+1);
    }
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> ans=new ArrayList<>();
        String output="";
        int index=0;

        solve(s,ans,output,index);

        for(String i:ans){
            System.out.println(i);
        }

    }


}
