import java.util.*;

public class GfgMisChiefs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]= sc.nextInt();
        }
        completeTask(N,a);
    }
    static String completeTask(int N, int arr[]){
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }
            else{
                map.put(arr[i],1);
            }
        }
        if(map.size()==2){
            Iterator hmIterator = map.entrySet().iterator();
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                int marks = ((int)mapElement.getValue());
                System.out.println(mapElement.getKey() + " : " + marks);
            }
        }
        return "";
    }
    static boolean misChief(int[] a,int n,Map<Integer,Integer> map,int N){
        System.out.println(n);
        if(n==N-1){
            for (Map.Entry<Integer, Integer> set : map.entrySet()) {
                int key= set.getKey();
                int value= map.get(key);
                if (Math.abs(key-a[0])==1 && value!=0){
                    return true;
                }
            }
            return false;
        }
        boolean res=false;
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int key = set.getKey();
            int value= map.get(key);
            if(Math.abs(key-a[n-1])==1 && value!=0){
                map.put(key,value-1);
                a[n]=key;
                res=res || misChief(a,n+1,map,N);
                map.put(key,value);
                a[n]=0;
            }
        }
        return res;
    }
}
