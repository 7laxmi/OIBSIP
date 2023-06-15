import java.util.Random;
import java.util.Scanner;
public class random 
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);

        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Welcome to guessing Game!!!");
        System.out.println(".................Lets Go!!..................");
        System.out.println("Guess a number between 0 to 99 : ");

        int attemptsNum = 0;
        final int maxAttempts = 3;
        do
        {
            a = obj.nextInt();

            if(a == rand_int1)
            {
                System.out.println("\nHurray!! You guessed the correct number");
                break;
            }
            else if(a < rand_int1)
            {
                System.out.println("\nThe number you guessed is less than the correct number. Try Again");
            }
            else
            {
                System.out.println("\n The number you guessed is greater than the correct number. Try Again");
            }
        }
        while(a != rand_int1 && ++attemptsNum <maxAttempts);
        if (attemptsNum == maxAttempts)
        System.out.println("\n You loose.");
    
         System.out.println("\n The Correct Answer is : "+rand_int1);
         obj.close();
    }
}
