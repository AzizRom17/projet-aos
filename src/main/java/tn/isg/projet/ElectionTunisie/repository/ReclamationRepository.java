package tn.isg.projet.ElectionTunisie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isg.projet.ElectionTunisie.model.Reclamation;
@RepositoryRestResource

public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {
}
