package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
