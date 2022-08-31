package Arrays;

import org.w3c.dom.ls.LSOutput;

public class KthLargestElementInArray {
    private static int KthLargestElement(int[] arr, int left, int right, int k,int len) {

        int partition=partition(arr,left,right);
        //1,2,3,4,5,6,7
        if(partition==k){
            return arr[partition];
        }else if(partition<k){
            return KthLargestElement(arr,partition+1,right,k,len);
        }else{
            return KthLargestElement(arr,left,partition-1,k,len);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot=arr[right];
        int pivotLoc=left;

        for(int i=left;i<right;i++){
            if(arr[i]>pivot){
                int temp=arr[i];
                arr[i]=arr[pivotLoc];
                arr[pivotLoc]=temp;
                pivotLoc++;
            }
        }
        int temp=arr[right];
        arr[right]=arr[pivotLoc];
        arr[pivotLoc]=temp;

        return pivotLoc;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        int left=0;
        int right= arr.length-1;
        int len=arr.length;

        System.out.println(KthLargestElement(arr,left,right,k-1,len));
    }



}
