/**
 * Евклид
 */
public class Evklid_v {


    public static void main(String[] args) {
        int a = 21;
        int b = 14;
        //System.out.print("НОД ("+a+", "+b+") = " );
        System.out.println("1"+ " итерация "+ a+" "+ b);
        int count = 1;
        while (Math.abs(a - b) != 0){
            count += 1;
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
            System.out.println(count+ " итерация "+ a+" "+ b);
        }
        System.out.println( a );
        System.out.println( count );

    }
}
