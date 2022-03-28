import java.util.Scanner;

import java.util.Scanner;

public class nolick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

       int kol = 0;
       for (int i = a; i <= b; i++) {
            if ((i % 5 == 0) && (i % 10 == 0)) {
                kol = kol +1;
            }
       }



       // while (a <= b) {
       //     if ((a % 5 == 0) && (a % 10 == 0)) {
      //          kol = kol + 1;
       //     }

       //     a = a + 1;
        //}


       System.out.println(kol);
       sc.close();

    }
}
