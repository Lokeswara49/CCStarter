import java.util.Scanner;

public class GroupingAdjacentPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int ans=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            if(temp+a[i]<=m){
                temp+=a[i];
            }
            else{
                temp=a[i];
                ans++;
            }
        }
        if(temp<=m)
            ans++;


        System.out.println(ans);

    }
}
