package generics.chap1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<Double> ints = Arrays.asList(-1.0, 2.2, 1.5, 0.5);
        removeNegative(ints);
        System.out.println(ints);
    }

    public static void removeNegative(List<Double> v) {
        for (Iterator<Double> it = v.iterator(); it.hasNext();) {
            if (it.next() < 0) it.remove();
        }
    }

    public static double dot(List<Double> u, List<Double> v) {
        if (u.size() != v.size()) throw new IllegalArgumentException("different sizes");
        double d = 0;
        Iterator<Double> uIt = u.iterator();
        Iterator<Double> vIt = v.iterator();
        while (uIt.hasNext()) {
            assert uIt.hasNext() && vIt.hasNext();
            d += uIt.next() * vIt.next();
        }
        assert !uIt.hasNext() && !vIt.hasNext();
        return d;
    }
}
