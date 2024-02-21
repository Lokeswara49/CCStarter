import java.util.Scanner;

public class CredMergingIntervals {
    //static int ans=0;
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        int[] profit=new int[n];
        for(int i=0;i<n;i++){
            start[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            end[i]=start[i]+x;
        }
        for(int i=0;i<n;i++){
            profit[i]= sc.nextInt();
        }

        System.out.println(func(start,end,profit,0,0,0));
    }
    static int func(int[] s,int[] e,int[] p,int i,int t,int ans){
        if(i==n){
            return ans;
        }
        else{
            if(t<=s[i]){
                int x=func(s,e,p,i+1,t,ans);
                int y=func(s,e,p,i+1,e[i],ans+p[i]);
                System.out.println("x: "+x+" y: "+y+" i"+i);
                return Math.max(x,y);
            }
        }
        return ans;

    }
}
