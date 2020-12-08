package tn.isg.projet.ElectionTunisie.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity

public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rec;
    @NonNull
    private String Sujet;


    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat son_candidat;

    @OneToMany(mappedBy = "id_justificatif")
    private Set<Justificatif> justificatifs;

/*
    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat;*/


}
