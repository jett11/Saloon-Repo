package SaloonBE.example.SaloonBE.Model;

import jakarta.persistence.*;

@Entity
@Table(name="services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String service_name;
    public Services(){
    }
    public Services(int id, String service_name) {
        this.id = id;
        this.service_name = service_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
