package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_avis;
    @NonNull
    private String nom;
    @NonNull
    private String notr;
    @NonNull
    private String commentaire;

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat sonCandidat;

    /*@ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat_a;
*/
}
