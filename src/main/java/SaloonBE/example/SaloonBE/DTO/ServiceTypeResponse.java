package SaloonBE.example.SaloonBE.DTO;

import java.util.List;

public class ServiceTypeResponse {
    private int id;
    private String image;
    private List<ServicesResponse> services;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ServicesResponse> getServices() {
        return services;
    }

    public void setServices(List<ServicesResponse> services) {
        this.services = services;
    }

    public ServiceTypeResponse(int id, String image, List<ServicesResponse> services) {
        this.id = id;
        this.image = image;
        this.services = services;
    }
   public ServiceTypeResponse(){}

}
