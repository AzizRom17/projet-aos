package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity

public class Etude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_etude;


    @ManyToMany
    private Set<Cv> Cvs = new HashSet<>();
/*
    @ManyToOne
    @JoinColumn(name = "id_cv" )
    private Cv cv_etude;
*/


}
