package Recursion;

//public class InsertionSort {
//    public static void main(String[] args) {
//        int arr[]={2,4,5,1,7,10,3,6,9,8};
//
//        int i=1;
//        //for(int i=1;i< arr.length;i++){
//        while(i<arr.length){
//            int j=i-1;
//            int temp=arr[i];
//            while(j>=0 && arr[j]>temp){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//            i++;
//        }
//
//        for(int k:arr){
//            System.out.print(k+" ");
//        }
//    }
//}
public class InsertionSort {
    private static void sort(int arr[],int i){
        if(i>=arr.length){
            return;
        }
        int j=i-1;
        int temp=arr[i];
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
        i++;
        sort(arr,i);
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,5,6};
        int i=1;

        sort(arr,i);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
