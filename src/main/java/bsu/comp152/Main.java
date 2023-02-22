package bsu.comp152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        continuez("y");
        powerWhile(32);
        powerWhile(16);
        powerWhile(8);
        powerWhile(4);
        powerWhile(2);
        powerWhile(-3);
        powerWhile(5);
        // power(10);
        switchExample(1);
        switchExample(8);
        System.out.println("Laura".toLowerCase());
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many powers of two do you want?");
        /*
         * When the user types keystrokes at the keyboard, those keystrokes are stored in an area of memory that is sometimes called the keyboard buffer.
         * Note Pressing the Enter key causes a newline character to be stored in the keyboard buffer.
         * Note nextInt will remove and return the first integer it finds in the keyboard buffer.
         */
        int numberOfPowers = keyboard.nextInt();
        power(numberOfPowers);
        System.out.println("Your int is " + numberOfPowers);
        System.out.println("What is your first name?");
         /*
        Sometimes a string contains a sequence of words or other items of data separated by spaces or other characters.
        In programming terms, such items as these are known as tokens.
        Note next will remove and return the first String token it finds in the keyboard buffer. It does not read newline characters as a token. It considers spaces to separate tokens.
         */
        String firstName = keyboard.next();
        System.out.println("What is your last name?");
        // nextLine: Java reads the first string token it finds in the buffer, including a newline character
        // (This means nextLine will "consume" a newline character it finds in the buffer.)
        // Unlike next, nextLine does not consider spaces to separate tokens.
        String lastName = keyboard.nextLine();
        System.out.println("Your name is " + firstName + " " + lastName);
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        System.out.printf("You are %d\n", age);
        // Use %s as a placeholder for a string.
        // Use %b as a placeholder for a boolean.
        System.out.printf("%s is %d\n", firstName, age);
        System.out.printf("If the value is %b, do the thing.\n", true);
        // Use %f as a placeholder for a decimal number.
        System.out.printf("Length is %f and width is %f\n", Math.sqrt(5), Math.sqrt(2));
        // We can specify the number of decimal digits, like 2:
        System.out.printf("Length is %.2f and width is %.2f\n", Math.sqrt(5), Math.sqrt(2));
        // We could allocate 12 spaces for a decimal number with 2 decimal digits:
        System.out.printf("Length is %12.2f and width is %12.2f\n", Math.sqrt(5), Math.sqrt(2));
        // Use %d as a placeholder for an integer ("digit"?).
        System.out.printf("Length is %d and width is %d\n", 100000, 10000);
        // We can include a comma in an integer.
        System.out.printf("Length is %,d and width is %,d\n", 100000, 10000);
    }

    /**
     * continuez-
     * Prints a message, depending on the value of proceed
     * @param proceed
     */
    public static void continuez(String proceed) {
        if (proceed.equals("y")) {
            System.out.println("Hello world!");
        } else if (proceed.equals("n")) {
            System.out.println("Let's quit!");
        } else {
            System.out.println("ERROR!");
        }
    }

    /**
     * powerWhile-
     * Calculates the log base 2 of n to within an integer.
     * @param n
     */
    public static void powerWhile(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("Only take the log base 2 of a positive number.");
        }
        int power = 1;
        int count = 0;
        while (power <= n / 2) {
            power = 2 * power;
            count++;
        }
        System.out.println("An integer for log base 2 of " + n +
                " is " + count);
    }

    public static void power(int numberOfPowersOfTwo){
        int n = numberOfPowersOfTwo - 1;
        int power = 1;
        /*
         * Declare and initialize a loop variable i with
         * int i = 0;
         * Continue the for loop so long as a loop-continuation
         * condition is met. Here it's:
         * i < n;
         * Increment the loop variable at each pass through the loop with
         * i++
         */
        for (int i = 0; i < n+1; i++){
            System.out.println(i + " " + power);
            power = 2*power;
        }
    }

    public static void switchExample(int day){
        // Each case needs to end with a break.
        switch (day) {
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}