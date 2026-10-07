package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
