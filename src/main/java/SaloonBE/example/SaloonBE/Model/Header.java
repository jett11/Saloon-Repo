package SaloonBE.example.SaloonBE.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "header")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String logo; // as the real image will be stored in the firestore bucket and it will generate a string url so the data type is string

    private String header_banner_image;
    private String menu;
    private String main_text;
    private String Welcome_text;
    private String description_below;
    private String button_name;


    public Header(){}

    public Header(int id, String logo, String header_banner_image, String menu, String main_text, String welcome_text, String description_below, String button_name) {
        this.id = id;
        this.logo = logo;
        this.header_banner_image = header_banner_image;
        this.menu = menu;
        this.main_text = main_text;
        this.Welcome_text = welcome_text;
        this.description_below = description_below;
        this.button_name = button_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeader_banner_image() {
        return header_banner_image;
    }

    public void setHeader_banner_image(String header_banner_image) {
        this.header_banner_image = header_banner_image;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getMain_text() {
        return main_text;
    }

    public void setMain_text(String main_text) {
        this.main_text = main_text;
    }

    public String getWelcome_text() {
        return Welcome_text;
    }

    public void setWelcome_text(String welcome_text) {
        Welcome_text = welcome_text;
    }

    public String getDescription_below() {
        return description_below;
    }

    public void setDescription_below(String description_below) {
        this.description_below = description_below;
    }

    public String getButton_name() {
        return button_name;
    }

    public void setButton_name(String button_name) {
        this.button_name = button_name;
    }
}
