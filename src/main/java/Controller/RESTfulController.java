package Controller;

import Model.Greeting;
import Repository.FukedUpRepository;
import Repository.IGreetingRepository;
import Repository.StaticRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class RESTfulController {

    private IGreetingRepository staticRepository;

    public RESTfulController(){
        Calendar calendar = Calendar.getInstance();

        if(calendar.get(Calendar.MINUTE) % 2 == 0)
        {
            System.out.println("It will be StaticRepository");
            staticRepository = new StaticRepository();
        }
        else
        {
            System.out.println("It will be FukedUpRepository");
            staticRepository = new FukedUpRepository();
        }
    }

    @RequestMapping("/greetingFew")
    public List<Greeting> multipleGreeting(){
        return staticRepository.GiveFewGreeting();
    }

    @RequestMapping("/greetingSingle")
    public Greeting singleGreeting(){
        return staticRepository.GiveSingleGreeting();
    }
}
