import java.util.Scanner;

public class CodeCraze {
    static int ans;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(countGoodSubsequence(a, n, k));
            ans=0;
        }
    }
    static int countGoodSubsequence(int[] a,int n,int k){
        findSubseq(a,n,0,k,0);
        return ans;
    }
    static void findSubseq(int[] a,int n,int val,int k,int i){
        if(i>=n || val>k){

            return;

        }
        if(val<=k){
            ans++;
        }
            System.out.println(i+" "+val);
            findSubseq(a,n,val+a[i],k,i+2);
            findSubseq(a,n,val,k,i+1);
    }
}
