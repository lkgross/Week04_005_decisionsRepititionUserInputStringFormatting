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
        powerWhile(1);
        powerWhile(5);
        // power(10);
        switchExample(1);
        switchExample(8);
        System.out.println("Laura".toLowerCase());
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many powers of two do you want?");
        // nextInt: Java reads the first integer it finds in the buffer
        int numberOfPowers = keyboard.nextInt();
        power(numberOfPowers);
        System.out.println("Your int is " + numberOfPowers);
        System.out.println("What is your first name?");
        // next: Java reads the first string it finds in the buffer, ignoring any newline character
        String firstName = keyboard.next();
        System.out.println("What is your last name?");
        // nextLine: Java reads the first string it finds in the buffer, including a newline character
        // (This means nextLine will "consume" a newline character it finds in the buffer.)
        String lastName = keyboard.nextLine();
        System.out.println("Your name is " + firstName + " " + lastName);
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        System.out.println("You are " + age);


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