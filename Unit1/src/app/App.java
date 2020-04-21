package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for (int i = 0; i <= 19; i++) {
            System.out.println(i);
            if (i == 10) {
                System.out.println(i);
            }
        }
        System.out.println("End first loop");

        System.out.println("Start second loop");
        for (int i = -1; i <= 19; i = i + 2) {
            System.out.println(i);
            if (i % 1 == 0) {
                System.out.println(i = i + 1);
            }
            else {
                System.out.println(i = i + 1);
            }

        }
        System.out.println("End second loop");

    }
}
