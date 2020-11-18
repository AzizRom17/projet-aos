package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity

public class Activite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_activite;
    private String duree;
    private String type;
    private String support;

    @OneToMany(mappedBy = "Activite_justif",cascade = CascadeType.ALL)
    private Set<Justificatif> justificatifs = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "cv_activite",
            joinColumns = @JoinColumn(name = "id_activite",referencedColumnName = "id_activite"),
            inverseJoinColumns = @JoinColumn(name = "id_cv",referencedColumnName = "id_cv"))
    private Set<Cv> Cvs = new HashSet<>();
/*
    @ManyToOne
    @JoinColumn(name = "id_candidat" )
    private Candidat sonActivite;

    @ManyToOne
    @JoinColumn(name = "id_cv" )
    private Cv son_cv;

    @OneToMany(mappedBy = "activite_justif", cascade = CascadeType.ALL)
    private Set<Justificatif> justificatifs = new HashSet<>();*/
}
