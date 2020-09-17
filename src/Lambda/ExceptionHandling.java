package Lambda;

import Test.extendOrder;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int key = 0;

        process(nums, key, wrapperLambda((v, k) -> System.out.println(v / k)));
        /*{
            try {
                System.out.println(v / k);
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
         */
    }

    private static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for (int n : nums) {
            consumer.accept(n, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }
}
