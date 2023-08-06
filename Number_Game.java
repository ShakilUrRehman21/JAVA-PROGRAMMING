import java.util.*;
public class Number_Game {
    public static void guessingNumberGame() {

        //Scanner
        Scanner sc=new Scanner(System.in);

        //Generating random number
        Random num= new Random();

        //Setting limit up-to 100
        int Num_range=num.nextInt(100);

        //Limiting attempts by 5
        int attempt=5;
        System.out.println("Let's begin the game!");
        System.out.print("Guess a number between 1-100: ");

            for (int i=0;i<attempt;i++){

                //Taking user input
                int x=sc.nextInt();

                //if number is guessed right
                if(x==Num_range){
                    System.out.println("You guessed it right."+'\n'+"The number is: "+Num_range);
                    break;
                }

                //if guessed number is greater
                else if(Num_range<x && i!=attempt-1) {
                    System.out.println("Your guess is too high "+x);
                }

                //if guessed number is lesser
                else if(Num_range>x && i!=attempt-1) {
                    System.out.println("Your guess is too low  "+x);
                }

                //maximum attempts
                else{
                    System.out.println("No more attempts left."+'\n'+"The number is: "+Num_range);
                    System.out.println();
                    Scanner st=new Scanner(System.in);
                    System.out.println("""
                                1.Try Again
                                2.Quit
                                """);
                    int new_game=st.nextInt();

                    if(new_game==1){
                        guessingNumberGame();
                    }
                    else {
                        System.out.println("Thanks for playing!");
                        break;
                    }
                }
            }
    }

    public static void main(String[] args) {

        //calling the guess function
        guessingNumberGame();
    }
}
