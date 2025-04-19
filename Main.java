import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Number Guessing Game

        Random r=new Random();
        Scanner s=new Scanner(System.in);

        int guess;
        int min = 1;
        int max = 100;
        int RandomNumber = r.nextInt(min, max+1);
        int attempt=0;

        do {
            System.out.printf("Guess the Number between %d and %d:\n",min, max);
            guess = s.nextInt();
            attempt++;
            if (guess>RandomNumber){
                System.out.println("The Number is Too High! Try again");
            }
            else if (guess<RandomNumber){
                System.out.println("The Number is Too Low! Try again");
            }
            else {
                System.out.println("Yes, You are right the number is "+ guess);
                System.out.println("Number of attempt is "+attempt);
            }
        }while(guess!=RandomNumber);
        System.out.println("You Won the Game");

    }
}