package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name. ");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name. ");
        String lastName = input.nextLine();

        System.out.println("Please enter your age. ");
        String age = input.nextLine();

        System.out.println("What grade are you in? ");
        String grade = input.nextLine();

        System.out.println("What is your favorite color? ");
        String favColor = input.nextLine();
        


        System.out.println("Hello " + firstName + " " + lastName);
        System.out.println("Age = " + age);
        System.out.println("Grade = " + grade);
        System.out.println("Favorite color is, " + favColor);
    }
}
