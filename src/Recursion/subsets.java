package Recursion;

import java.util.*;

public class subsets {
    private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        if(index>= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        //exclude karna hai...
        solve(nums,new ArrayList<>(output),index+1,ans);

        //ab include karna hai...
        int element=nums[index];
        output.add(element);
        solve(nums,output,index+1,ans);
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> output= new ArrayList<Integer>() ;
        int index=0;
        solve(nums,output,index,ans);
        ans.forEach(innerList -> {

            System.out.println(innerList);
        });

    }

}
