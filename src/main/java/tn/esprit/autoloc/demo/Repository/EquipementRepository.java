package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
