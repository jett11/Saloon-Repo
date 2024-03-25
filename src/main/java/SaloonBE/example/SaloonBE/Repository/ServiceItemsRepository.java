package SaloonBE.example.SaloonBE.Repository;

import SaloonBE.example.SaloonBE.Model.Service_Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceItemsRepository extends JpaRepository<Service_Items, Integer> {
}
