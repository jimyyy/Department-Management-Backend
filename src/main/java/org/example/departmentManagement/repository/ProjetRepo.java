package org.example.departmentManagement.repository;

import org.example.departmentManagement.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepo extends JpaRepository<Projet,Long> {
    Projet findProjetBySujet(String sujet);
}
