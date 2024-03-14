package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Testimony;

import java.util.List;

public interface TestimonialServices {

    List<Testimony> fetchTestimonyList();

    Testimony updateTestimony(Testimony testimony, Long id);

    void deleteTestimonyById(Long id);
}
