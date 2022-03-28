import java.sql.SQLOutput;
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int number = sc.nextInt();
        int summa = 0;

     //   for (int i = 1; i <=number; i++) {
    //      summa = summa + i ;}

        int i = 1;

        while (i <= number) {
            summa = summa + i*i;
            i = i + 1;
        }

        System.out.println(summa);

    }
}
