package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.*;


@Data
@Entity

public class Electeur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_electeur;



}
