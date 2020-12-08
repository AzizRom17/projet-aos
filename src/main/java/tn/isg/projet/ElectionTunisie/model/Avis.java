package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_avis;
    @NonNull
    private String nom;
    @NonNull
    private String note;
    @NonNull
    private String commentaire;


    //Juste pour tester !!!!
    public Avis(@NonNull String nom, @NonNull String note, @NonNull String commentaire) {
        this.nom = nom;
        this.note = note;
        this.commentaire = commentaire;
    }

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat sonCandidat;



    /*@ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat_a;
*/
}
