package SaloonBE.example.SaloonBE.Repository;

import SaloonBE.example.SaloonBE.Model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {
}
