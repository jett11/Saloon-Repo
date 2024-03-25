package SaloonBE.example.SaloonBE.DTO;

public class ServicesResponse {
    private String name;

    public ServicesResponse(){}

    public ServicesResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
