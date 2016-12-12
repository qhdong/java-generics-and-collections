package generics.chap3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Compare implements Comparable<Compare> {
    private int value;
    public Compare(int value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Compare a = new Compare(10);
        Compare b = new Compare(20);
        System.out.println(a.compareTo(b));

        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println(max(ints));

        List<String> strs = Arrays.asList("zero", "one", "two");
        System.out.println(max(strs));
    }

    @Override
    public int compareTo(Compare that) {
        return (this.value < that.value) ? -1 :
                (this.value == that.value) ? 0: 1;
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();
        while (i.hasNext()) {
            T next = i.next();
            if (candidate.compareTo(next) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }
}
