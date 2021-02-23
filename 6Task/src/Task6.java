import java.util.Scanner;

public class Task6 {
    public static void main ( String [] args){
        for (int i = 2; i <= 100; i++){
            boolean Prime = i>=2;
            for (int j = 2; i > j; j++ ) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
          if (Prime)
              System.out.println(i);
        }
    }
}
