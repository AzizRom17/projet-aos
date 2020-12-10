package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity

public class Electeur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_electeur;

    @OneToMany(mappedBy = "elec")
    private Collection<Avis> avis;


}
