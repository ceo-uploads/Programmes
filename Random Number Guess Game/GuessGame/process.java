package GuessGame; // package declaration...

// utility imports...

import java.util.Scanner;

public class process {
    public int highCount = 0; // higher count...
    public int lowCount = 0; // lower count...
    public int winCount = 0; // win count...

    public int getHighCount() {
        return highCount; // to access the highCount variable...
    }

    public int getLowCount() {
        return lowCount; // to access the lowCount variable...
    }

    public int getWinCount() {
        return winCount; // to access the winCount variable...
    }

    public void start(int number) {
        @SuppressWarnings("resource")
        // Scanner object...
        Scanner input = new Scanner(System.in);
        // loop for usage...
        while (true) {
            System.out.println();
            System.out.println("Guess a random Number(0 to " + number + "): ");
            int guess = input.nextInt(); // taking the guess of user...
            int random = (int) (Math.random() * number); // math operation for a random number...
            // branching to justify the guess condition...
            if (guess == random) {
                System.out.println();
                System.out.println("Congratulations! you Won...!"); // winning msg...
                winCount++;
            } else if (guess < random) {
                System.out.println();
                System.out.println("Your Guess is Lower..!"); // lower msg...
                System.out.println("The Number was: " + random);
                lowCount++;
            } else if (guess > random) {
                System.out.println();
                System.out.println("Your Guess is Higher..!"); // higher msg...
                System.out.println("The Number was: " + random);
                highCount++;
            } else {
                System.out.println();
                System.err.println("Enter you Guess Between 0 to " + number + ".."); // error msg...
            }

            return;
        }
    }
}
