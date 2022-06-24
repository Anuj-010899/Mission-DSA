package Arrays;
import java.util.*;
import  java.math.*;
public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        int len= arr.length;
        int left[]=new int[len];
        int right[]=new int[len];

        left[0]=arr[0];
        for(int i=1;i<len;i++){
            if(arr[i]>left[i-1]){
                left[i]=arr[i];
            }else {
                left[i] = left[i - 1];
            }
        }
        right[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--){
            if(arr[i]>right[i+1]){
                right[i]=arr[i];
            }else {
                right[i] = right[i + 1];
            }
        }
        int waterTrapped=0;
        for(int i=0;i<len;i++){
            waterTrapped+=Math.min(left[i],right[i])-arr[i];
        }

        System.out.println(waterTrapped);

    }
}
