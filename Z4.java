import java.util.Scanner;

public class Z4 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение с пробелами в качестве разделителей в формате 'x? + ?y = zz' :");
        String str = in.nextLine();
        in.close();
        String[] subStr;
        String delimeter = " ";
        subStr = str.split(delimeter);

        for(int i = 0; i < subStr.length; i++) { 
            String a = (subStr[i]);
            //System.out.println(a);
        }
        String aStr1 = subStr[0];
        String aStr2 = aStr1.substring(0, 1);
        int aInt = Integer.parseInt (aStr2);
        //System.out.println(aInt);

        String bStr1 = subStr[2];
        String bStr2 = bStr1.substring(1);
        int bInt = Integer.parseInt (bStr2);
        //System.out.println(bInt);

        String cStr1 = subStr[4];
        String cStr2 = cStr1.substring(0, 1);
        String dStr2 = cStr1.substring(1);
        int cInt = Integer.parseInt (cStr2);
        int dInt = Integer.parseInt (dStr2);
        //System.out.println(cInt);
        //System.out.println(dInt);

        if (dInt - bInt >= 0 && cInt - aInt >= 0)
        {
            int e = dInt - bInt;
            int f = cInt - aInt;
            System.out.printf("%d%d + %d%d = %d%d", aInt, e, f, bInt, cInt, dInt);
        }
        else if (dInt < bInt && cInt - aInt >= 0)
        {
            int e = dInt + 10 - bInt;
            int f = cInt - aInt - 1;
            System.out.printf("%d%d + %d%d = %d%d", aInt, e, f, bInt, cInt, dInt);
        }
        else
        {
            System.out.println("Данное уравнение не имеет решения");
        }
    }
}

