package Arrays;

public class RotateArrayWithoutExtraSapce {
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int len=arr.length;

        k=k% len;
        reverse(arr,0,len-k-1);
        reverse(arr,len-k,len-1);
        reverse(arr,0,len-1);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
