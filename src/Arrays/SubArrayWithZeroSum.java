package Arrays;
import java.util.*;
public class SubArrayWithZeroSum {
    public static int countSubarrays(int n, int[] arr) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int count=0;
        //{-1,0,1,-1}
        //HashSet=-1,0
        //count=3
        //sum=-1
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(set.contains(sum) || sum==0|| arr[i]==0){
                System.out.println(i+" "+sum);
                count++;
            }
            set.add(sum);
        }
//        set.forEach((i)->{
//            System.out.print(i+" ");
//        });
        return count;

    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,-1};
        System.out.println();
       System.out.println( countSubarrays(arr.length,arr));

    }
}
