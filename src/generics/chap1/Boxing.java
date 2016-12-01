package generics.chap1;

import java.util.Arrays;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        List<Integer> bigs = Arrays.asList(100, 200, 300);
        assert sumInteger(bigs) == sum(bigs);
        assert sumInteger(bigs) != sumInteger(bigs);
        List<Integer> smalls = Arrays.asList(1, 2, 3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls);
    }

    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n;
        }
        return s;
    }

    public static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }
}
