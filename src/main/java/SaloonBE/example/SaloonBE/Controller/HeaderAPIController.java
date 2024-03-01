package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Header;
import SaloonBE.example.SaloonBE.Services.HeaderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saloon")   // RequestMapping can be used in Class level and method level too
public class HeaderAPIController {
    @Autowired
    private HeaderServices headerServices;
    // GetMapping can be used only in method level and for only GET Https method
    @GetMapping("/header") // pass 1 as id in the parameter to see how to fetch the data by passing id.
    public List<Header> fetchHeaderList(){
        return headerServices.fetchHeaderList();
    }
}
