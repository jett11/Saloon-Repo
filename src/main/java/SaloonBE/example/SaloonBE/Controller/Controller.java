package SaloonBE.example.SaloonBE.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // A simple message to display
    @GetMapping("/")
    public  String greeting()
    {
        return "Hello Team this is Controller demo to display message!";
    }
}
