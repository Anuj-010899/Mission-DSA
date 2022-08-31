package Arrays;

public class powxn {
    public static void main(String[] args) {
        int x=3;
        int n=4;

        double ans=1.0;
        long nn=n;
        if(nn<0) nn=nn*(-1);

        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }else{
                x=x*x;
                nn=nn/2;
            }
        }

        if(nn<0) ans=(double) 1.0/(double) ans;
        System.out.println(ans);
    }
}
