import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = console.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 100);

        int k;

        k = 0;
        while (k != 3) {
            System.out.println("Для того, что бы вывести массив введите  - 1");
            System.out.println("Для того, что бы увеличить элемент массива на 10% введите - 2");
            System.out.println("Для выхода введите - 3");
            int q = console.nextInt();
            if (q == 1) {
                for (int i = 0; i < arr.length; i++)
                    System.out.print(arr[i] + " ");
                System.out.println(" ");
            }
            if (q == 2) {
                System.out.println("Введите номер элемента, который хотите увеличить на 10%");
                int p = console.nextInt();
                if (p < n)
                    arr[p] = arr[p] * 1.1;
            }
            if (q == 3)
                k = q;
        }
        console.close();
    }
}
