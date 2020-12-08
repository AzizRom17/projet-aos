package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity

public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;

    @ManyToMany
    private Set<Activite> activites = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "cv_formation",
            joinColumns = @JoinColumn(name = "id_cv",referencedColumnName = "id_cv"),
            inverseJoinColumns = @JoinColumn(name = "id_formation",referencedColumnName = "id_formation"))
    private Set<Formation> formations = new HashSet<>();

    @OneToOne(mappedBy = "son_cv")
    private Candidat candidat;

    //private Activite activite;
    //private Formation etude;

  /*  @OneToMany(mappedBy = "ses_activites", cascade = CascadeType.ALL)
    private Set<Activite> activites = new HashSet<>();
    @OneToMany(mappedBy = "ses_etudes", cascade = CascadeType.ALL)
    private Set<Formation> formations = new HashSet<>();

    @OneToOne(mappedBy = "cv")
    private Candidat candidat;*/
}
