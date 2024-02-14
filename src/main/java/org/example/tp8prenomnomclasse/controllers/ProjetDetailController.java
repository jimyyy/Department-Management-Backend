package org.example.tp8prenomnomclasse.controllers;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.ProjetDetail;
import org.example.tp8prenomnomclasse.services.IProjetDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/projetDetail")

public class ProjetDetailController {
    IProjetDetailService projetDetailService;

    @GetMapping("/retrieve-all-projetDetails")
    public List<ProjetDetail> getProjects() {
        List<ProjetDetail> listProjetDetail = projetDetailService.retrieveAllProjectsDetails();
        return listProjetDetail;
    }

    @GetMapping("/retrieve-projetDetail/{projetDetail-id}")
    public Optional<ProjetDetail> retrieveBloc(@PathVariable("projetDetail-id") Long projetDetailId) {
        Optional<ProjetDetail> ProjetDetail = projetDetailService.retrieveProjetDetail(projetDetailId);
        return ProjetDetail;
    }

    @PostMapping("/add-projetDetail")
    public ProjetDetail addprojetDetail(@RequestBody ProjetDetail b) {
        ProjetDetail projetDetail = projetDetailService.addProjetDetail(b);
        return projetDetail;
    }

    @DeleteMapping("/remove-projetDetail/{projetDetail-id}")
    public void removeProjetDetail(@PathVariable("projetDetail-id") Long projetDetailId) {

       projetDetailService.removeProjetDetail(projetDetailId);
    }


    @PutMapping("/modify-projetDetail")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail b) {
        ProjetDetail projetDetail = projetDetailService.modifyProjetDetail(b);
        return projetDetail;
    }






}
