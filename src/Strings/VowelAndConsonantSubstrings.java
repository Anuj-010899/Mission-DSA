package Strings;

public class VowelAndConsonantSubstrings {
    public static void main(String[] args) {
        String s="abaca";
        char str[]=s.toCharArray();
        int count=0;
        int ans=0;
        //Words starting with vowel and ending with consonants.
        for(int i= str.length-1;i>=0;i--){
            if(str[i]!='a'&& str[i]!='e'&& str[i]!='i'&& str[i]!='o'&& str[i]!='u'){//str[i] is consonant
                count++;
            }else{
                ans+=count;
            }
        }
        //Words starting with consonants and ending with vowels.
        count=0;

        for(int i= str.length-1;i>=0;i--){
            if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
                count++;
            }else{
                ans+=count;
            }
        }
        System.out.println(ans);
    }
}
