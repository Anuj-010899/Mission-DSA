package BinarySearch;

public class FrequencyInASortedArray {
    static int leftOccur(int[] arr,int n,int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;

        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    static int rightOccur(int[] arr,int n,int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;

        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3,3,3,4,4,5};
        int n=arr.length;
        int key=3;
        int leftIndex=leftOccur(arr,n,key);
        int rightIndex=rightOccur(arr,n,key);


        System.out.println(rightIndex!=-1? rightIndex-leftIndex+1 : 0);
    }
}
