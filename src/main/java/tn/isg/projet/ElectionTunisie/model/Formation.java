package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity

public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_formation;


    @ManyToMany
    private Set<Cv> Cvs = new HashSet<>();

    @OneToMany(mappedBy = "id_justificatif")
    private Set<Justificatif> justificatifs;
/*
    @ManyToOne
    @JoinColumn(name = "id_cv" )
    private Cv cv_etude;
*/


}
