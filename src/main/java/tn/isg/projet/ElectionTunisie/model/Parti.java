package tn.isg.projet.ElectionTunisie.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Parti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_parti;
    @NonNull
    private String nom;

    @ManyToMany
    private Set<ListeDeCandidats> ListesCandidats = new HashSet<>();

/*
    @ManyToMany
    @JoinTable(
            name = "parti_liste",
            joinColumns =
            @JoinColumn(name = "id_parti",referencedColumnName = "id_parti"),
            inverseJoinColumns =
            @JoinColumn(name="id_liste",referencedColumnName = "id_liste")
    )
    private Set<ListeDeCandidats> listes=new HashSet<>();
*/

}

