import java.util.Scanner;

public class Task {
    public static void main ( String [] args){
       float moon = 0.17f;
       double res;
       Scanner in = new Scanner(System.in);
       System.out.println("Введите вес на змеле");
       int weight = in.nextInt();
       res = weight*moon;
       System.out.println ("Вес луне = " + res);

       }
    }
