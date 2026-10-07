package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Contrat;
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
