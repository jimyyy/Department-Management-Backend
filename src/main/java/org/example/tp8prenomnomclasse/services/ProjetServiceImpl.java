package org.example.tp8prenomnomclasse.services;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.repository.ProjetRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class ProjetServiceImpl implements IProjetService {
    ProjetRepo projetRepo;
    @Override
    public List<Projet> retrieveAllProjects() {
        return projetRepo.findAll();
    }

    @Override
    public Optional<Projet> retrieveProjet(Long projetId) {
        return projetRepo.findById(projetId);
    }

    @Override
    public Projet addProjet(Projet c) {
        return projetRepo.save(c);
    }

    @Override
    public void removeProjet(Long projetId) {
        projetRepo.deleteById(projetId);

    }

    @Override
    public Projet modifyProjet(Projet projet) {
        return projetRepo.save(projet);
    }
}
