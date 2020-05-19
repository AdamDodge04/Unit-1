package app;

import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Scanner input = new Scanner(System.in);

        dog1.name = "Beau";
        dog1.breed = "British Labrador";
        dog1.age = 6;
        dog1.favFood = "Pork";
        dog1.height = 22;
        dog1.favActivity = "Running";

        dog2.name = "Zeus";
        dog2.breed = "German Shepherd";
        dog2.age = 3;
        dog2.favFood = "Ice Cream";
        dog2.height = 24;
        dog2.favActivity = "Fetch";


        dog3.name = "Geno";
        dog3.breed = "Shiba Inu";
        dog3.age = 1;
        dog3.favFood = "Pizza";
        dog3.height = 18;
        dog3.favActivity = "Walks";


        System.out.println("Dog 1");
        System.out.println("name: " + dog1.name);
        System.out.println("breed: " + dog1.breed);
        System.out.println("age: " + dog1.age);
        System.out.println("Favorite Food: " + dog1.favFood);
        System.out.println("Height (in): " + dog1.height);
        System.out.println("Favorite Activity: " + dog1.favActivity);

        System.out.println("Dog 2");
        System.out.println("name: " + dog2.name);
        System.out.println("breed: " + dog2.breed);
        System.out.println("age: " + dog2.age);
        System.out.println("Favorite Food: " + dog2.favFood);
        System.out.println("Height (in): " + dog2.height);
        System.out.println("Favorite Activity: " + dog2.favActivity);
        
        System.out.println("Dog 3");
        System.out.println("name: " + dog3.name);
        System.out.println("breed: " + dog3.breed);
        System.out.println("age: " + dog3.age);
        System.out.println("Favorite Food: " + dog3.favFood);
        System.out.println("Height (in): " + dog3.height);
        System.out.println("Favorite Activity: " + dog3.favActivity);

    }
}
