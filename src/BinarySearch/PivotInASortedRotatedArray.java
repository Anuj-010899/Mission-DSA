package BinarySearch;
/*
* Normal Sorted Array->[3,5,7,8,9,12,13,14]
* 3 Times Rotated Array-> [12,13,14,3,5,7,8,9]
* */
public class PivotInASortedRotatedArray {
    static  int getPivot(int arr[],int len){
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
    public static void main(String[] args) {
        int arr[]={12,13,14,3,5,7,8,9};
        int pivot=getPivot(arr,arr.length);
        System.out.println(arr[pivot]);
    }
}
