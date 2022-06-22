package Arrays;
import java.util.*;
public class Merge2SortedArraysWithoutUsingSpace {
    public static void main(String[] args) {
        int[] arr1={1,3,5,6,7,0,0,0,0,0,0};
        int[] arr2={2,3,4,5,9,10};

        int len1= 5;
        int len2=arr2.length;

        int i=0;

        while(arr1[len1-1]>arr2[0]){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
            }
            i++;
        }
        for(int s=len1;s<arr1.length;s++){
            arr1[s]=arr2[s-len1];
        }


        for(int k:arr1){
            System.out.print(k+" ");
        }

    }
}
