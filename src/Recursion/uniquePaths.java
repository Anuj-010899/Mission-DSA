package Recursion;
import java.util.HashMap;

public class uniquePaths {
    //Using map to keep record of which paths we have already visited to avoid TLE.
    private static HashMap<String,Integer> map=new HashMap<>();
    private static int solve(int m,int n){
        if(m==1 || n==1)
            return 1;

        String str=m+","+n;

        if(map.containsKey(str)){
            return map.get(str);
        }

        int count=solve(m-1,n)+solve(m,n-1);

        map.put(str,count);

        return count;

    }
    public static void main(String[] args) {
        int m=3,n=3;

        int ans=solve(m,n);

        System.out.println(ans);

    }
}
