package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Services.Saloon_Services_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saloon")
public class SaloonServicesController {
    @Autowired
    private Saloon_Services_Service saloonServicesService;

    @GetMapping("serviceList")
    public List<Salon_Services> getAllSalonsWithServices() {
        return saloonServicesService.getAllSalonsWithServices();
    }
}
