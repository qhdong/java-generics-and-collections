package generics.chap9.visitor.interpreter;

public abstract class Exp<T> {
    public abstract T eval();
    static Exp<Integer> lit(final int i) {
        return new Exp<Integer>() {
            public Integer eval() {
                return i;
            }
        };
    }

    static Exp<Integer> plus(final Exp<Integer> e1, final Exp<Integer> e2) {
        return new Exp<Integer>() {
            @Override
            public Integer eval() {
                return e1.eval() + e2.eval();
            }
        };
    }

    static <A, B> Exp<Pair<A, B>> pair(final Exp<A> e1, final Exp<B> e2) {
        return new Exp<Pair<A, B>>() {
            public Pair<A, B> eval() {
                return new Pair<A, B>(e1.eval(), e2.eval());
            }
        };
    }



}
