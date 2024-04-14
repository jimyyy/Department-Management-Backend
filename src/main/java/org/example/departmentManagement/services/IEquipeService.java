package org.example.departmentManagement.services;

import org.example.departmentManagement.entity.Equipe;

import java.util.List;
import java.util.Optional;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();
    public Optional<Equipe> retrieveEquipe(Long equipeId);
    public Equipe addEquipe(Equipe c);
    public void removeEquipe(Long equipeId);
    public Equipe modifyEquipe(Equipe equipe);
}
