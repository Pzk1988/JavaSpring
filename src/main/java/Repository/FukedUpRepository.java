package Repository;

import Model.Greeting;
import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class FukedUpRepository implements IGreetingRepository {
    @Override
    public Greeting GiveSingleGreeting() {
        return new Greeting(66, "Fucked up content");
    }

    @Override
    public List<Greeting> GiveFewGreeting() {
        List<Greeting> list = new ArrayList<>();
        list.add(new Greeting(12, "Fuck"));
        list.add(new Greeting(13, "Fuck 2"));
        return list;
    }
}
