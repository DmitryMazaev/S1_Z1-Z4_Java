/**
 * Задача 2. Вывести все простые числа от 1 до 1000
 */

public class Z2 {
    public static void main(String[] args)
    {
        for (int i = 1;i <= 1000; i++)
        {
            if (i%20 == 0)
            {
                System.out.println(i);
            }
            else
            {
                System.out.print(i + " ");
            }
            
        }
    }
}
