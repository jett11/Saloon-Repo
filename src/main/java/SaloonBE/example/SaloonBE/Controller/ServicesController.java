package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Service_Type;
import SaloonBE.example.SaloonBE.DTO.ServiceTypeResponse;
import SaloonBE.example.SaloonBE.DTO.ServicesResponse;
import SaloonBE.example.SaloonBE.Repository.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/saloon")
public class ServicesController {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @GetMapping("/services")
    public List<ServiceTypeResponse> getImagesWithServices() {
        List<Service_Type> service_types = serviceTypeRepository.findAll();
        List<ServiceTypeResponse> response = new ArrayList<>();
        for (Service_Type service_type : service_types) {
            List<ServicesResponse> serviceResponses = service_type.getServices().stream()
                    .map(service -> new ServicesResponse(service.getService_name()))
                    .collect(Collectors.toList());
            response.add(new ServiceTypeResponse(service_type.getId(), service_type.getName(), serviceResponses));
        }
        return response;
    }



}
