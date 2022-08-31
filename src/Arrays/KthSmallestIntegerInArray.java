package Arrays;

public class KthSmallestIntegerInArray {
    private static int kthSmallestInteger(int[] arr, int left, int right, int k) {
        int partition=partition(arr,left,right);

        if(partition==k){
            return arr[partition];
        }else if(partition<k){
            return kthSmallestInteger(arr,partition+1,right,k);
        }else{
            return kthSmallestInteger(arr,left,partition-1,k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot=arr[right];
        int pivotLoc=left;
        for(int i=left;i<=right;i++){
            //1,3,2,4,7,5
            if(arr[i]<pivot){
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
        int arr[]={7,10,4,3,20,15};
        int k=3;
        int left=0;
        int right= arr.length-1;

        System.out.println(kthSmallestInteger(arr,left,right,k-1));
    }


}
