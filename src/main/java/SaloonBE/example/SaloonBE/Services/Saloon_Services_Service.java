package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.DTO.ServiceTypeResponse;
import SaloonBE.example.SaloonBE.DTO.ServicesResponse;
import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import SaloonBE.example.SaloonBE.Repository.ServiceItemsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Saloon_Services_Service {
    @Autowired
    private Salon_Services_Repository salonServicesRepository;


    @Autowired
    private ServiceItemsRepository serviceItemsRepository;

    public  void saveServiceTypeResponse(ServiceTypeResponse serviceTypeResponse) {
        String image = serviceTypeResponse.getImage();
        List<ServicesResponse> services = serviceTypeResponse.getServices();
    }

    public List<Salon_Services> getAllSalonsWithServices() {
        return salonServicesRepository.findAll();
    }




}
