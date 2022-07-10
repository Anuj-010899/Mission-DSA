package Arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={2,7,6,4,1,3};
        int largest=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>largest){
                largest=arr[i];
                list.add(largest);
            }
        }

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" ");
        }


    }
}
