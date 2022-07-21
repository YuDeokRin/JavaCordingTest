package school;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class 로또번호자동생성기_Supplier {
    public static void main(String[] args) {
        Random random = new Random(45);
        Supplier<Integer> newRandom = () -> random.nextInt(45);
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int index = 1; index <= 5 ; index++) {
                System.out.print(newRandom.get() + " ");

            }
        }

        System.out.println("----------------------------");

        //auto-boxing 을 안하고 하기떄문에 그냥 Supplier보다 더 빠르다.
        IntSupplier newRandom_2 = () -> random.nextInt(45);

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(newRandom_2.getAsInt() + " ");
            }
        }


    }
}
