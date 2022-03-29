import java.util.Scanner;
public class edin {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 2;
            dp[2] = 4;
            dp[3] = 7;
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2]+ dp [i-3];
            }
            System.out.println(dp[n]);



        }
}
