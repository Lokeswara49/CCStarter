import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int c= sc.nextInt();
                int n=c;
                int res=0;
                while(n>0){
                    n/=2;
                    res++;
                }
                //System.out.println(res);
                int max=(int) Math.pow(2,res);
                max--;
                List<Integer> a=new ArrayList<>();
                a.add(max);
                max/=2;
                //c%=max;
                while(c>1){
                    if(c%max==0){
                        a.add(max);
                        c/=max;
                    }
                    //System.out.println(c+" "+max);

                    max/=2;

                }
                System.out.println(a.size());
                System.out.print(a);
            }
        }
//                long N= sc.nextInt();
//                long A= sc.nextInt();
//                long B= sc.nextInt();
//                long ans=findMax(N,A,B,0);
//                System.out.println(ans);
//            }
//        }
        catch (Exception e){
            return;
        }
//    }
//    static long findMax(long N,long A,long B,long ans){
//        System.out.println(N+" "+ans);
//        if(N<=1){
//            return ans;
//        }
//        else{
//            long e=-1;
//            long o=-1;
//            List<Long> a=new ArrayList<>();
//            for(long i=2;i<=N;i++){
//                if(i%2==0){
//                    e=i;
//                    a.add(A+findMax((N/e),A,B,ans));
//                }
//                else {
//                    o=i;
//                    a.add(B+findMax((N/o),A,B,ans));
//                }
//            }
////            System.out.println(e+" "+o);
////            if(e!=-1 && o!=-1){
////                 a.add(Math.max(A+findMax((N/e),A,B,ans),B+findMax((N/o),A,B,ans)));
////            }
////            else if(o!=-1){
////                a.add(B+findMax((N/o),A,B,ans));
////            }
////            else {
////                a.add(A+findMax((N/e),A,B,ans));
////            }
////            //System.out.println(e+" "+o);
//            ans=max(a);
//        }
//
//        return ans;
//    }
//    static long max(List<Long> a){
//        long max=Long.MIN_VALUE;
//        for(int i=0;i<a.size();i++){
//            max=Math.max(max,a.get(i));
//        }
//        return max;
    }
}
