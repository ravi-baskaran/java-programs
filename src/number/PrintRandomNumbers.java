package number;

import java.util.Random;

public class PrintRandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        random.ints(1,50).limit(5).forEach(System.out::println);

    }
}
