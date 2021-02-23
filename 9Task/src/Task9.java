import java.util.Random;
import java.io.IOException;
public class Task9 {
    public static void main(String[] args) throws IOException {
        char t, ch;
        {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'A');
            System.out.println(c);

            System.out.println("Попробуйте отгадать букву: ");
            t = ' ';
            while (c != t) {
                ch = (char) System.in.read();
                t = ch;
                if (t < c & t >= 'A') {
                    System.out.println("You’re too low");
                }
                if (t > c & t <= 'Z') {
                    System.out.println("You’re too high");
                }
            }
        }
    }
}
