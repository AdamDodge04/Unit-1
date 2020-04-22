package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for (int i = 0; i <= 19; i++) {
            System.out.println(i);
            if (i == 10) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("End first loop");

        System.out.println("Start second loop");
        for (int i = 0; i < 20; i = i + 2){
            if (i % 3 == 0){
                i = i - 1;
            }
            System.out.println(i);
        }
        
            

        
        System.out.println("End second loop");
        

    }
}
