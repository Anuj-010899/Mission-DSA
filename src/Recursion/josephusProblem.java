package Recursion;

import java.util.LinkedList;

public class josephusProblem {
    private static int solve(int n,int k,int i,LinkedList<Integer> ll){
        if(ll.size()==1)
            return ll.getFirst();
        int nextIndex = (i + k - 1) % ll.size();

        ll.remove(nextIndex);

        if(nextIndex>=ll.size()){
            nextIndex=0;
        }

         int ans=solve(n,k,nextIndex,ll);
         return ans;

    }
    public static void main(String[] args) {
       int n=5, k=2;
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=1;i<=n;i++){
            ll.add(i);
        }
       int index=0;


       int ans=solve(n,k,index,ll);
        System.out.println(ans);
    }
}
