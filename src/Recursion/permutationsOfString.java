package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutationsOfString {
    private static void solve(List<Integer> nums, List<List<Integer>> ans, int index) {
        if(index>=nums.size()){
            ans.add(new ArrayList<Integer>(nums));
            return;
        }

        for(int j=index;j< nums.size();j++){
            int temp=nums.get(index);
            nums.set(index,nums.get(j));
            nums.set(j,temp);

            solve(new ArrayList<Integer>(nums),ans,index+1);

            temp=nums.get(index);
            nums.set(index,nums.get(j));
            nums.set(j,temp);

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,1};
        List<Integer> nums=new ArrayList<>();

        for(int i:arr)
            nums.add(i);

        int index=0;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        solve(nums,ans,index);

        ans.forEach(innerList->{
            System.out.println(innerList);
        });

    }


}

// Permutations-II without duplicates

//package Recursion;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class permutationsOfString {
//    private static void solve(List<Integer> nums, List<List<Integer>> ans, int index) {
//        if(index>=nums.size()){
//            if(!ans.contains(new ArrayList<Integer>(nums)))
//                ans.add(new ArrayList<Integer>(nums));
//            return;
//        }
//        Set<Integer> set = new HashSet<>();
//        for(int j=index;j< nums.size();j++){
//            if(set.add(nums.get(j))){
//                int temp=nums.get(index);
//                nums.set(index,nums.get(j));
//                nums.set(j,temp);
//
//                solve(new ArrayList<Integer>(nums),ans,index+1);
//
//                temp=nums.get(index);
//                nums.set(index,nums.get(j));
//                nums.set(j,temp);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[]={1,2,1};
//        List<Integer> nums=new ArrayList<>();
//
//        for(int i:arr)
//            nums.add(i);
//
//        int index=0;
//        List<List<Integer>> ans=new ArrayList<List<Integer>>();
//        HashSet<Integer> set=new HashSet<>();
//        solve(nums,ans,index);
//
//        ans.forEach(innerList->{
//            System.out.println(innerList);
//        });
//
//    }
//
//
//}

