package generics.chap9.visitor.interpreter;

public class Pair<A, B> {
    private final A left;
    private final B right;
    public Pair(A l, B r) {
        left = l;
        right = r;
    }

    public A getLeft() {
        return left;
    }

    public B getRight() {
        return right;
    }
}
