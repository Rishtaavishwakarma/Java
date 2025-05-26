// Create a class Game, which allows a user to play "Guess the Number" game once.
// Game should have the following methods:
// Constructor to generate the random number
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Random;
import java.util.Scanner;

class Random_num {

    public Random_num() {
        Random r = new Random();
        int n = r.nextInt(5);
        // System.out.println("computer input" + n);
    }

    public static void userInput() {

    }

}

class cwh_05_game1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random_num rn = new Random_num();
    }
}
