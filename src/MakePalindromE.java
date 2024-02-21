import java.util.Scanner;

public class MakePalindromE {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int oddCount = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] % 2 == 1) {
                        oddCount++;
                    }
                }
                long ans = oddCount / 2;
                System.out.println(ans);
            }
        }
        catch (Exception e){
            return;
        }
    }

}
