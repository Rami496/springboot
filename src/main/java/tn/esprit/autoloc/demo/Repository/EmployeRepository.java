package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
