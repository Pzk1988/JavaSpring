package Repository;

import Model.Greeting;
import java.util.List;

public interface IGreetingRepository {
    public Greeting GiveSingleGreeting();
    public List<Greeting> GiveFewGreeting();
}
