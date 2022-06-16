package BinarySearch;
import java.util.*;
import java.lang.*;

public class EkoSpoj
{
    static boolean isPossible(int arr[],int n,int m,int mid){
        int sum=0;

        for(int i=0;i<n;i++){
            if(arr[i]>mid){
                sum+=(arr[i]-mid);
            }
        }

        if(sum>=m){
            return true;
        }else{
            return false;
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n];

        int max=-1;

        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
            if(temp>max) max=temp;
        }

        int s=0;
        int e=max;
        int ans=-1;

        int mid=s+(e-s)/2;

        while(s<=e){
            if(isPossible(arr,n,m,mid)){
                s=mid+1;
                ans=mid;
            }else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }

        System.out.println(ans);
    }
}

