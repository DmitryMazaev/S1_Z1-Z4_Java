/**
 * Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class Z1 
 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число n: ");
        int n = in.nextInt();
        in.close();
        int N = 0;
        int M = 1;
        if (n > 0)
        {
            for(int i = 1; i <= n; i++)
            {
                N = N + i;
                M = M*i;
            }
            System.out.printf("Сумма чисел от 1 до %d = %d \n", n, N);
            System.out.printf("Факториал числа %d = %d", n, M);
        }
        else if (n == 0)
        {
            System.out.printf("Треугольное число = 0 \n");
            System.out.printf("Факториал числа %d = 1", n);
        }
        else
        {
            System.out.printf("Введенное число %d не является положительным, попробуйте еще раз", n);
        }
    }
}