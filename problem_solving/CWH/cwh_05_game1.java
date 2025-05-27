// Create a class Game, which allows a user to play "Guess the Number" game once.
// Game should have the following methods:
// Constructor to generate the random number
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Random;
import java.util.Scanner;

class Game {

    private int number;
    private int userGuess;
    // private int noOfGuesses;

    public Game() {
        Random r = new Random();
        this.number = r.nextInt(99) + 1;
        // this.noOfGuesses = 0;
        // System.out.println("computer input" + n);
    }

    public void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        this.userGuess = sc.nextInt();
        // noOfGuesses++;
    }

    public boolean isCorrectNumber() {
        if (userGuess == number) {
            System.out.println("you win");
            return true;
        } else if (userGuess < number) {
            System.out.println("too low ..");
        } else {
            System.out.println("Too high ..");
        }
        return false;
    }

    // public int getNoOfGuesses() {
    //     return noOfGuesses;
    // }
    // public void setNoOfGuesses(int guesses) {
    //     this.noOfGuesses = guesses;
    // }
}

class cwh_05_game1 {

    public static void main(String[] args) {
        Game g = new Game();
        boolean isCorrect = false;
        while (!isCorrect) {
            g.takeUserInput();
            isCorrect = g.isCorrectNumber();
        }

    }
}
