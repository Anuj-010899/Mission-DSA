package Recursion;

public class isSubsequence {

    private static int solve(String str1, String str2,int i,int j) {
        if(i>=str1.length() || j>=str2.length())
            return 0;

        if(str1.charAt(i)==str2.charAt(j)){
            return 1+solve(str1,str2,i+1,j+1);
        }else{
            return solve(str1,str2,i,j+1);
        }
    }
    public static void main(String[] args) {
        String str1="abc";
        String str2="aghbdc";
        int i=0,j=0;

        int ans=solve(str1,str2,i,j);

        System.out.println(ans);
    }

}
