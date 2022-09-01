package Recursion;

public class sayDigits {
    private static void sayDigit(int n, String arr[]){
        if(n==0)
            return;

        int digit=n%10;
        n=n/10;
        sayDigit(n,arr);
        System.out.println(arr[digit]);
    }
    public static void main(String[] args) {
        int n=10;
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        sayDigit(n,arr);

    }
}
