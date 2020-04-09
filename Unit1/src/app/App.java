package app;

public class App {
    public static void main(String[] args) throws Exception {
       boolean livesInAlbertville = false;
       char firstLetterOfName = 'A';
       byte myAgeInYears = 15;
       Short myAgeInDays = 5830;
       int myAgeInMinutes = 8395453;
       long distanceFromPluto = 4670000000L;
       float firstSevenDigitsOfPi = (float) 3.1415926;
       double firstSixteenDigitsOfPi = 3.1415926535897932;


       System.out.println("The first sixteen digits of pi are");
       System.out.println(firstSixteenDigitsOfPi);
       System.out.println("The first seven digits of pi are");
       System.out.println(firstSevenDigitsOfPi);
       System.out.println("The distance from pluto in miles is");
       System.out.println(distanceFromPluto);
       System.out.println("My age in munutes is");
       System.out.println(myAgeInMinutes);
       System.out.println("My age in days is");
       System.out.println(myAgeInDays);
       System.out.println("My age in years is");
       System.out.println(myAgeInYears);
       System.out.println("The first letter of my name is");
       System.out.println(firstLetterOfName);
       System.out.println("Do I live in Albertville");
       System.out.println(livesInAlbertville);
    }
}
