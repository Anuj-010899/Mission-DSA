package Recursion;

//public class BubbleSort {
//    public static void main(String[] args) {
//        int arr[]={2,1};
//
//        for(int k=0;k<arr.length;k++){
//            for(int i=0;i<arr.length-k-1;i++){//-k is bcoz one digit in last is getting placed
//                                              // in correct place.So reducing 1 pos.
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//
//    }
//}
public class BubbleSort {
    private static void sort(int arr[],int len)
    {
        if(len==0 || len==1)
            return;

        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        sort(arr,len-1);
    }    public static void main(String[] args) {
        int arr[]={2,1};

        sort(arr,arr.length);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
