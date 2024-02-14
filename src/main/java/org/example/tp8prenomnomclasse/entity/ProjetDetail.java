package org.example.tp8prenomnomclasse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @ToString.Exclude
    @JsonIgnore
    Projet projet;
}
