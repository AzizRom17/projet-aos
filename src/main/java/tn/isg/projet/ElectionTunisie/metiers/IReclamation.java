package tn.isg.projet.ElectionTunisie.metiers;



import tn.isg.projet.ElectionTunisie.model.Reclamation;

import java.util.Collection;
import java.util.Optional;

public interface IReclamation {
    public Collection<Reclamation> getAllReclamation();
    public Reclamation addReclamation(Reclamation c);
    public String deleteReclamation(Long id);
    public Reclamation updateReclamation(Reclamation c);
    public Optional<Reclamation> getReclamation(Long id);
}
