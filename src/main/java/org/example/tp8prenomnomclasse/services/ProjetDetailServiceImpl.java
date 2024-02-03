package org.example.tp8prenomnomclasse.services;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;
import org.example.tp8prenomnomclasse.repository.ProjetDetailRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ProjetDetailServiceImpl implements IProjetDetailService {
    ProjetDetailRepo projetDetailRepo;

    @Override
    public List<ProjetDetail> retrieveAllProjectsDetails() {
        return projetDetailRepo.findAll();
    }

    @Override
    public Optional<ProjetDetail> retrieveProjetDetail(Long projetDetailId) {
        return projetDetailRepo.findById(projetDetailId);
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail c) {
        return projetDetailRepo.save(c);
    }

    @Override
    public void removeProjetDetail(Long projetDetailId) {
projetDetailRepo.deleteById(projetDetailId);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepo.save(projetDetail);
    }
}
