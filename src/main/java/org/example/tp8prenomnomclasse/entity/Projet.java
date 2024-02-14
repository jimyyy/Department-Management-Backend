package org.example.tp8prenomnomclasse.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProjet;

    String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetDetail;

    @ManyToMany(mappedBy = "projets",fetch = FetchType.EAGER)
    Set<Equipe> equipes;


}
