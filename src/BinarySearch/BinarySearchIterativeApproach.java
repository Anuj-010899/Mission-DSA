package BinarySearch;

public class BinarySearchIterativeApproach {

    static int binarySearch(int[] arr, int n,int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

            mid=start+(end-start)/2;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr={12,34,56,78,90};
        int key=12;
        int index=binarySearch(arr,arr.length,key);

        System.out.println(index);
    }
}
