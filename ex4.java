import java.util.Random;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        //名前
        System.out.println("Who are you?");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.next();
        System.out.println("Hello," + name);
        System.out.println("");

        //コイントス
        int headCount = 0;
        int tailCount = 0;

        String[] coin = {"Heads", "Tails"};
        Random r = new Random();
        
        System.out.println("Tossing a coin...");

        for(int i = 0; i < 3; i++) {
            String result = coin[r.nextInt(2)];
            System.out.print("Round" + (i+1) + ":");
            System.out.println(result);
            if(result == "Heads") {
                headCount += 1;
            } else {
                tailCount += 1;
            }
        }

        System.out.println("Heads:" + headCount + "," + "Tails:" + tailCount);
        
        if(headCount > tailCount ) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }


    }


}
