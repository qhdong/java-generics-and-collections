package generics.chap9;

public class TreeClient {
    public static void main(String[] args) {
        Tree<Integer> t = Tree.branch(Tree.leaf(10), Tree.branch(Tree.leaf(2), Tree.leaf(3)));
        System.out.println(t);
        System.out.println(t.sum());
    }
}
