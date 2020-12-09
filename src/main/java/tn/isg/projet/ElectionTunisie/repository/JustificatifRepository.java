package tn.isg.projet.ElectionTunisie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isg.projet.ElectionTunisie.model.Justificatif;
@RepositoryRestResource

public interface JustificatifRepository extends JpaRepository<Justificatif,Long> {
}
