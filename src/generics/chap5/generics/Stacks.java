package generics.chap5.generics;

/**
 * Created by aaron on 16-12-10.
 */
public class Stacks {
    public static <T> Stack<T> reverse(Stack<T> in) {
        Stack<T> out = new ArrayStack<T>();
        while (!in.empty()) {
            out.push(in.pop());
        }
        return out;
    }
}
