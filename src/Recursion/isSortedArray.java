package Recursion;

public class isSortedArray {
    private static boolean isSorted(int arr[],int size){
        if(size==0 || size == 1){
            return true;
        }

        if(arr[size-1]<arr[size-2]){
            return false;
        }

        return isSorted(arr,size-1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,7,9,10};
        int size=arr.length;

        System.out.println(isSorted(arr,size));
    }
}
