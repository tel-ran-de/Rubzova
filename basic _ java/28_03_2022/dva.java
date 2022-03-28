import java.util.Scanner;
public class dva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int pr = 1;
      //  for (int i = a; i <= b; i++) {
        //    if ((i % 2 == 0) && (i >= 10) && (i <= 99)) {
          //      pr = pr * i;
           // }
        //}


        while (a <= b) {
            if ((a % 2 == 0) && (a >= 10) && (a <= 99)) {
                pr = pr * a;
            }
            a = a+ 1;

        }

        System.out.println(pr);
        sc.close();

    }
}
