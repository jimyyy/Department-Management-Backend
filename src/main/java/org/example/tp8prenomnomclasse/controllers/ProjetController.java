package org.example.tp8prenomnomclasse.controllers;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Projet;
import org.example.tp8prenomnomclasse.services.IProjetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")

public class ProjetController {
    IProjetService projetService;

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






}
