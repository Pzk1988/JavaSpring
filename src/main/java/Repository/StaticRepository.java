package Repository;

import Model.Greeting;

import java.util.ArrayList;
import java.util.List;

public class StaticRepository implements IGreetingRepository {
    @Override
    public Greeting GiveSingleGreeting() {
        return new Greeting(101, "SingleGreeting");
    }

    @Override
    public List<Greeting> GiveFewGreeting() {
        List<Greeting> greetings = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            greetings.add(new Greeting(i, "Multimple Greeting" + i));
        }
        return greetings;
    }
}
