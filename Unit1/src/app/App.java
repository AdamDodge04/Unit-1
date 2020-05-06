package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);
        Scanner input7 = new Scanner(System.in);
        Scanner input8 = new Scanner(System.in);
        Scanner input9 = new Scanner(System.in);
        Scanner input10 = new Scanner(System.in);
        Scanner input11 = new Scanner(System.in);
        Scanner input12 = new Scanner(System.in);
        Scanner input13 = new Scanner(System.in);
        Scanner input14 = new Scanner(System.in);

        System.out.println("Please enter a name.");
        String name = input.nextLine();

        System.out.println("Please enter a adjective");
        String adjective1 = input2.nextLine();

        System.out.println("Please enter a adjective");
        String adjective2 = input3.nextLine();

        System.out.println("Please enter a noun");
        String noun1 = input4.nextLine();

        System.out.println("Please enter a adjective");
        String adjective3 = input5.nextLine();

        System.out.println("Please enter a noun");
        String noun2 = input5.nextLine();
        
        System.out.println("Please enter a adjective");
        String adjective4 = input6.nextLine();

        System.out.println("Please enter a verb");
        String verb1 = input7.nextLine();

        System.out.println("Please enter a verb");
        String verb2 = input8.nextLine();

        System.out.println("Please enter a verb");
        String verb3 = input9.nextLine();

        System.out.println("Yesterday " + name + " and I went to the park.");
        System.out.println("On our way to the " + adjective1 + " park, we saw a " + adjective2 + " " + noun1 + " on a bike.");
        System.out.println("We also saw big " + adjective3 + " balloons tied to a " + noun2 + ".");
        System.out.println("Once we got to the " + adjective1 + " park, the sky turned " + adjective4 + ".");
        System.out.println("It started to " + verb1 + " and " + verb2 + ".");
        System.out.println(name + " and I " + verb3 + " all the way home.");
        System.out.println("Tomorrow we will try to go to the " + adjective1 + " park again and hope it dosen't " + verb1 + ".");
    }
}
