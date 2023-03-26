/**
 * Задача 3. Реализовать простой калькулятор
 */
import java.util.Scanner;

public class Z3 
{
    public static void main(String[] args) 
    {
        System.out.println("Выберите действие из списка: ");
        System.out.println("1. Сложение \n2. Вычитание \n3. Умножение \n4. Деление");
        Scanner in = new Scanner(System.in); 
        System.out.print("Введите действие: ");
        int s = in.nextInt();
        if (s == 1 || s == 2 || s == 3 ||s == 4)
        {

        
            System.out.print("Введите первое число: ");
            double a = in.nextDouble();
            System.out.print("Введите второе число: ");
            double b = in.nextDouble();
            in.close();
            double result = 0;
            if (s == 1)
            {
                result = a + b;
                System.out.printf("%f + %f = %f\n", a, b, result);
            }
            else if (s == 2)
            {
                result = a - b;
                System.out.printf("%f - %f = %f\n", a, b, result);
            }
            else if (s == 3)
            {
                result = a * b;
                System.out.printf("%f * %f = %f\n", a, b, result);
            }
            else if (s == 4)
            {
                result = a / b;
                System.out.printf("%f / %f = %f\n", a, b, result);
            }
        }
        else
        {
            System.out.println("Выбранное действие отсутствует, попробуйте еще раз");
        }
    }
}