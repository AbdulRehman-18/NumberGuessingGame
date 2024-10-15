import java.util.Random;
import java.util.Scanner;

class guess {
    Random r = new Random();
    Scanner in = new Scanner(System.in);
    int random = r.nextInt(101);

    public void game(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("\nEnter your guess: ");
            int guess = in.nextInt();

            if (guess > random) {
                System.out.println("Incorrect! The number is less than " + guess + ".");
            } else if (guess < random) {
                System.out.println("Incorrect! The number is greater than " + guess + ".");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                return;
            }
        }
    }

    void reset() {
        random = r.nextInt(101);
    }
}

public class NumberGuessingGame{
    public static void main(String[] args){
        int ch;
        Scanner in = new Scanner(System.in);
        guess g = new guess(); /* creating object of the class guess*/

        System.out.println("""
        Welcome to the Number Guessing Game!
        I'm thinking of a number between 1 and 100.
        You have 5 chances to guess the correct number.""");

        while (true){
            System.out.println("""
                    
                    Please select the difficulty level:
                    1. Easy (10 chances)
                    2. Medium (5 chances)
                    3. Hard (3 chances)
                    4. Quit""");

            System.out.print("\nEnter your choice:");
            ch = in.nextInt();

            switch (ch){
                case 1->{
                    System.out.println("""
                            
                            Great! You have selected the Easy difficulty level.
                            Let's start the game!""");
                    g.game(10);
                }

                case 2->{
                    System.out.println("""
                            
                            Great! You have selected the Medium difficulty level.
                            Let's start the game!""");
                    g.game(5);
                    System.out.println("Want to play again?(Y/n):");
                }

                case 3->{
                    System.out.println("""
                            
                            Great! You have selected the Hard difficulty level.
                            Let's start the game!""");
                    g.game(3);
                }
                case 4-> {
                    return;
                }
                default->{
                    System.out.println("Invalid Input");
                    return;
                }
            }
            System.out.print("Wanna play again(Y/n): ");
            String ans = in.next();
            if(ans.equalsIgnoreCase("n")){
                System.out.println("Thank you for playing");
                break;
            }
            g.reset();
        }
        in.close();
    }
}
