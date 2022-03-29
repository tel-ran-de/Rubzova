import java.util.Scanner;

import java.util.Scanner;
public class posl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i){
            if (i % 2 == 1) // ,a2n+1 = an – an-1,
                dp[i] = dp[i / 2] - dp[i / 2 - 1];
            else // a 2n = an + an-1
                dp[i] = dp[i / 2] + dp[i / 2 - 1];

        }
        System.out.println(dp[n]);

    }

}
