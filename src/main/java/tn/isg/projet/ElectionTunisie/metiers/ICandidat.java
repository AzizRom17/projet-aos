package tn.isg.projet.ElectionTunisie.metiers;

import tn.isg.projet.ElectionTunisie.model.Candidat;

import java.util.Collection;
import java.util.Optional;

public interface ICandidat {
    public Collection<Candidat> getAllCandidats();
    public Candidat addCandidat(Candidat c);
    public String deleteCandidat(Long id);
    public Candidat updateCandidat(Candidat c);
    public Optional<Candidat> getCandidat(Long id);

}
