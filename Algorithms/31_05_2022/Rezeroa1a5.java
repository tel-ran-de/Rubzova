/*

Задача №112632. Сколько каких дорог?
В городе Новые Васюки на некоторых дорогах введено одностороннее движение. Схема дорог задана в виде весовой матрицы графа, числа обозначают длины дорог. Если длины дорог из пункта А в пункт Б разные, это означает, что есть две разные дороги. Найдите отдельно количество дорог в Новых Васюках с односторонним и двусторонним движением.
Входные данные
В первой строке вводится количество перекрёстков в Новых Васюках N ( 1 ≤ N ≤ 1000 ). В следующих N строках записано по N чисел, разделённых пробелами – длины дорог между каждой парой перекрёстков. Ноль означает, что дороги между этими перекрёстками нет.
 */
import java.util.Scanner;
public class Rezeroa1a5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        int [] [] Ma2 = new int [a] [a] ;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a; j++)
            {
                Ma2[i][j] = in.nextInt();
                if(Ma2[i][j] == Ma2[j][i] && Ma2[j][i]  != 0) {
                    count2++;
                    count1--;
                }
                if(Ma2[i][j] != Ma2[j][i] && Ma2[i][j]  != 0) {
                    count1++;
                }
            }
        }
        System.out.print(count1 +" " + count2 );

    }
}
