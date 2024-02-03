package org.example.tp8prenomnomclasse.services;

import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;

import java.util.List;
import java.util.Optional;

public interface IProjetDetailService {
    public List<ProjetDetail> retrieveAllProjectsDetails();
    public Optional<ProjetDetail> retrieveProjetDetail(Long projetDetailId);
    public ProjetDetail addProjetDetail(ProjetDetail c);
    public void removeProjetDetail(Long projetDetailId);
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail);
}
