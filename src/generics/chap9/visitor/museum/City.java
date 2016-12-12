package generics.chap9.visitor.museum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 16-12-12.
 */
public class City implements Visitable {
    List<Visitable> places = new ArrayList<>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting visitor.");
        visitor.visit(this);

        for (Visitable e : places) {
            e.accept(visitor);
        }
    }
}

class Museum implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visior.");
    }
}

class Park implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting visior.");
    }
}

