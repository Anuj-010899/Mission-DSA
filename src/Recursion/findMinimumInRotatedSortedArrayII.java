package Recursion;

public class findMinimumInRotatedSortedArrayII {

    private static int findMin(int[] arr, int s, int e) {
        if(s>=e){
            return arr[s];
        }

        int mid=s+(e-s)/2;
        if(arr[mid]<arr[e]){
            //e=mid;
            return findMin(arr,s,mid);
        }else if(arr[mid]>arr[e]){
            //s=mid+1;
            return findMin(arr,mid+1,e);
        }else{
            e--;
            return findMin(arr,s,e);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        if(arr.length==1 || arr[0]<arr[arr.length-1]) {
            System.out.println(arr[0]);
            System.exit(0);
        }
        if(arr.length==2){
            System.out.println(Math.min(arr[0],arr[1]));
            System.exit(0);
        }

        System.out.println(findMin(arr,0,arr.length-1));

    }

}
