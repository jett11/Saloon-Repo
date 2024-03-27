package SaloonBE.example.SaloonBE.Services;

<<<<<<< HEAD
import SaloonBE.example.SaloonBE.DTO.ServiceTypeResponse;
import SaloonBE.example.SaloonBE.DTO.ServicesResponse;
=======
import SaloonBE.example.SaloonBE.DTO.SalonServicesDTO;
import SaloonBE.example.SaloonBE.DTO.ServiceItemDTO;
>>>>>>> 67dfd4124123b316f499f010756b7555d396ab85
import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Model.Service_Items;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import SaloonBE.example.SaloonBE.Repository.ServiceItemsRepository;
<<<<<<< HEAD
import jakarta.transaction.Transactional;
=======
import SaloonBE.example.SaloonBE.Repository.ServiceTypeRepository;
>>>>>>> 67dfd4124123b316f499f010756b7555d396ab85
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Saloon_Services_Service {
    @Autowired
    private Salon_Services_Repository salonServicesRepository;

<<<<<<< HEAD

    @Autowired
    private ServiceItemsRepository serviceItemsRepository;

    public  void saveServiceTypeResponse(ServiceTypeResponse serviceTypeResponse) {
        String image = serviceTypeResponse.getImage();
        List<ServicesResponse> services = serviceTypeResponse.getServices();
    }

=======
    @Autowired
    private ServiceItemsRepository serviceItemsRepository;

>>>>>>> 67dfd4124123b316f499f010756b7555d396ab85
    public List<Salon_Services> getAllSalonsWithServices() {
        return salonServicesRepository.findAll();
    }

<<<<<<< HEAD



=======
    @Transactional
    public void addServices(SalonServicesDTO request) {
        // Create salon services entity
        Salon_Services salonServices = new Salon_Services();
        salonServices.setService_name(request.getService_name());
        salonServices.setImage(request.getImage());
        salonServicesRepository.save(salonServices);

        // Save service items with salon_services_id
        for (ServiceItemDTO itemRequest : request.getServices()) {
            Service_Items serviceItems = new Service_Items();
            serviceItems.setName(itemRequest.getName());
            serviceItems.setPrice(itemRequest.getPrice());
            serviceItems.setSalon_services(salonServices); // Set the salon_services_id
            serviceItemsRepository.save(serviceItems);
        }
    }
>>>>>>> 67dfd4124123b316f499f010756b7555d396ab85
}
