import java.util.Scanner;

public class Task7 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int Number = in.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= Number; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c + "");
        }
    }
}
