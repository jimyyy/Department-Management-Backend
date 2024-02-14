package org.example.tp8prenomnomclasse.controllers;

import lombok.AllArgsConstructor;
import org.example.tp8prenomnomclasse.entity.Equipe;
import org.example.tp8prenomnomclasse.services.EquipeServiceImpl;
import org.example.tp8prenomnomclasse.services.IEquipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")

public class EquipeController {
    EquipeServiceImpl equipeService;

    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getProjects() {
        List<Equipe> listEquipe = equipeService.retrieveAllEquipes();
        return listEquipe;
    }

    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Optional<Equipe> retrieveBloc(@PathVariable("equipe-id") Long equipeId) {
        Optional<Equipe> Equipe = equipeService.retrieveEquipe(equipeId);
        return Equipe;
    }

    @PostMapping("/add-equipe")
    public Equipe addequipe(@RequestBody Equipe b) {
        Equipe equipe = equipeService.addEquipe(b);
        return equipe;
    }

    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") Long equipeId) {

       equipeService.removeEquipe(equipeId);
    }


    @PutMapping("/modify-equipe")
    public Equipe modifyEquipe(@RequestBody Equipe b) {
        Equipe equipe = equipeService.modifyEquipe(b);
        return equipe;
    }

    @PutMapping("/affecter-projet-a-equipe/{equipe-id}/{projet-id}")
    public void affecterProjetAEquipe(@PathVariable("equipe-id") Long equipeId,
                                             @PathVariable("projet-id") Long projetId) {
        equipeService.assignProjetToEquipe(equipeId, projetId);
    }

    @PutMapping("/desaffecter-projet-from-equipe/{projet-id}/{equipe-id}")
    public void desaffecterProjetfromEquipe(@PathVariable("projet-id") Long proejtId,@PathVariable("equipe-id") Long equipeId
    ) {
        equipeService.desaffecterProjetFromEquipe(proejtId,equipeId);
    }






}
