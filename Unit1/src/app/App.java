package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean earthIsRound = true;


        while (count <= 10){
            System.out.println("The count is " + count);
            count = count + 1;
        }

        System.out.println("count finished");

        while (color == "red"){
            System.out.println("The color is " + color);
            color = "green";
        }

        System.out.println("Color finished");

        while (earthIsRound == true){
            System.out.println("The earth is round = " + earthIsRound);
            earthIsRound = false;
        }
        

     

    }
}
