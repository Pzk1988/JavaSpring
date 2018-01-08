package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody()
    String Home(){
        return "This is home controller, post request";
    }

    @RequestMapping("/Home")
    String Home1(){
        return "HomeIndex";
    }

    @RequestMapping("/Home2")
    @ResponseBody
    String Home2(@RequestParam(value="firstname", required=true) String firstname)
    {
        return "Kurwa co to jest";
    }
}
