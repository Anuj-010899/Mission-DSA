package BinarySearch;

public class BookAllocationProblem {
    static boolean isBookAllocationPossible(int[] arr, int m,int n, int mid){
        int pageSum=0;
        int studentCount=1;

        for(int i =0;i<n;i++){
            if(pageSum+arr[i]<=mid){
                pageSum+=arr[i];
            }else{
                studentCount++;
                if(studentCount>m || arr[i]>mid){
                    return false;
                }
                pageSum=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40}; //array of books projecting their number of pages
        int m=2; //number of students
        int n=arr.length; // Number of books

        int sum=0;
        for(int i:arr){//Here we are calculating the total number of pages all the books have.
            sum+=i;
        }
        /*
        * We calculated the sum to get our max searching space.
        * */
        int s=0;
        int e=sum;
        int ans=-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(isBookAllocationPossible(arr,m,n,mid)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        System.out.println(ans);

    }
}
