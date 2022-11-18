package Task1;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");;
        System.out.println("Java");
        int a=46;
        int b=10;
        int c=3;
        int d=(a+b);
        double e=(b/c);
        double f=d*e;
        System.out.println(f);

        int g=29;
        int h=4;
        int i=-15;
        int j=g*h*i;
        System.out.println(j);

        int number=10500;
        double result=(number/10)/10;
        System.out.println(result);

        double k=3.6*4.1*5.9;
        System.out.println(k);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int m=scanner.nextInt();
        System.out.println("Введите число");
        int n=scanner.nextInt();
        System.out.println("Введите число");
        int z=scanner.nextInt();
        System.out.println(m);
        System.out.println(n);
        System.out.println(z);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число");
        int v=scanner.nextInt();
        if (v%2!=0)
        {
        System.out.println("Нечетное");

                }
        else
        {
                if (v>100)
                {
                        System.out.println("Выход за пределы");
                }
                else
                {System.out.println("Четное");}

        }
}
        }