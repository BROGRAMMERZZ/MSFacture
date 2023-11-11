package com.esprit.microservices.msfacture.DAO.Repository;

import com.esprit.microservices.msfacture.DAO.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Integer> {
}
