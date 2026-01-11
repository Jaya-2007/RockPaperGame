import java.util.Random;
import java.util.Scanner;

public class RockPaper{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Rock Paper Scissors Game");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int computer = r.nextInt(3) + 1;

        System.out.println("Computer choice: " + computer);

        if (user == computer) {
            System.out.println("Tie");
        } else if (
                (user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)
        ) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
