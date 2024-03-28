package SaloonBE.example.SaloonBE.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.util.List;
@Table(name = "salon_services", uniqueConstraints = @UniqueConstraint(columnNames = {"service_name"}))
@Entity
public class Salon_Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String image;

    @Column(name = "service_name")
    private String service_name;

   /* @OneToMany(mappedBy = "service_name", cascade = CascadeType.ALL)*/
   @OneToMany(mappedBy = "salon_services", cascade = CascadeType.ALL)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Service_Items> services;

    public Salon_Services(){}

    public Salon_Services(int id, String image, String service_name, List<Service_Items> services) {
        this.id = id;
        this.image = image;
        this.service_name = service_name;
        this.services = services;
    }

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

    public List<Service_Items> getServices() {
        return services;
    }

    public void setServices(List<Service_Items> services) {
        this.services = services;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}