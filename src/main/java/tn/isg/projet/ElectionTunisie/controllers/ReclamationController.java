package tn.isg.projet.ElectionTunisie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.isg.projet.ElectionTunisie.model.Candidat;
import tn.isg.projet.ElectionTunisie.model.Reclamation;
import tn.isg.projet.ElectionTunisie.services.ReclamationImp;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {
    @Autowired
    ReclamationImp CI;

    @GetMapping("/getallreclamations")
    public Collection<Reclamation> getallReclamation() {
        return CI.getAllReclamation();
    }

    @PostMapping("/addreclamation")
    public Reclamation addReclamation(@RequestBody @Validated Reclamation c){
        return CI.addReclamation(c);

    }

    @DeleteMapping("/removereclamation/{id}")
    public String removeReclamation(@PathVariable String id){
        return CI.deleteReclamation(Long.parseLong(id));
    }


    @GetMapping("/getreclamation/{id}")
    public Optional<Reclamation> getReclamation(@PathVariable String id){
        return CI.getReclamation(Long.parseLong(id));

    }



    @PutMapping("updatereclamation/{id}")
    public String updateReclamation(@PathVariable(value = "id") Long medid, @RequestBody @Validated Reclamation c){
        Reclamation reclamation = CI.updateReclamation(c);
        if (reclamation==null){
            return "Impossible de faire la mise à jour!";
        }
        else{
            CI.addReclamation(c);
            return "La réclamation a été mis à jour avec succés";

        }


    }
}