package Strings;
import java.math.BigInteger;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        String str="33";
        BigInteger num=new BigInteger(str);
        BigInteger one=new BigInteger("1");
        BigInteger num2=num.subtract(one);

        BigInteger ans=num.and(num2);

//        if(ans.equals(new BigInteger("0"))){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

        char c='3';
        System.out.println(c-'0');
    }
}
/*
public class Solution {
	public int power(String A) {

	    String dividend = A;
	    StringBuilder str;

	    if (A == null || A.length() == 0)
	        return 0;

	    if (A.length() == 1 && A.charAt(0) == '0')
	        return 0;

	    while (dividend.length() > 0 && !dividend.equalsIgnoreCase("2")) {
	        str = new StringBuilder();
	        int carry = 0;
	        int n = dividend.length();

	        if (n > 0) {
    	        int num = dividend.charAt(n - 1) - '0';

    	        if (num % 2 == 1)
    	            return 0;
	        }

	        for (int i = 0; i < n; i++) {

	            char c = (char) (dividend.charAt(i) - '0');
	            int res = c + 10 * carry;

	            c = (char) (res / 2 + '0');
	            carry = res % 2;

	            str.append(c);
	        }

	        if (str.charAt(0) == '0')
	            str.deleteCharAt(0);

	        dividend = str.toString();
	    }

	    return 1;

	}

}


 */