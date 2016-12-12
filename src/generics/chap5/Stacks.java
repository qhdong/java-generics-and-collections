package generics.chap5;

/**
 * utils class
 * Created by aaron on 16-12-10.
 */
public class Stacks {
    public static Stack reverse(Stack in) {
        Stack out = new ArrayStack();
        while (!in.empty()) {
            out.push(in.pop());
        }
        return out;
    }
}
