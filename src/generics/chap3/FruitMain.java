package generics.chap3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<Orange> oranges = Arrays.asList(new Orange(1.1), new Orange(2.2), new Orange(3.3));
        List<Apple> apples = Arrays.asList(new Apple(2.1), new Apple(5.2), new Apple(1.3));
        System.out.println(max(oranges));
        System.out.println(max(apples));
        List<Fruit> fruits = Arrays.asList(new Orange(1.2), new Apple(3.3));
        System.out.println(max(fruits));
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (candidate.compareTo(next) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }
}
