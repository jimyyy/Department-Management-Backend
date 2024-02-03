package org.example.tp8prenomnomclasse.services;

import org.example.tp8prenomnomclasse.entity.Equipe;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;

import java.util.List;
import java.util.Optional;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();
    public Optional<Equipe> retrieveEquipe(Long equipeId);
    public Equipe addEquipe(Equipe c);
    public void removeEquipe(Long equipeId);
    public Equipe modifyEquipe(Equipe equipe);
}
