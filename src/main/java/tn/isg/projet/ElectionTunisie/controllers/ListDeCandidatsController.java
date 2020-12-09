package tn.isg.projet.ElectionTunisie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.isg.projet.ElectionTunisie.model.ListeDeCandidats;
import tn.isg.projet.ElectionTunisie.services.ListeCandidatsImp;

import java.util.Collection;
import java.util.Optional;

public class ListDeCandidatsController {
    @Autowired
    ListeCandidatsImp LDCI;

    @GetMapping("/getAllLDC")
    public Collection<ListeDeCandidats> getAll() {
        return LDCI.getAllLDC();
    }

    @PostMapping("/addLDC")
    public ListeDeCandidats addLDC(@RequestBody @Validated ListeDeCandidats ldc){
        return LDCI.addLDC(ldc);

    }
    @DeleteMapping("/removeLDC/{id}")
    public String removeLDC(@PathVariable String id){
        return LDCI.deleteLDC(Long.parseLong(id));
    }

    @GetMapping("/getLDC/{id}")
    public Optional<ListeDeCandidats> getLDC(@PathVariable String id){
        return LDCI.getLDC(Long.parseLong(id));

    }
    @PutMapping("updateLDC/{id}")
    public String updateLDC(@PathVariable(value = "id") Long medid, @RequestBody @Validated ListeDeCandidats ldc){
        ListeDeCandidats ListeDeCandidats = LDCI.updateLDC(ldc);
        if (ListeDeCandidats==null){
            return "Impossible de faire la mise à jour!";
        }
        else{
            LDCI.addLDC(ldc);
            return "La liste a été mis à jour avec succés";

        }


    }
}
