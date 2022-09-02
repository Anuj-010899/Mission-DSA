package Recursion;

public class binarySearch {

    private static int binSearch(int arr[],int s,int e,int key){
        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/2;

        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            return binSearch(arr,mid+1,e,key);
        }else{
            return binSearch(arr,s,mid-1,key);
        }


    }

    public static void main(String[] args) {
        int arr[]={3,4,8,9};

        int key=6;

        System.out.println("The element is found at index "+ binSearch(arr,0,arr.length-1,key));
    }
}
