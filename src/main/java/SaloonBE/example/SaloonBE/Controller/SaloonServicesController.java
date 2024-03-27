package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import SaloonBE.example.SaloonBE.DTO.SalonServicesDTO;
import SaloonBE.example.SaloonBE.Repository.ServiceItemsRepository;
import SaloonBE.example.SaloonBE.Services.Saloon_Services_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@RequestMapping("/saloon")
public class SaloonServicesController {
    @Autowired
    private Salon_Services_Repository salonServicesRepository;
@Autowired
private Saloon_Services_Service saloonServicesService;


    @PostMapping("serviceSave")
    public ResponseEntity<Salon_Services> createSalonService(@RequestBody Salon_Services salon_services)
    {
        Salon_Services savedSalonService=salonServicesRepository.save(salon_services);
        return new ResponseEntity<>(savedSalonService, HttpStatus.CREATED);
    }


    @Autowired
    private Salon_Services_Repository salonServicesRepository;

    private ServiceItemsRepository serviceItemRepository;
    private Salon_Services_Repository saloonServicesRepository;

    @Autowired
    private Saloon_Services_Service serviceService;

    @GetMapping("serviceList")
    public List<Salon_Services> getAllSalonsWithServices() {

        return saloonServicesService.getAllSalonsWithServices();
    }

    @PostMapping("saveSaloonService")
    public ResponseEntity<String> addServices(@RequestBody SalonServicesDTO request) {
        serviceService.addServices(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("Services added successfully");
    }
}