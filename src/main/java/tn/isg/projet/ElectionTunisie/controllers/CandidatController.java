package tn.isg.projet.ElectionTunisie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.isg.projet.ElectionTunisie.model.Candidat;
import tn.isg.projet.ElectionTunisie.services.CandidatImp;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/candidat")
public class CandidatController {
    @Autowired
    CandidatImp CI;

    @GetMapping("/getallcandidats")
    public Collection<Candidat> getallcandidats() {
        return CI.getAllCandidats();
    }

    @PostMapping("/addcandidat")
    public Candidat addCandidat(@RequestBody @Validated Candidat c){
        return CI.addCandidat(c);

    }
    @DeleteMapping("/removecandidat/{id}")
    public String removeCandidat(@PathVariable String id){
        return CI.deleteCandidat(Long.parseLong(id));
    }
    @GetMapping("/getcandidat/{id}")
    public Optional<Candidat> getcandidat(@PathVariable String id){
        return CI.getCandidat(Long.parseLong(id));

    }
    @PutMapping("updateCandidat/{id}")
    public String updatecandidat(@PathVariable(value = "id") Long medid, @RequestBody @Validated Candidat c){
        Candidat candidat = CI.updateCandidat(c);
        if (candidat==null){
            return "Impossible de faire la mise à jour!";
        }
        else{
            CI.addCandidat(c);
            return "Le candidat a été mis à jour avec succés";

        }


    }
}
