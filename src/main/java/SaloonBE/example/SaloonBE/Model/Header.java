package SaloonBE.example.SaloonBE.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "header")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String logo;
    private String slogan;
    private String contact_email;
    private String contact_phone;
    private String address;
    private String social_media_links;
    private Date last_updated_date;

    public Header(){}
    public Header(int id, String logo, String slogan, String contact_email, String contact_phone, String address, String social_media_links, Date last_updated_date) {
        this.id = id;
        this.logo = logo;
        this.slogan = slogan;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.address = address;
        this.social_media_links = social_media_links;
        this.last_updated_date = last_updated_date;
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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocial_media_links() {
        return social_media_links;
    }

    public void setSocial_media_links(String social_media_links) {
        this.social_media_links = social_media_links;
    }

    public Date getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(Date last_updated_date) {
        this.last_updated_date = last_updated_date;
    }
}
