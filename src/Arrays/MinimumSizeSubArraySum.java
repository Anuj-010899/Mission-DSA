package Arrays;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=11;

        int start=0;
        int end=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;


        while(end<arr.length){
            sum+=arr[end++];
            while(sum>=target){
                minLen=Math.min(minLen,end-start);
                sum-=arr[start++];
            }
        }

        System.out.println(minLen);
    }
}
