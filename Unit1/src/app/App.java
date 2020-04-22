package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 20; i >= 1; i--){
            System.out.println(i);
            if (i == 10){
                for (int j = 10; j > 3; j--){
                    System.out.println(i);
                }
            }
        }
        System.out.println("End first loop");

        System.out.println("Start second loop");
        for (int i = 0; i < 37; i = i + 4){
            System.out.println(i);
            if (i % 12 == 0){
                System.out.println("Hey!");
            }
        }
        System.out.println("End second loop");
    

    }
}
