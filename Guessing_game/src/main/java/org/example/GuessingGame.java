package org.example;

import java.util.*;

public class GuessingGame
{
    // instance variables
    private int number;      // the random number
    private int myGuess;     // current guess
    private int numGuesses;  // number of guesses

    private Scanner keyboard = new Scanner(System.in);

    /** generates a random number in the range of
     *  1 to 100 inclusive.
     */
    public void generateNumber()
    {
        number = (int)(Math.random() * 100 + 1);
    }

    /** Displays a prompt asking player to make a guess. It
     *  reads the guess and stores it in the variable
     *  myGuess. It also increments the variable numGuesses.
     */
    public void makeGuess()
    {
        System.out.print("Enter your guess: "); // prompt
        myGuess = keyboard.nextInt(); // read guess
        numGuesses++; // increment numGuesses
    }

    /* Determines whether player's guess was correct. If
     * myGuess was a match it returns true. If myGuess was
     * less than number then it displays the message
     * "Too Low, Try Again!" and returns false. If myGuess
     *  was greater than number then it displays the
     *  message "Too High, Try Again!" and returns false.
     */
    public boolean winner()
    {
        makeGuess(); // get guess
        if (myGuess == number) // check for match
        {
            return true;
        }
        else if (myGuess < number) // check for low guess
        {
            System.out.println("Too Low, Try Again!");
            return false;
        }
        else // check for high guess
        {
            System.out.println("Too High, Try Again!");
            return false;
        }
    }

    /** Generates the random number then allows the player to
     *  continually guess the random number until it is found.
     *  Once the number is found it displays a message
     *  indicating how many guesses it took to find the
     *  number.
     */
    public void playGame()
    {
        generateNumber(); // generate random number
        numGuesses = 0;  // initialize numGuesses
        while (!winner()){} // keep playing until the number is guessed
        System.out.println("You got it in " + numGuesses + " guesses."); // display number of guesses
    }

    public static void main (String[] args)
    {
        GuessingGame app = new GuessingGame(); // create instance of GuessingGame
        app.playGame(); // play the game
    }
}
