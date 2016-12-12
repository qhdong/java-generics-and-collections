package generics.chap9.visitor.tree;

/**
 * Created by aaron on 16-12-12.
 */
public class TreeClient {
    public static <T> String toString(Tree<T> t) {
        return t.visit(new Tree.Visitor<T, String>() {
            public String leaf(T e) {
                return e.toString();
            }

            public String branch(String l, String r) {
                return "(" + l + "^" + r + ")";
            }
        });
    }

    public static void main(String[] args) {
        Tree<Integer> t = Tree.branch(Tree.branch(Tree.leaf(1), Tree.leaf(2)), Tree.leaf(3));
        System.out.println(toString(t));
    }
}
