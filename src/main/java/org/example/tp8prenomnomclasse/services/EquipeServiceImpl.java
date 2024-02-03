package org.example.tp8prenomnomclasse.services;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Equipe;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;
import org.example.tp8prenomnomclasse.repository.EquipeRepo;
import org.example.tp8prenomnomclasse.repository.ProjetRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService {
    EquipeRepo equipeRepo;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepo.findAll();
    }

    @Override
    public Optional<Equipe> retrieveEquipe(Long equipeId) {
        return equipeRepo.findById(equipeId);
    }

    @Override
    public Equipe addEquipe(Equipe c) {
        return equipeRepo.save(c);
    }

    @Override
    public void removeEquipe(Long equipeId) {
        equipeRepo.deleteById(equipeId);

    }

    @Override
    public Equipe modifyEquipe(Equipe equipe) {
        return equipeRepo.save(equipe);
    }
}
