import java.util.Scanner;

public class Cherepaha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int doroga[][] = new int[n][m];
        for (int i = 0; i <n; i++)  {
            doroga[i][0]=1;}

       for (int i = 0; i <m; i++)
        {
            doroga[0][i]=1;
        }

        for (int i = 1; i <n; i++) {
            for (int j = 1; j<m; j++) {
                doroga[i][j]=doroga[i-1][j]+doroga[i][j-1];
            }
        }
        System.out.println(doroga[n-1][m-1]);
    }
}
