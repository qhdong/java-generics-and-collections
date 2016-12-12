package generics.chap9.visitor.postageservice;

import java.util.ArrayList;

/**
 * Created by aaron on 16-12-12.
 */
public class ShoppingCart {
    private ArrayList<Visitable> items;
    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();
        for (Visitable item: items) {
            item.accept(visitor);
        }

        return visitor.getTotalPostage();
    }
}
