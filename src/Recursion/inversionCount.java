package Recursion;

public class inversionCount {
    //static  int count=0;
    private static int merge(int arr[],int s,int e){
        int inv_count=0;
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
            if(first[index1]<=second[index2]){
                arr[mainIndex++]=first[index1++];
            }else{

                arr[mainIndex++]=second[index2++];
                inv_count+=len1-index1;
            }
        }

        while(index1<len1){
            arr[mainIndex++]=first[index1++];
        }
        while(index2<len2){
            //count++;
            arr[mainIndex++]=second[index2++];
        }
        return inv_count;
    }
    private static int sort(int arr[],int s,int e){
       int mid,inv_count=0;

       if(s<e) {
            mid = s + (e - s) / 2;

           //left part ko sort karna hai...
           inv_count+=sort(arr, s, mid);

           //right part ko bhi sort karna hai...
           inv_count+=sort(arr, mid + 1, e);

           //Ab dono part sorted hai ...ab dono ko merge kardo ...

           inv_count+=merge(arr, s, e);
       }
       return inv_count;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,9,1,2,7,8};

        int ans=sort(arr,0,arr.length-1);

//        for(int i: arr){
//            System.out.print(i+" ");
//        }
        System.out.println(ans);
    }

}
//public class inversionCount {
//
//    private static int merge(int arr[],int s,int e){
//        int inv_count=0;
//        int mid=s+(e-s)/2;
//
//        int len1=mid-s+1;
//        int len2=e-mid;
//
//        int first[]=new int[len1];
//        int second[]=new int[len2];
//
//        int mainIndex=s;
//        for(int i=0;i<len1;i++){
//            first[i]=arr[mainIndex++];
//        }
//        mainIndex=mid+1;
//        for(int i=0;i<len2;i++){
//            second[i]=arr[mainIndex++];
//        }
//
//        int index1=0,index2=0;
//        mainIndex=s;
//
//        while (index1<len1 && index2<len2){
//            if(first[index1]<second[index2]){
//                arr[mainIndex++]=first[index1++];
//            }else{
//                arr[mainIndex++]=second[index2++];
//                inv_count+=len1-index1;
//            }
//        }
//        while(index1<len1){
//            arr[mainIndex++]=first[index1++];
//        }
//        while(index2<len2){
//            arr[mainIndex++]=second[index2++];
//        }
//
//        return inv_count;
//    }
//
//    private static int mergeSort(int arr[],int s,int e){
//        int inv_count=0;
//        if(e>s){
//            int mid=s+(e-s)/2;
//
//            inv_count+= mergeSort(arr,0,mid); //left part sort kardo
//            inv_count+=mergeSort(arr,mid+1,e);//right part sort kardo;
//
//            inv_count+=merge(arr,s,e);
//
//
//        }
//
//        return inv_count;
//    }
//    public static void main(String[] args) {
//        int arr[]={3,5,6,9,1,2,7,8};
//
//        int ans=mergeSort(arr,0,arr.length-1);
//
//        System.out.println("Invesion Count is :" +ans);
//    }
//
//
//}



