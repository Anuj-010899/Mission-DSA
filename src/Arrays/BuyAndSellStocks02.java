package Arrays;

public class BuyAndSellStocks02 {
    public static void main(String[] args) {
        int arr[]={5,2,7,3,6,1,2,4};

        int profit=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=(arr[i]-arr[i-1]);
            }
        }
        System.out.println(profit);
    }
}
