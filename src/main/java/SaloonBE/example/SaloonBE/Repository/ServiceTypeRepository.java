package SaloonBE.example.SaloonBE.Repository;

import SaloonBE.example.SaloonBE.Model.Service_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends JpaRepository<Service_Type, Integer> {
}