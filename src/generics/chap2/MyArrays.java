package generics.chap2;

import java.util.List;

public class MyArrays {
    public static void main(String[] args) {
        testArrs();
    }

    public static void testArrs() {
        Integer[] ints = new Integer[]{1, 2, 3};
        Number[] nums = ints;
        nums[0] = 3.3;
    }

    public static void testList() {
        List<Integer> ints = java.util.Arrays.asList(1, 2, 3);
        List<? extends Number> nums = ints;
//        nums.set(0, 4);

    }
}
