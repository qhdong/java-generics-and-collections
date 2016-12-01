package generics.chap2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Collection<?> == Collection<? extend Object>
 */
public class WildcardVersusType {
    public static void testContains() {
        Object obj = "one";
        List<Object> objs = Arrays.asList("one", 1, 2, 3);
        List<Integer> ints = Arrays.asList(1, 2, 3);
        System.out.println(objs.contains(obj));
        System.out.println(objs.containsAll(ints));
        System.out.println(ints.contains(obj));
        System.out.println(ints.containsAll(objs));
        reverse(objs);
        System.out.println(objs);

        List<?> list = factory();
        System.out.println(list.getClass());
        List<?> alist = WildcardVersusType.<Object>factory();
    }

    public static void main(String[] args) {
        testContains();
    }

    /**
     * 这里使用了`wild capture`技术，T捕获了<?>
     * @param list
     */
    public static void reverse(List<?> list) {
        rev(list);
    }

    private static <T> void rev(List<T> list) {
        List<T> tmp = new ArrayList<T>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size()-1-i));
        }
    }

    public static <T> List<T> factory() {
        return new ArrayList<T>();
    }
}
