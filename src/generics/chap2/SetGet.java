package generics.chap2;

import java.util.*;

public class SetGet {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println(sum(ints));
        Deque<Double> dbls = new ArrayDeque<>();
        dbls.add(2.2);
        dbls.add(3.3);
        System.out.println(sum(dbls));

        testCount();

        List<Number> nums = new ArrayList<>();
        System.out.println(sumCount(nums, 5));
    }

    public static double sum(Collection<? extends Number> nums) {
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

    public static void testCount() {
        List<Integer> ints = new ArrayList<>();
        count(ints, 5);
        System.out.println(ints);
        List<Object> objs = new ArrayList<>();
        count(objs, 5);
        objs.add("apple");
        System.out.println(objs);
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) {
            ints.add(i);
        }
    }

    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }
}
