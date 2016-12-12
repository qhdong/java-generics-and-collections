package generics.chap3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Comparators {
    public static <T> T max(Collection<? extends T> coll, Comparator<? super T> cmp) {
        Iterator<? extends T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T next = it.next();
            if (cmp.compare(candidate, next) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        return max(coll, Comparators.<T>naturalOrder());
    }

    public static <T> T min(Collection<? extends T> coll, Comparator<? super T> cmp) {
        return max(coll, reverseOrder(cmp));
    }

    public static <T extends Comparable<? super T>> T min(Collection<? extends T> coll) {
        return max(coll, Comparators.<T>reverseOrder());
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public static <T> Comparator<T> reverseOrder(final Comparator<T> cmp) {
        return new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return cmp.compare(o2, o1);
            }
        };
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.compareTo(o1);
            }
        };
    }
}
