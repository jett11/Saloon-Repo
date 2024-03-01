package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saloon")   // RequestMapping can be used in Class level and method level too
public class HeaderAPIController {
    @GetMapping("/header/{id}") // pass 1 as id in the parameter to see how to fetch the data by passing id.
    public Header getHeader(String id){

        return new Header(1, "logo", "Saloon", "Welcome to saloon App",
                "Demo main text", "Home,Service,About,Contact");
    }
}
