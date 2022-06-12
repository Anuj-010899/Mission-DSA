package BinarySearch;

import java.util.Arrays;

public class AggressiveCowsProblem {
     static boolean isPossible(int[] arr,int mid,int k){
        int cowsCount=1;
        int prevPos=arr[0];//Taking the initial position of first cow at arr[0]

        for(int i=0;i< arr.length;i++){
            if(arr[i]-prevPos>=mid){//checking if the position of second cow >=mid
                cowsCount++;
                if(cowsCount==k){//if all cows are arranged then return true
                    return true;
                }
                prevPos=arr[i];
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr={4,2,1,3,6}; //Arrays containing position number of stalls
        int k=2; //No. Of Cows

        Arrays.sort(arr);
        int max=-1;
        for(int i:arr){
            if(i>max) max=i;
        }
        int s=0;
        int e=max;
        int mid=s+(e-s)/2;
        int ans=-1;

        while(s<=e){
            if(isPossible(arr,mid,k)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }

        System.out.println(ans);
    }
}
