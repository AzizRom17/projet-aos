package tn.isg.projet.ElectionTunisie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.projet.ElectionTunisie.model.ListeDeCandidats;
import tn.isg.projet.ElectionTunisie.metiers.IListeDeCandidats;
import tn.isg.projet.ElectionTunisie.repository.ListeDeCandidatsRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class ListeCandidatsImp implements IListeDeCandidats {

    @Autowired
    ListeDeCandidatsRepository LDC;

    @Override
    public Collection<ListeDeCandidats> getAllLDC() {
        return LDC.findAll();
    }

    @Override
    public ListeDeCandidats addLDC(ListeDeCandidats lcd) {
        LDC.save(lcd);
        return lcd;
    }

    @Override
    public String deleteLDC(Long id) {
        LDC.deleteById(id);
        return "La liste a été supprimé avec succés";
    }

    @Override
    public ListeDeCandidats updateLDC(ListeDeCandidats ldc) {
        LDC.save(ldc);

        return ldc;
    }

    @Override
    public Optional<ListeDeCandidats> getLDC(Long id) {
        return LDC.findById(id);
    }
}
