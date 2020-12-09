package tn.isg.projet.ElectionTunisie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.projet.ElectionTunisie.metiers.ICandidat;
import tn.isg.projet.ElectionTunisie.model.Candidat;
import tn.isg.projet.ElectionTunisie.repository.CandidatRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class CandidatImp implements ICandidat {
    @Autowired
    CandidatRepository CR;

    @Override
    public Collection<Candidat> getAllCandidats() {
        return CR.findAll();
    }

    @Override
    public Candidat addCandidat(Candidat c) {
        CR.save(c);
        return c;
    }

    @Override
    public String deleteCandidat(Long id) {
        CR.deleteById(id);
        return "Le candidat a été supprimé avec succés";
    }

    @Override
    public Candidat updateCandidat(Candidat c) {
        CR.save(c);

        return c;
    }

    @Override
    public Optional<Candidat> getCandidat(Long id) {
        return CR.findById(id);
    }
}
