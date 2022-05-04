/*
Модифицировнный алгоритм евклида
 */

public class Modif_evklid {

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
        int n1 = 14;
        int n2 = 21;
        System.out.print("НОД ("+ n1+" "+ n2+ ") = ");
        System.out.println( eulidAlgorithm(n1,n2));
    }


}
