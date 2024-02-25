package org.example.tp8prenomnomclasse.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;
import org.example.tp8prenomnomclasse.repository.ProjetDetailRepo;
import org.example.tp8prenomnomclasse.repository.ProjetRepo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@Slf4j
public class ProjetServiceImpl implements IProjetService {
    ProjetRepo projetRepo;
    ProjetDetailRepo projetDetailRepo;
    @Override
    //@Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Projet> retrieveAllProjects() {
        List<Projet> listC = projetRepo.findAll();
        for (Projet c: listC) {
            //log.info("Chambre :" + c);
        }
        return listC;
    }


    @Override
    public Optional<Projet> retrieveProjet(Long projetId) {
        return projetRepo.findById(projetId);
    }

    @Override
    public Optional<Projet> retrieveProjetBySujet(String sujet) {
        return Optional.ofNullable(projetRepo.findProjetBySujet(sujet));
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

    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepo.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepo.findById(projetDetailId).get();
// on set le fils dans le parent :
       projet.setProjetDetail(projetDetail);
        projetRepo.save(projet);
    }

    public void anassignProjetDetailToProjet(Long projetId) {
        Projet projet = projetRepo.findById(projetId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(null);
        projetRepo.save(projet);
    }

    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepo.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        return projetRepo.save(projet);
    }

    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepo.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepo.save(projet);
    }

    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepo.save(projet);
    }




}
