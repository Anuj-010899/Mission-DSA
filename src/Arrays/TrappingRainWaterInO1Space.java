package Arrays;

public class TrappingRainWaterInO1Space {
    public static void main(String[] args) {
        int[] arr={3,5,1,4,2,6};
        int leftMax=0;
        int rightMax=0;
        int left=0;
        int right= arr.length-1;
        int ans=0;

        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>leftMax){
                    leftMax=arr[left];

                }else{
                    ans+=(leftMax-arr[left]);
                }
                left++;
            }else{
                if(arr[right]>rightMax){
                    rightMax=arr[right];

                }else{
                    ans+=(rightMax-arr[right]);
                }
                right--;
            }
        }
        System.out.println(ans);
    }
}
