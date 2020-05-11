package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter another number");
        int number2 = input2.nextInt();

        System.out.println("Please choose 1 for *, 2 for /, 3 for -, 4 for +");
        int function = input3.nextInt();

        if (function == 1) {
            System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
        }
        if (function == 2) {
            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
        }
        if (function == 3) {
             System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        }
        if (function == 4) {
            System.out.println(number1  + " + " + number2 + " = " + number1 + number2);
        }
    }
}
