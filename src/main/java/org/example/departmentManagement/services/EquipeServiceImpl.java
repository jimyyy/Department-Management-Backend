package org.example.departmentManagement.services;

import lombok.AllArgsConstructor;
import org.example.departmentManagement.entity.Equipe;
import org.example.departmentManagement.entity.Projet;
import org.example.departmentManagement.repository.EquipeRepo;
import org.example.departmentManagement.repository.ProjetRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService {
    EquipeRepo equipeRepo;

    ProjetRepo projetRepo;

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

    public void assignProjetToEquipe(Long equipeId,Long projetId) {
        Projet projet = projetRepo.findById(projetId).get();
        Equipe equipe = equipeRepo.findById(equipeId).get();
        equipe.getProjets().add(projet);

        equipeRepo.save(equipe);
    }

    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepo.findById(projetId).get();
        Equipe equipe = equipeRepo.findById(equipeId).get();
// on enlève le fils du parent :
        equipe.getProjets().remove(projet);
        equipeRepo.save(equipe);
    }


}
