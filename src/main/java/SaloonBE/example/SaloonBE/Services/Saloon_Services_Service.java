package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Salon_Services;
import SaloonBE.example.SaloonBE.Repository.Salon_Services_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Saloon_Services_Service {
    @Autowired
    private Salon_Services_Repository salonServicesRepository;

    public List<Salon_Services> getAllSalonsWithServices() {
        return salonServicesRepository.findAll();
    }
}
