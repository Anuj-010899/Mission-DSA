package Recursion;

public class quickSort {
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static int partition(int arr[],int s,int e){
        int pivot=arr[s];

        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot)
                count++;
        }

        int pivotIndex=s+count;

        //pivot element ko sahi position pe daal do
        swap(arr,s,pivotIndex);

//        int temp=arr[s];
//        arr[s]=arr[pivotIndex];
//        arr[pivotIndex]=temp;

        //Ab pivotIndex ke left part pe smaller aur right part me larger hone chahiye.
        //ye sambhal lo

        int i=s;
        int j=e;

        while(i<pivotIndex && j>pivotIndex){
           while(arr[i]<=pivot){
               i++;
           }
           while(arr[j]>pivot){
               j--;
           }

           if(i<pivotIndex && j>pivotIndex){
               swap(arr,i,j);
               i++;
               j--;
           }
        }
        return pivotIndex;

    }
    private static void sort(int arr[],int s,int e){
        if(s>=e){
            return;
        }

        int p=partition(arr,s,e);



        //partition ke left wala part ko sort kardo
        sort(arr,s,p-1);

        //partition ke right wala part ko bhi sort kardo
        sort(arr,p+1,e);

    }
    public static void main(String[] args) {
        int arr[]={3,-2,9,-11,7,99};

        sort(arr,0,arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
