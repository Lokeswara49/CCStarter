import java.util.Arrays;
import java.util.Scanner;

public class PrefixStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        System.out.println(func(s));
    }
    static int func(String[] s){
        int n=s.length;
        Arrays.sort(s);
        int temp=0;
        int ans=0;
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
        int len=s[0].length();
        for(int i=0;i<n-1;i++){
            if(s[i].length()>len){
                if(s[i+1].contains(s[i])){
                    //System.out.println(s[i]);
                    temp++;
                }
                else{
                    ans=Math.max(ans,temp);
                    temp=0;
                }
            }
            else{
                temp=0;
            }
        }
        ans=Math.max(ans,temp);
        return ans;
    }
}
