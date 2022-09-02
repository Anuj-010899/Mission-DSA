package Recursion;

public class ArraySum {
    private static int arrSum(int arr[],int size){
        if(size<=0)
            return 0;
        int remainingPart=arrSum(arr,size-1);
        int sum=remainingPart+arr[size-1];
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={};
        int size=arr.length;
        //int sum=0;

        System.out.println(arrSum(arr,size));
    }

}
