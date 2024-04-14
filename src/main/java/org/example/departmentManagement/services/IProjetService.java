package org.example.departmentManagement.services;

import org.example.departmentManagement.entity.Projet;

import java.util.List;
import java.util.Optional;

public interface IProjetService {
    public List<Projet> retrieveAllProjects();
    public Optional<Projet> retrieveProjet(Long projetId);
    public Optional<Projet> retrieveProjetBySujet(String sujet);
    public Projet addProjet(Projet c);
    public void removeProjet(Long projetId);
    public Projet modifyProjet(Projet projet);
}
