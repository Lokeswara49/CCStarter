import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getAnagram(s));
    }
    static int getAnagram(String s){
        int n=s.length();
        int ans=0;
        int[] a1=new int[10];
        int[] a2=new int[10];
        for(int i=0;i<n/2;i++){
            a1[s.charAt(i)-'0']++;
        }
        for(int i=n/2;i<s.length();i++){
            a2[s.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            if(a2[i]>a1[i]){
                ans+=(a2[i]-a1[i]);
            }
        }
        return ans;
    }
}
