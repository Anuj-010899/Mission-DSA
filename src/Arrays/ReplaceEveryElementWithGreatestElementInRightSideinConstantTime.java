package Arrays;

public class ReplaceEveryElementWithGreatestElementInRightSideinConstantTime {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;

        for(int i= arr.length-2;i>=0;i--){
            ans[i]=Math.max(arr[i+1],ans[i+1]);
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
