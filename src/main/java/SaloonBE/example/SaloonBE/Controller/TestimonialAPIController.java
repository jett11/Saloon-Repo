package SaloonBE.example.SaloonBE.Controller;

import SaloonBE.example.SaloonBE.Model.Header;
import SaloonBE.example.SaloonBE.Model.Testimony;
import SaloonBE.example.SaloonBE.Services.TestimonialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saloon")
public class TestimonialAPIController {
    @Autowired
    private TestimonialServices testimonialServices;

    // getting the values from the testimonial table
    @GetMapping("/testimonial")
    public List<Testimony> fetchTestimonialList() {
        return testimonialServices.fetchTestimonyList();
    }

    @PutMapping("/testimonial/{id}")
    public Testimony updateTestimony(@RequestBody Testimony testimony, @PathVariable("id") Long id) {

        return testimonialServices.updateTestimony(testimony, id);
    }

    @DeleteMapping("/deleteTestimonyById/{id}")
    public String deleteTestimonyById(@PathVariable("id")
                                      Long id) {
        testimonialServices.deleteTestimonyById(id);
        return "Deleted Successfully" + "With id " + id;
    }


    @PostMapping("/postTestimony")
    public Testimony saveTestimony(@RequestBody Testimony testimony) {

        return testimonialServices.saveTestimony(testimony);
    }
}

