package org.example.tp8prenomnomclasse.controllers;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.services.IProjetService;
import org.example.tp8prenomnomclasse.services.ProjetServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")

public class ProjetController {
    //IProjetService projetService;
    ProjetServiceImpl projetService;

    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjects() {
        List<Projet> listProjet = projetService.retrieveAllProjects();
        return listProjet;
    }

    @GetMapping("/retrieve-projet/{projet-id}")
    public Optional<Projet> retrieveBloc(@PathVariable("projet-id") Long projetId) {
        Optional<Projet> Projet = projetService.retrieveProjet(projetId);
        return Projet;
    }

    @PostMapping("/add-projet")
    public Projet addprojet(@RequestBody Projet b) {
        Projet projet = projetService.addProjet(b);
        return projet;
    }

    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long projetId) {

       projetService.removeProjet(projetId);
    }


    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet b) {
        Projet projet = projetService.modifyProjet(b);
        return projet;
    }

    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId,proejtDetailsId);
    }
    @PutMapping("/deaffecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId
                                            ) {
        projetService.anassignProjetDetailToProjet(proejtId);
    }


    @PostMapping("/creer-projet-et-affecter-projet-detail-a-projet/{projet-detail-id}")
    public void creerProjetEtAffecterProjetDetailAProjet(@RequestBody Projet p,@PathVariable("projet-detail-id") Long projetDtailId){
        projetService.addProjetAndAssignProjetToProjetDetail(p,projetDtailId);
    }

    @PutMapping("/deaffecter-projet-a-projet-details/{projet-id}")
    public void desaffecterProjetDetail(@PathVariable("projet-id") Long proejtId
    ) {
        projetService.DesaffecterProjetDetailFromProjet(proejtId);
    }








}
