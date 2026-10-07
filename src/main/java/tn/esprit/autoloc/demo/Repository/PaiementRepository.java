package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
