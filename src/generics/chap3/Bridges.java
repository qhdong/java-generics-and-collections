package generics.chap3;

import java.lang.reflect.Method;

public class Bridges {
    public Bridges clone() {
        return new Bridges();
    }

    public static void main(String[] args) {
        for (Method m : Bridges.class.getMethods()) {
            if (m.getName().equals("clone")) {
                System.out.println(m.toGenericString());
            }
        }
    }
}

