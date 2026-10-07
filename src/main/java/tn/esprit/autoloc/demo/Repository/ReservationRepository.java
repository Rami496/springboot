package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.demo.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
