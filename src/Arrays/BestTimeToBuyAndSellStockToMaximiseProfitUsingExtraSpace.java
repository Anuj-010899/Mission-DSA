package Arrays;

public class BestTimeToBuyAndSellStockToMaximiseProfitUsingExtraSpace {
    public static void main(String[] args) {
        int arr[]={3,1,4,8,7,2,5};
        int len= arr.length;
        int aux[]=new int[len];

        int max=arr[len-1];
        aux[len-1]=max;
        for(int i=len-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }
            aux[i]=max;
        }
        int maxSoFar=-9999;
        for(int i=0;i<len;i++){
            if(aux[i]-arr[i]>maxSoFar){
                maxSoFar=aux[i]-arr[i];
            }
        }

        System.out.println(maxSoFar);


    }
}
