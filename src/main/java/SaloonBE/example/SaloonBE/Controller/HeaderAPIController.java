package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Header;
import SaloonBE.example.SaloonBE.Services.HeaderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/saloon")
public class HeaderAPIController{
    @Autowired
    private HeaderServices headerServices;









    // Update operation
    @PutMapping("/header/{id}")
    public Header updateHeader(@RequestBody Header header, @PathVariable("id") int id) {
        return headerServices.updateHeader(header, id);
    }
    @DeleteMapping("/deleteHeaderById/{id}")
    public String deleteHeaderById(@PathVariable("id")
                                       int id)
    {
        headerServices.deleteHeaderById(id);
        return "Deleted Successfully" + "With id "+ id;
    }
    @PostMapping("/postHeader")
    public Header saveHeader(@RequestBody Header header){
       return  headerServices.saveHeader(header);
    }
}


