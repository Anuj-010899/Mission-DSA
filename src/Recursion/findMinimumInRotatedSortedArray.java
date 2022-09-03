package Recursion;

public class findMinimumInRotatedSortedArray {
    private static int findMin(int arr[],int s,int e){
        if(s>=e)
            return arr[s];

        int mid=s+(e-s)/2;

        if(arr[mid]>=arr[0]){
            return findMin(arr,mid+1,e);
        }
        else {
            return findMin(arr,s,mid);
        }

    }
    public static void main(String[] args) {
        int arr[]={11,13,15,17};
        if(arr[0]<arr[arr.length-1]) {// When array is not rotated or after rotating n times it became same
            System.out.println(arr[0]);
            System.exit(0);
        }
        System.out.println(findMin(arr,0,arr.length-1));
    }
}
