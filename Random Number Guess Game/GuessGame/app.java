package GuessGame;

// utility imports...
import java.util.Scanner;

public class app {
    public static void main(String[] args) { // main function of the main class...

        // welcome message...
        System.out.println(".........Welcome to our Guess Game.........");
        System.out.println(" -----------------------------------------");
        System.out.println();

        // objects...
        Scanner input = new Scanner(System.in);
        process check = new process();

        // taking commands to play - (yes/no)..
        String command = first(check, input);
        // taking difficulty level...
        int difficulty = checkDiff(input);
        System.out.println(); // a line-break...
        // branching...
        if (command.equals("yes")) {
            // if he firdt command is yes...
            check.start(difficulty); // calling the start function to play game..
        }

        // after play loop...
        while (true) {
            // commands for next...
            System.out.println();
            System.out.println("...What would you like to do next...!");
            int nextOption = next(check, input);
            // branching...
            switch (nextOption) {
                case 1:
                    check.start(difficulty); // if the command is 1...
                    break;
                case 2:
                    System.out.println(); // if the command is 2...
                    System.out.println("Higher Order Guess: " + check.getHighCount());
                    System.out.println("Lower Order Guess: " + check.getLowCount());
                    System.out.println("Winnings: " + check.getWinCount());
                    break;
                case 3:
                    System.out.println();
                    difficulty = checkDiff(input); // if the command is 3...
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Your Progress:"); // if the command is 4...
                    System.out.println("Higher Order Guess: " + check.getHighCount());
                    System.out.println("Lower Order Guess: " + check.getLowCount());
                    System.out.println("Winnings: " + check.getWinCount());
                    return;
                default:
                    System.err.println("... Select Valid optiona..."); // error msg...
            }
        }

    }

    public static String first(process check, Scanner input) { // initial playing...
        // a loop for usages...
        while (true) {
            System.out.println();
            System.out.print("Do You Want To Start! (Yes or No): ");
            String command = input.nextLine(); // input taking section(String)...
            command = command.toLowerCase(); // converting the String to lower case...
            // branching...
            if (command.compareTo("yes") == 0) {
                return command; // if yes...

            } else if (command.equals("no")) {
                System.out.println("Exiting...");
                System.out.println("You haven't played yet!" + "\n" + "You should give it a try...");
                return command; // if no...

            } else {
                System.out.println("...Error command..."); // error msg...
            }
            continue;
        }
    }

    public static int checkDiff(Scanner input) {
        // loop for usages...
        while (true) {
            int number;
            System.out.println("---------------------------------");
            System.out.println(".(01). Easy -         [0 to 10]");
            System.out.println(".(02). intermediate - [0 to 30]"); // difficulty level...
            System.out.println(".(03). Medium -       [0 to 50]");
            System.out.println(".(04). Advanced -     [0 to 80]");
            System.out.println(".(05). Hard -         [0 to 100]");
            System.out.println("---------------------------------");
            System.out.print("Select Difficulty: ");
            int difficulty = input.nextInt(); // inputs in integer..
            // branching for passing the value of difficulty level...
            if (difficulty == 1) {
                number = 10;
                return number;
            } else if (difficulty == 2) {
                number = 30;
                return number;
            } else if (difficulty == 3) {
                number = 50;
                return number;
            } else if (difficulty == 4) {
                number = 80;
                return number;
            } else if (difficulty == 5) {
                number = 100;
                return number;
            } else {
                System.err.println("...Error options selected..."); // error msg...
            }
        }
    }

    public static int next(process check, Scanner input) {
        // loop for usage...
        while (true) {
            System.out.println();
            System.out.println(".(01). Play Another Round-"); // commands after every round...
            System.out.println(".(02). View your progress-");
            System.out.println(".(03). Change difficulty-");
            System.out.println(".(04). Exit");
            System.out.println("-----------------------------");
            System.out.print("--Select Options: ");
            int opt = input.nextInt(); // taking commands for navigation...
            // branching for clearity...
            if (opt < 5 && opt > 0) {
                return opt;
            } else {
                System.err.println("Wrong Option.."); // error msg...
            }
        }
    }
}
