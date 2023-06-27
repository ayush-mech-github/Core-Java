import java.util.Random;
import java.util.Scanner;

class Game {

    public int number;
    public int noOfGuesses;
    public int inputNumber;

    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("you guessed it in " + noOfGuesses + " attempts");
            return true;
        } else if (inputNumber < number) {
            System.out.println("too less...");
        } else {
            System.out.println("too high...");
        }
        return false;

    }

    public int getNoOfGuesses() {
        return (noOfGuesses);
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class RandomNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
           // System.out.println(b);
        }
    }
}
