package tn.isg.projet.ElectionTunisie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.projet.ElectionTunisie.metiers.IReclamation;
import tn.isg.projet.ElectionTunisie.model.Reclamation;
import tn.isg.projet.ElectionTunisie.repository.ReclamationRepository;

import java.util.Collection;
import java.util.Optional;
@Service
public class ReclamationImp implements IReclamation {

    @Autowired
    ReclamationRepository CR;

    @Override
    public Collection<Reclamation> getAllReclamation() {
        return CR.findAll();
    }

    @Override
    public Reclamation addReclamation(Reclamation c) {
        CR.save(c);
        return c;
    }

    @Override
    public String deleteReclamation(Long id) {
        CR.deleteById(id);
        return "Le candidat a été supprimé avec succés";
    }

    @Override
    public Reclamation updateReclamation(Reclamation c) {
        CR.save(c);

        return c;
    }

    @Override
    public Optional<Reclamation> getReclamation(Long id) {
        return CR.findById(id);
    }
}


