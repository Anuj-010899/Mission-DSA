package Recursion;
//
//public class firstAndLastPositionOfElementInSortedArray {
//    private static int leftOccur(int arr[],int key){
//        int s=0;
//        int e= arr.length-1;
//        int ans=0;
//
//        int mid=s+(e-s)/2;
//        while(s<=e){
//            if(arr[mid]==key){
//                ans=mid;
//                e=mid-1;
//            }else if(arr[mid]<key){
//                s=mid+1;
//            }else{
//                e=mid-1;
//            }
//            mid=s+(e-s)/2;
//        }
//        return ans;
//    }
//
//    private static int rightOccur(int arr[],int key){
//        int s=0;
//        int e= arr.length-1;
//        int ans=0;
//
//        int mid=s+(e-s)/2;
//        while(s<=e){
//            if(arr[mid]==key){
//                ans=mid;
//                s=mid+1;
//            }else if(arr[mid]<key){
//                s=mid+1;
//            }else{
//                e=mid-1;
//            }
//            mid=s+(e-s)/2;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[]={1,1,1,2,2,3,3,3,4,5,5,5,5,6,6,6,6,6,6,6,6,7,8,9,10,10,11};
//        int key=11;
//        int leftIndex=leftOccur(arr,key);
//        int rightIndex=rightOccur(arr,key);
//
//        System.out.println("Left Most Occurence is: "+ leftIndex +
//                " and Right Most Occurence is: "+rightIndex);
//
//
//    }
//}
public class firstAndLastPositionOfElementInSortedArray {
    private static int leftOccur(int[] arr,int s,int e, int key,int ans) {
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==key){
            ans=mid;
            e=mid-1;
        }else if(arr[mid]<key){
            s=mid+1;
        }else{
            e=mid-1;
        }
        return leftOccur(arr,s,e,key,ans);
    }
    private static int rightOccur(int[] arr,int s,int e, int key,int ans) {
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==key){
            ans=mid;
            s=mid+1;
        }else if(arr[mid]<key){
            s=mid+1;
        }else{
            e=mid-1;
        }
        return rightOccur(arr,s,e,key,ans);
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,3,4,5,5,5,5,6,6,6,6,6,6,6,6,7,8,9,10,10,11};
        int key=1;
        int ans=-1;

        int leftIndex=leftOccur(arr,0,arr.length-1,key,ans);
        int rightIndex=rightOccur(arr,0,arr.length-1,key,ans);
        System.out.println("Left Most Occurence is: "+ leftIndex +
                " and Right Most Occurence is: "+rightIndex);
    }


}
