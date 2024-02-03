package org.example.tp8prenomnomclasse.services;

import org.example.tp8prenomnomclasse.entity.Projet;

import java.util.List;
import java.util.Optional;

public interface IProjetService {
    public List<Projet> retrieveAllProjects();
    public Optional<Projet> retrieveProjet(Long projetId);
    public Projet addProjet(Projet c);
    public void removeProjet(Long projetId);
    public Projet modifyProjet(Projet projet);
}
