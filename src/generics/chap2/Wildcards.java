package generics.chap2;

import java.util.*;

/**
 * Get/Put Principle
 * only get -> ? extend T
 * only put -> ? super T
 * get & put -> none of extend and super
 */
public class Wildcards {
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 1.34);
        nums.addAll(ints);
        nums.addAll(dbls);
        System.out.println(nums);

        wildcard();

        testCopy();
    }

    public static void wildcard() {
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        List<? extends Number> nums = ints;
//        nums.add(3.3);
        System.out.println(nums);
    }

    public static void testCopy() {
        List<Object> objs = Arrays.asList(2, 3.14, "apple");
        List<Integer> ints = Arrays.asList(5, 6);
//        copy(objs, ints);
        Collections.copy(objs, ints);
        System.out.println(objs);
        objs = Objects.requireNonNull(objs);
    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }
}
