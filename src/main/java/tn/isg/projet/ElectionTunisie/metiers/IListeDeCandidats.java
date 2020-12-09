package tn.isg.projet.ElectionTunisie.metiers;
import tn.isg.projet.ElectionTunisie.model.ListeDeCandidats;
import java.util.Collection;
import java.util.Optional;

public interface IListeDeCandidats {
    public Collection<ListeDeCandidats> getAllLDC();
    public ListeDeCandidats addLDC(ListeDeCandidats l);
    public String deleteLDC(Long id);
    public ListeDeCandidats updateLDC(ListeDeCandidats l);
    public Optional<ListeDeCandidats> getLDC(Long id);
}
