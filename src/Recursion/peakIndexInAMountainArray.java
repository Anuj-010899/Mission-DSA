package Recursion;

public class peakIndexInAMountainArray {
    private static int findPeaKIndex(int arr[],int len,int s,int e){
        if(s>=e){
            return s;
        }

        int mid=s+(e-s)/2;

        if(arr[mid]<=arr[mid+1])
            return findPeaKIndex(arr,len,mid+1,e);
        else
            return findPeaKIndex(arr,len,s,mid);


    }
    public static void main(String[] args) {
        int arr[]={1,4,0};

        System.out.println(findPeaKIndex(arr,arr.length,0,arr.length-1));
    }
}
