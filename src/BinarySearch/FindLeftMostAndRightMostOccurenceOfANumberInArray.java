package BinarySearch;

public class FindLeftMostAndRightMostOccurenceOfANumberInArray {

    static int leftOccurence(int[] arr,int n,int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;
//        {0,1,2,3,4,4,4,4,4,4,4,4,4,4,5,6,9,10}
        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }else if(key<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    static int rightOccurence(int[] arr,int n,int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;
//        {0,1,2,3,4,4,4,4,4,4,4,4,4,4,5,6,9,10}
        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }else if(key<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,4,4,4,4,4,4,4,4,4,5,6,9,10};

        int key=4;

        int leftIndex=leftOccurence(arr,arr.length,key);
        int rightIndex=rightOccurence(arr, arr.length,key);
        System.out.println(leftIndex);
        System.out.println(rightIndex);

    }
}
