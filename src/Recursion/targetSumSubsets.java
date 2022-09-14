package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;

public class targetSumSubsets {
    private static void solve(int[] arr, int i, int target, int output, ArrayList<LinkedList<Integer>> set,  LinkedList<Integer> subset) {
        if(i==arr.length){
            if(output==target){
                set.add(subset);
            }

            return;
        }

        subset.add(arr[i]);
        solve(arr,i+1,target,output+arr[i],set,new LinkedList<>(subset));
        if(subset.size()>0)
            subset.remove(subset.size()-1);

        solve(arr,i+1,target,output,set,subset);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=60;

        int output=0;
        ArrayList<LinkedList<Integer>> set=new ArrayList<LinkedList<Integer>>();
        LinkedList<Integer> subset=new LinkedList<>();
        int index=0;

        solve(arr,index,target,output,set,subset);

        set.forEach((i)->{
            System.out.println(i);
        });

    }



}
