package SaloonBE.example.SaloonBE.Services;


import SaloonBE.example.SaloonBE.DTO.ServiceTypeResponse;
import SaloonBE.example.SaloonBE.DTO.ServicesResponse;
import SaloonBE.example.SaloonBE.DTO.SalonServicesDTO;
import SaloonBE.example.SaloonBE.DTO.ServiceItemDTO;
import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Model.Service_Items;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import SaloonBE.example.SaloonBE.Repository.ServiceItemsRepository;

import jakarta.transaction.Transactional;

import SaloonBE.example.SaloonBE.Repository.ServiceTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

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
    @Transactional
    public void updateSalonService(int id, SalonServicesDTO updatedData) {

        // Retrieve existing salon service from the database
        Salon_Services salonService = salonServicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Salon service not found with ID: " + id));

        // Update the fields with the new data
        salonService.setService_name(updatedData.getService_name());
        salonService.setImage(updatedData.getImage());
        // Update other properties as needed

        // Save the updated salon service
        salonServicesRepository.save(salonService);

        updatedData.getServices().forEach(itemRequest -> {
            Service_Items serviceItem = new Service_Items();
            serviceItem.setId(itemRequest.getId()); // This will set ID if it's not null, otherwise, it'll be null which is fine for insertions
            serviceItem.setName(itemRequest.getName());
            serviceItem.setPrice(itemRequest.getPrice());
            serviceItem.setSalon_services(salonService); // Set the salon_services_id
            serviceItemsRepository.save(serviceItem);
        });
    }
}





