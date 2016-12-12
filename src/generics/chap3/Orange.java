package generics.chap3;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Orange extends Fruit {
    public Orange(double size) {
        name = "Orange";
        this.size = size;
    }


    @Override
    public String toString() {
        return "Orange{size=" + size + "}";
    }
}
