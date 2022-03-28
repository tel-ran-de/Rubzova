import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if ((a <0) &&  (b <0)){
            a= a * -1;
            b= b * -1;
        }
        else if (b < 0) {
            int t = a;
            a= b;
            b = t;
        }

        int summa = 0;

        //for (int i = 1; i <=b; i++) {
          //  summa = summa + a ;}

        int i = 1;

        while (i <= b) {
            summa = summa + a;
            i = i + 1;
        }
        System.out.println(summa);

        sc.close();


    }
}
