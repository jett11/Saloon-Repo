package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.DTO.SalonServicesDTO;
import SaloonBE.example.SaloonBE.DTO.ServiceItemDTO;
import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Model.Service_Items;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import SaloonBE.example.SaloonBE.Repository.ServiceItemsRepository;
import SaloonBE.example.SaloonBE.Repository.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Saloon_Services_Service {
    @Autowired
    private Salon_Services_Repository salonServicesRepository;

    @Autowired
    private ServiceItemsRepository serviceItemsRepository;

    public List<Salon_Services> getAllSalonsWithServices() {
        return salonServicesRepository.findAll();
    }

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
}
