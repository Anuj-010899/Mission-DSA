package Recursion;

public class selectionSort {
    private static void sort(int arr[],int i){
        if(i>=arr.length-1)
            return;

        int minIndex=i;

        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;

        i++;
        sort(arr,i);


    }
    public static void main(String[] args) {
        int arr[]={4,6,5};
        int i=0;

        sort(arr,i);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
