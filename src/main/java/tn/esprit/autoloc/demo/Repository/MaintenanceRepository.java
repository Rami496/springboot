package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
