import java.util.random.RandomGenerator;

public class Main {

    // This is new branch
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello my  " + RandomGenerator.getDefault().nextInt() + " friend");
        }
    }

}