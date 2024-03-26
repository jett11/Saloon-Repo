package SaloonBE.example.SaloonBE.DTO;

import java.util.List;

public class SalonServicesDTO {
    private String image;

    private String service_name;
    private List<ServiceItemDTO> services;

    public SalonServicesDTO(String service_name, String image, List<ServiceItemDTO> services) {
        this.service_name = service_name;
        this.image = image;
        this.services = services;
    }

    public SalonServicesDTO(){}

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ServiceItemDTO> getServices() {
        return services;
    }

    public void setServices(List<ServiceItemDTO> services) {
        this.services = services;
    }
}
