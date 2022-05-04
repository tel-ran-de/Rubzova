/*
Если числитель и знаменатель дроби имеют
 общий делитель (то есть делятся нацело на одно и то же число), то числитель и знаменатель дроби можно разделить на их НОД
 https://informatics.msk.ru/mod/statements/view.php?id=7259#1

 */
import java.util.Scanner;
public class Drob {
    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1 = sc.nextByte();
        byte n2 = sc.nextByte();
        int nod = eulidAlgorithm(n1,n2);
        if (nod < 0){
            System.out.print( "-"+n1 /nod +" "+ n2 / Math.abs(nod));
        }
        else{
            System.out.print( n1 /nod +" "+ n2 / nod);
        }
    }
}
