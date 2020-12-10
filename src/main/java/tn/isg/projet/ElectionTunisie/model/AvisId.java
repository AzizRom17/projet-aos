package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode//Essentiel pour la comparaison des deux colones
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
//On doit presiser implements Serializble dans une classe Embeddable
public class AvisId implements Serializable {
    @Column(name ="id_electeur")
    private Long electeurId;
    @ Column(name ="id_candidat")
    private Long candidatId;
}
