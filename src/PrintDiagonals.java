public class PrintDiagonals {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=a.length;
        //int j=0,k=0;
        for(int i=0;i<n;i++){
            for(int j=0,k=i;j<=i && k>=0;j++,k--){
                System.out.print(a[j][k] +",");
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i,k=0;j>=0 && k<=i;j--,k++){
                System.out.print(a[n-1-j][n-1-k]+",");
            }
        }

    }
}
