package generics.chap9;

/**
 * Tree for visitor pattern
 * Created by aaron on 16-12-12.
 */
public abstract class Tree<E> {
    public abstract String toString();
    public abstract Double sum();

    public static <E> Tree<E> leaf(final E e) {
        return new Tree<E>() {
            @Override
            public String toString() {
                return e.toString();
            }

            @Override
            public Double sum() {
                return ((Number)e).doubleValue();
            }
        };
    }

    public static <E> Tree<E> branch(final Tree<E> l, final Tree<E> r) {
        return new Tree<E>() {
            @Override
            public String toString() {
                return "(" + l.toString() + "^" + r.toString() + ")";
            }

            @Override
            public Double sum() {
                return l.sum() + r.sum();
            }
        };
    }
}
