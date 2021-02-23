import java.util.Scanner;

public class Task {
    public static void main (String [] args){
        int n = 5;
        int res;
        res = 0;

        for (int i = 1; i <= n ; i++)
            res = res + i;
        System.out.println(res);

        System.out.println("Усовершенствованный вариант");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int Number = in.nextInt();
        int res2;
        res2 = 0;
        int b = Number;

        while (Number != 0){
            res2 = res2 + (Number%10);
            Number = Number/10;
        }
        System.out.println("Сумма цифр в числе "+ b + " = "+ res2);

    }
}
