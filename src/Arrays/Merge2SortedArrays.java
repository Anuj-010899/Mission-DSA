package Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,3,4,5,6};
        int arr3[]=new int[10];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];

                j++;
            }
            k++;
        }

        if(i>arr1.length-1){
            for(int l=j;l<arr2.length;l++){
                arr3[k]=arr2[l];
                k++;
            }
        }else{
            for(int l=i;l<arr1.length;l++){
                arr3[k]=arr1[l];
                k++;
            }
        }

        for(int m:arr3){
            System.out.print(m+" ");
        }



    }
}
