package SaloonBE.example.SaloonBE.Controller;
import SaloonBE.example.SaloonBE.entity.Service;
import SaloonBE.example.SaloonBE.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    // A simple message to display
    @GetMapping("/")
    public  String greeting()
    {
        return "Hello Team this is Controller demo to display message!";
    }
}
