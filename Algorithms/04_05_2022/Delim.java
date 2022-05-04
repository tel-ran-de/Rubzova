/**
 * НОД перебором
 */
public class Delim {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int nod = 1;
        if (a < b){
            nod = a;
        }
        else{
            nod = b;
        }
        while ((a % nod != 0)|| (b % nod != 0)){
            nod = nod - 1;
        }
        System.out.println("НОД ("+a+" "+b+") = " + nod );
    }
}
