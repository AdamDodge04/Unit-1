package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("How many inches are in a foot?");
        int inches = input.nextInt();
        if (inches == 12){
            System.out.println("CORRECT");
        }
        else {
            System.out.println("INCORRECT");
        }
        System.out.println("What is the capitol of Minnesota?");
        String answer = input2.nextLine();
        if (answer.equals("Saint Paul")){
            System.out.println("CORRECT");
        }
        else {
            System.out.println("INCORRECT");
        }
        System.out.println("What year is it?");
        int year = input3.nextInt();
        if (year == 2020){
            System.out.println("CORRECT");
        }
        else{
            System.out.println("INCORRECT");
        }
    }
}
