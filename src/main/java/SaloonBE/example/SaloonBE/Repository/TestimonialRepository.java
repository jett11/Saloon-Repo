package SaloonBE.example.SaloonBE.Repository;

import SaloonBE.example.SaloonBE.Model.Testimony;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepository extends JpaRepository<Testimony,Long> {
}
