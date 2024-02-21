import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Wipro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        int ans=0;
        for(int i=a+1;i<b;i++){

            if(Math.sqrt(i)%1==0){
                ans+=i;
            }
        }
        System.out.println(ans);

    }
}
