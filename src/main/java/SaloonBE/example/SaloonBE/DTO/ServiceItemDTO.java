package SaloonBE.example.SaloonBE.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ServiceItemDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int salon_services_id;
    private Double price;

    public ServiceItemDTO(){}

    public ServiceItemDTO(int id, String name, int salon_services_id, Double price) {
        this.id = id;
        this.name = name;
        this.salon_services_id = salon_services_id;
        this.price = price;
    }

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

    public int getSalon_services_id() {
        return salon_services_id;
    }

    public void setSalon_services_id(int salon_services_id) {
        this.salon_services_id = salon_services_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}