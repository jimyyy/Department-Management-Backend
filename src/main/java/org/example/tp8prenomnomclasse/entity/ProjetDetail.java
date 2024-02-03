package org.example.tp8prenomnomclasse.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjetDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProjetDetail;

    String description;
    String technologie;
    Long cout;
    Date dateDebut;
    @OneToOne(mappedBy = "projetDetail")
    Projet projet;
}
