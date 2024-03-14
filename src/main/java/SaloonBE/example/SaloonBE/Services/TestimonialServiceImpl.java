package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Testimony;
import SaloonBE.example.SaloonBE.Repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialServiceImpl implements TestimonialServices {


    @Autowired
    private TestimonialRepository testimonialRepository;



    @Override
    public List<Testimony> fetchTestimonyList() {
        return testimonialRepository.findAll();
    }

    @Override
    public Testimony updateTestimony(Testimony testimony, Long id) {
       System.out.println("Test" +id);

        Testimony newTestimony = testimonialRepository.findById(id).get();

        newTestimony.setCustomerName(testimony.getCustomerName());
        newTestimony.setFeedback(testimony.getFeedback());
        newTestimony.setImageUrl(testimony.getImageUrl());
        newTestimony.setRating(testimony.getRating());

        return testimonialRepository.save(newTestimony);
    }


}
