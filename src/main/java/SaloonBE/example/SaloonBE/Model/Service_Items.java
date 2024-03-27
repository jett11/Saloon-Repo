package SaloonBE.example.SaloonBE.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Service_Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Double price;

    private int numberOfServices;
    @ManyToOne
    @JoinColumn(name = "salon_services_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Salon_Services salon_services;

    public int getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public Service_Items(int id, String name, Salon_Services salon_service, Double price) {
        this.id = id;
        this.name = name;
        this.salon_services = salon_services;
        this.price = price;
        this.numberOfServices = numberOfServices;
    }

    public Service_Items(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salon_Services getSalon_services() {
        return salon_services;
    }

    public void setSalon_services(Salon_Services salon_services) {
        this.salon_services = salon_services;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
