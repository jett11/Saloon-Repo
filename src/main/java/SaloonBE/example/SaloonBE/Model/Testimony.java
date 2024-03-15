package SaloonBE.example.SaloonBE.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "testimonial")
public class Testimony {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String feedback;
    private int rating;
    private String imageUrl;

    public String getCustomerName() {
        return customerName;
    }

    public Testimony() {
    }

    public Testimony(Long id, String customerName, String feedback, int rating, String imageUrl) {
        this.id = id;
        this.customerName = customerName;
        this.feedback = feedback;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
