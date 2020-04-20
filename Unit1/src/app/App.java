package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {

            if (i % 4 == 0) {
                System.out.println(i + " is divisible by 4");
            } else {
                System.out.println(i + " cannot be divided by 4");
            }
        }
        System.out.println("All finished");
    }
}
