public class Task {
    public static void main (String [] args){
        int Number = 12332;
        int b = Number;
        int c = 0;
        while ( b != 0){
            c = c*10 + (b%10);
            b = b/10;
        }

        if (c != Number)
           System.out.println("Ne Polyndrom");
        else
           System.out.println("Polyndrom");

    }
}
