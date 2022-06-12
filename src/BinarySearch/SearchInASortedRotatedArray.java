package BinarySearch;
/*
* First Step -> Find Pivot of the sorted rotated Array
* Second Step -> Apply Binary Search to find the key on the right or left part of array.
* */

//import static BinarySearch.PivotInASortedRotatedArray.getPivot;

public class SearchInASortedRotatedArray {
    static int getPivot(int[] arr, int len){
        int s=0;
        int e=len-1;
        int mid=s+(e-s)/2;

        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }
    static int binarySearch(int[] arr, int s, int e, int key){
        int mid=s+(e-s)/2;

        while(s<=e) {
            if(key==arr[mid]){
                return mid;
            }else if(key<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={12,13,14,1,2,3,4,5,6,10};
        int len=arr.length;
        int key=14;
        int ans=-1;

        int pivot=getPivot(arr,len);

        if(key>=arr[pivot] && key<=arr[len-1]){
            ans=binarySearch(arr,pivot,len-1,key);
        }else {
            ans=binarySearch(arr,0,pivot-1,key);
        }

        System.out.println(ans);

    }

}
