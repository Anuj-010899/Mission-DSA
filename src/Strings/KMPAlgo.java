package Strings;

public class KMPAlgo {
    private static void populatePSArray(String p,int psArray[],int p_len){
        int i=1;
        int j=0;

        while(i<p_len){
            if(p.charAt(i)==p.charAt(j)){
                psArray[i]=j+1;
                i++;
                j++;
            }else{
                if(j!=0){
                    j=psArray[j-1];
                }else{
                    psArray[i]=0;
                    i++;
                }
            }
        }

    }
    private static int kmpsearch(String s, String p){
        int s_len=s.length();
        int p_len=p.length();

        int psArray[]=new int[s_len];
        populatePSArray(p,psArray,p_len);

        int i=0,j=0;

        while(i<s_len && j<p_len){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }else{
                if(j!=0){
                    j=psArray[j-1];
                }else{
                    i++;
                }
            }
        }

        if(j==p_len)
            return i - p_len;
        else
            return -1;

    }

    public static void main(String[] args) {
        String s="mississippi";
        String p="issip";

        int index=kmpsearch(s,p);

        System.out.println("Pattern found at index: "+index);
    }
}

