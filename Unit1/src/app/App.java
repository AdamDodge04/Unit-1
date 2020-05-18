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

        dog2.name = "Zeus";
        dog2.breed = "German Shepherd";
        dog2.age = 3;

        dog3.name = "Geno";
        dog3.breed = "Shiba Inu";
        dog3.age = 1;


        System.out.println("Dog 1");
        System.out.println("name: " + dog1.name);
        System.out.println("breed: " + dog1.breed);
        System.out.println("age: " + dog1.age);

        System.out.println("Dog 2");
        System.out.println("name: " + dog2.name);
        System.out.println("breed: " + dog2.breed);
        System.out.println("age: " + dog2.age);
        
        System.out.println("Dog 3");
        System.out.println("name: " + dog3.name);
        System.out.println("breed: " + dog3.breed);
        System.out.println("age: " + dog3.age);

    }
}
