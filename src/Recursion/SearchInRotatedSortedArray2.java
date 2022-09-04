package Recursion;

//public class SearchInRotatedSortedArray2 {
//}

//package BinarySearch;
//
public class SearchInRotatedSortedArray2 {
    private static boolean search(int arr[],int s,int e,int key){

        if(s>e){
            return false;
        }

        int mid=s+(e-s)/2;


            if(arr[mid]==key)
                return true;
            if(arr[mid]==arr[e]){// This will handle the duplicates
                e--;
                return search( arr, s, e, key);
            }

            else if(arr[mid]<e){//Right Part is Sorted
                if(key>arr[mid] && key <=arr[e]){
                    return search( arr, mid+1, e, key);
                }else{
                    return search( arr, s, mid-1, key);
                }
            }else{//Left Part is Sorted
                if(key>=arr[s] && key<arr[mid]){
                    return search( arr, s, mid-1, key);
                }else{
                    return search( arr, mid+1, e, key);
                }
            }

    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1};

        int key=2;

        System.out.println(search(arr,0,arr.length-1,key));
    }
}
