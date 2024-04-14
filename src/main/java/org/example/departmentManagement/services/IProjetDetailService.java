package org.example.departmentManagement.services;

import org.example.departmentManagement.entity.ProjetDetail;

import java.util.List;
import java.util.Optional;

public interface IProjetDetailService {
    public List<ProjetDetail> retrieveAllProjectsDetails();
    public Optional<ProjetDetail> retrieveProjetDetail(Long projetDetailId);
    public ProjetDetail addProjetDetail(ProjetDetail c);
    public void removeProjetDetail(Long projetDetailId);
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail);
}
