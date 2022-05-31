/*
Напишите программу, которая считает количество дорог в городе Новые Васюки. Схема дорог задана как матрица смежности графа. На некоторых дорогах введено одностороннее движение.

Входные данные
В первой строке вводится количество перекрёстков в Новых Васюках N ( 1 ≤ N ≤ 1000 ). В следующих N строках записано по N чисел, разделённых пробелами – элементы матрицы смежности графа, который описывает схему дорог.

Выходные данные
Программа должна вывести одно число – количество дорог в Новых Васюках. Дороги с двусторонним движением нужно считать только один раз.
 */
import java.util.Scanner;
public class Rezeroa1a3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        int [] [] Ma2 = new int [a] [a] ;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a; j++)
            {
                Ma2[i][j] = in.nextInt();
                if(Ma2[i][j]==1 && Ma2[j][i]==0) {
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}
