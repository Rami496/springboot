package tn.esprit.autoloc.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.demo.domain.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
