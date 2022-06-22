package Arrays;

public class RotateArray {
    static void  leftRotate(int[] arr,int k){
        int ans[]=new int[arr.length];

        int rotations=k% arr.length; // to make rotations robust for rotations>arr.length
        int position= arr.length-rotations;
        for(int i=0;i<arr.length;i++){
            ans[(i+position)% arr.length]=arr[i];
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static void rightRotate(int[] arr,int k){
        int ans[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            ans[(i+k)% arr.length]=arr[i];
        }
        System.out.println();
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        int k=2;

        leftRotate(arr,k);
        rightRotate(arr,k);


    }
}
