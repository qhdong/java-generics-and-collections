package generics.chap1;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static <T> List<T> toList(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T a : arr) {
            list.add(a);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> ints = toList(1, 2, 3);
        List<String> words = toList("hello", "world");

    }
}

