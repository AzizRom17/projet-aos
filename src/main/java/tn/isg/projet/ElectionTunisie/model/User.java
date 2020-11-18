package tn.isg.projet.ElectionTunisie.model;

import lombok.*;

import javax.persistence.*;


@Data
@Entity

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String login;

    private String mdp;

}
