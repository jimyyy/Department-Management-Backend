package org.example.tp8prenomnomclasse.repository;

import org.example.tp8prenomnomclasse.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepo extends JpaRepository<Projet,Long> {
    Projet findProjetBySujet(String sujet);
}
