import java.util.Scanner;
import java.util.Scanner;
public class deliteli {
    /**
     * Найти делители числа n
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int number = sc.nextInt();
        for (int i=1; i<=number; i++) {
            if (number % i ==0) {
                System.out.print( i + " " );
            }
        }
    }
}
