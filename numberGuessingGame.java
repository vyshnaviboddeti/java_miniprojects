import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int random_num = rand.nextInt(1,100);
        int attempts = 0;
        System.out.println("enter your guess between 1 - 100 : ");
        do {
            System.out.print("enter a guess :");
            guess = sc.nextInt();
            attempts++;
            if(guess<random_num)
            {
                System.out.println("TOO LOW!!");
            }
            else if(guess>random_num)
            {
                System.out.println("TOO HIGH!!");
            }
            else {
                System.out.println("Correct");
                System.out.println("Attempts " + attempts);
            }
        }while (guess!= random_num);
        sc.close();
    }
}
