import java.util.Random;
import java.util.Scanner;

 class NumberGuessingGame 
 {
    int ATTEMPTS;
    public static void main(String[] args)
     {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess,ATTEMPTS;
        ATTEMPTS =1;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (ATTEMPTS!=11) 
        {
            guess = scanner.nextInt();

            if (guess == numberToGuess) 
            {
                System.out.println("Congratulations, you guessed the number!");
                displayScore(ATTEMPTS);
                break;
            }
             else if (guess < numberToGuess) 
            {
                System.out.println("Your guess is too low. Try again:");
                ATTEMPTS+=1;
                 System.out.println("your attempt is :" +ATTEMPTS);
            } 
            else
             {
                System.out.println("Your guess is too high. Try again:");
                ATTEMPTS +=1;
                System.out.println("your attempt is :" +ATTEMPTS);
            }
            
        }
       
        System.out.println("press one to play again:" );
        ATTEMPTS = scanner.nextInt();
        if(ATTEMPTS==1)
        {
            main(null);
        }
        else
        {
            System.out.println("thanku for playing game :");
        }

        
        scanner.close();
    }
   
    public static void displayScore(int ATTEMPTS)
     {
        if(ATTEMPTS<4)
                {
                    System.out.println("your score is : 100");
                }
                else if (ATTEMPTS>4 && ATTEMPTS<=6)
                {
                    System.out.println("your score is :75 "); 

                }
                else if (ATTEMPTS>6 && ATTEMPTS<=8)
                {
                    System.out.println("your score is :50 "); 
                }
                else if (ATTEMPTS>8 && ATTEMPTS<=10)
                {
                    System.out.println("your score is :45"); 
                }
                
                System.out.println("your attempts is :" +ATTEMPTS);
     }
}