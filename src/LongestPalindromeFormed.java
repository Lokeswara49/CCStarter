import java.util.Scanner;

public class LongestPalindromeFormed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(findLongest(s));
    }
    static String findLongest(String s){
        int[] a=new int[26];
        int highOdd=-1;
        int highLen=0;
        int i=0;
        while (i< s.length()){
            a[s.charAt(i)-'a']++;
            i++;
        }
        i=0;
        while(i<26){
            if(a[i]%2==1 && highLen<a[i]){
                highLen=a[i];
                highOdd=i;
            }
            i++;
        }
        String ans="";
            i=25;
            while (i>=0){
                if(i==highOdd){
                    int n=ans.length()/2;
                    ans=ans.substring(0,n)+(char)(i+97)+ans.substring(n,ans.length());
                    a[i]--;
                    while(a[i]!=0){
                        ans=(char)(i+97)+ans;
                        ans=ans+(char)(i+97);
                        a[i]-=2;
                    }
                }
                else if(a[i]%2==0 && a[i]!=0){
                    while(a[i]!=0){
                        ans=(char)(i+97)+ans;
                        ans=ans+(char)(i+97);
                        a[i]-=2;
                    }
                }
                else if(a[i]>1){
                    a[i]--;
                    while(a[i]!=0){
                        ans=(char)(i+97)+ans;
                        ans=ans+(char)(i+97);
                        a[i]-=2;
                    }
                }
                i--;
            }
            return ans;

    }
}
