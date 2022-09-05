package Recursion;

public class BookAllocationProblem {
    private static boolean isPossible(int[] arr, int mid, int m, int n) {
        int pageCount=0;
        int personCount=1;
        for(int i=0;i<n;i++){
            if(pageCount+arr[i]<=mid){
                pageCount+=arr[i];
            }else{
                personCount++;
                if(personCount>m || arr[i]>mid){
                    return false;
                }
                pageCount=arr[i];
            }
        }
        return true;
    }
    private static int bookAllocation(int s,int e,int ans,int arr[],int m,int n){
        if(s>e)
            return ans;

        int mid=s+(e-s)/2;

        if(isPossible(arr,mid,m,n)){
            ans=mid;
            return bookAllocation(s,mid-1,ans,arr,m,n);
        }else{
            return bookAllocation(mid+1,e,ans,arr,m,n);
        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int m=2,n=4;
        int s=0,e=100;
//        int mid=s+(e-s)/2;
        int ans=-1;
        System.out.println(bookAllocation(s,e,ans,arr,m,n));
    }


}
