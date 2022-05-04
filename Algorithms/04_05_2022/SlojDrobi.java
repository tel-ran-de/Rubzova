import java.util.Scanner;
public class SlojDrobi {
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
        int a = sc.nextByte();
        int b = sc.nextByte();
        int c = sc.nextByte();
        int d = sc.nextByte();
        a = a*d + b*c;
        b = b*d;
        int nod = eulidAlgorithm(a,b);
        if (nod < 0){
            System.out.print( "-"+a /nod +" "+ b / Math.abs(nod));
        }
        else{
            System.out.print(a /nod +" "+ b / nod);
        }
    }
}
