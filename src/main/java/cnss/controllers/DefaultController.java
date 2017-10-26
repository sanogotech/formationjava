package cnss.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

  
    @GetMapping("/404")
    public String error404() {
        return "/error/404";
    }

}
