package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,8,9};
        int key=5;
        int len= arr.length;
        int s=0;
        int e=len-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(arr[mid]==key){
                System.out.println("True");
            }
            if(arr[mid]>key){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        System.out.println("Out Of Loop"+ " Index is: "+ mid);

    }
}
