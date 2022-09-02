package Recursion;

public class linearSearch {
    private static int linSearch(int arr[],int len,int key){
        if(len<=0){
            return -1;
        }

        if(arr[len-1]==key){
            return len-1;
        }

        int ans= linSearch(arr,len-1,key);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={};
        int len=arr.length;
        int key=2;

        System.out.println(linSearch(arr,len,key));
    }
}
