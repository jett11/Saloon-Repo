package SaloonBE.example.SaloonBE.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="service_type")
public class Service_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "service_type_service",
            joinColumns = @JoinColumn(name = "service_type_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id"))
    private List<Services> services;

    public Service_Type() {}
    public Service_Type(int id, String name, List<Services> services) {
        this.id = id;
        this.name = name;
        this.services = services;
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

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }
}
