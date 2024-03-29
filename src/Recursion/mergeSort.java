package Recursion;

public class mergeSort {
    //static  int count=0;
    private static void merge(int arr[],int s,int e){
        int mid=s+(e-s)/2;

        int len1=mid-s+1;
        int len2=e-mid;

        int first[]=new int[len1];
        int second[]=new int[len2];

        int mainIndex=s;

        for(int i=0;i<len1;i++){
            first[i]=arr[mainIndex++];
        }
        mainIndex=mid+1;

        for(int i=0;i<len2;i++){
            second[i]=arr[mainIndex++];
        }

        //Merge two sorted arrays

        mainIndex=s;
        int index1=0;
        int index2=0;

        while(index1<len1 && index2<len2){
            if(first[index1]<second[index2]){
                arr[mainIndex++]=first[index1++];
            }else{

                arr[mainIndex++]=second[index2++];
            }
        }

        while(index1<len1){
            arr[mainIndex++]=first[index1++];
        }
        while(index2<len2){
            //count++;
            arr[mainIndex++]=second[index2++];
        }

    }
    private static void sort(int arr[],int s,int e){
        if(s>=e)
            return;

        int mid=s+(e-s)/2;

        //left part ko sort karna hai...
        sort(arr,s,mid);

        //right part ko bhi sort karna hai...
        sort(arr,mid+1,e);

        //Ab dono part sorted hai ...ab dono ko merge kardo ...

        merge(arr,s,e);
    }
    public static void main(String[] args) {
        int arr[]={6,3,5,2,7};

        sort(arr,0,arr.length-1);

        for(int i: arr){
            System.out.print(i+" ");
        }

    }

}
