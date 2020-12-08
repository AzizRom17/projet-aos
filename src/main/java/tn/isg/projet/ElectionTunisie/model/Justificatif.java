package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data

public class Justificatif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_justificatif;
    private String url;
    private byte photo;
    private byte video;
    private String document;
    //private Activite activite;
    @ManyToOne
    @JoinColumn(name = "activite_id" )
    private Activite Activite_justif;

    @ManyToOne
    @JoinColumn(name = "reclamation_id")
    private Reclamation reclamation_justif;

    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation_justif;
 /*   @ManyToOne
    private Activite activite_justif;*/
}