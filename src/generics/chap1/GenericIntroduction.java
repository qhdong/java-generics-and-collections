package generics.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Java的generic相较与C++的template有一些优势：
 *  - 基于erase，所以不会有C++的代码膨胀问题
 *  - 底层公用同一套代码，generic和nongeneric代码一样，方便维护
 * 也有一些缺点：
 *  - 性能问题
 */
public class GenericIntroduction {
    public static void main(String[] args) {
        genericMethod();
        nonGenericMethod();
        genericList();
    }

    public static void genericList() {
        List<String> words = new ArrayList<>();
        words.add("hello ");
        words.add("world");
        String s = words.get(0) + words.get(1);
        assert s.equals("hello world");
    }

    public static void genericMethod() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (int n : ints) s += n;
        assert s == 6;
    }

    public static void nonGenericMethod() {
        List ints = Arrays.asList(new Integer[] {
                new Integer(1), new Integer(2), new Integer(3)
        });
        int s = 0;
        for (Iterator it = ints.iterator(); it.hasNext();) {
            s += ((Integer)it.next()).intValue();
        }
        assert s == 6;

    }
}
