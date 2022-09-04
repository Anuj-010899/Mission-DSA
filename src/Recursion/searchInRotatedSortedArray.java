package Recursion;

public class searchInRotatedSortedArray {
    private static int binarySearch(int arr[],int s,int e,int key){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            return binarySearch(arr,s,mid-1,key);
        }else{
            return binarySearch(arr,mid+1,e,key);
        }
    }
    private static int getPivot(int arr[],int s,int e){
        if(s>=e){
            return s;
        }
        int mid=s+(e-s)/2;
        //[1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1]
        if(arr[mid]>arr[e]){
            return getPivot(arr,mid+1,e);
        }else if(arr[mid]<arr[e]){
            return getPivot(arr,s,mid);
        }else{
            e--;
            return getPivot(arr,s,e);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,9,1,2,3,4,5};
        int key=2;

        int pivot=getPivot(arr,0,arr.length-1);
        System.out.println(pivot);

        if(key>=arr[pivot] && key<=arr[arr.length-1]){
            System.out.println(binarySearch(arr,pivot,arr.length-1,key));
        }else{
            System.out.println(binarySearch(arr,0,pivot-1,key));
        }

    }
}
