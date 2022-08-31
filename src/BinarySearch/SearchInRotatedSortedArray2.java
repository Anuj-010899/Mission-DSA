package BinarySearch;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int arr[]={10,1,10,10,10};
        int s=0;
        int e=arr.length-1;

        int mid=s+(e-s)/2;

//        if(arr.length==1) return arr[0];
//        if(arr.length==2) return Math.min(arr[0],arr[1]);
//        if(arr[s]<arr[e]) return arr[0];

        while(s<e){
            if(arr[mid]<arr[e]){
                e=mid;
            }else if(arr[mid]>arr[e]){
                s=mid+1;
            }else{
                e--;
            }
            mid=s+(e-s)/2;
        }

        System.out.println(arr[e]);
    }
}
