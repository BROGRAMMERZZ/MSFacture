package com.esprit.microservices.msfacture.Services;

import com.esprit.microservices.msfacture.DAO.Entity.Facture;
import com.esprit.microservices.msfacture.DAO.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {
    @Autowired
    private FactureRepository factureRepository ;
    public Facture addFacture(Facture facture){
        return factureRepository.save(facture);
    }
    public List<Facture> ListeFacture(){return factureRepository.findAll();}

    public void deleteFacture(int id){
        Facture f = factureRepository.findById(id).get();
        factureRepository.delete(f);

    }
    public Facture factureDetails(int id){
        return factureRepository.findById(id).get();
    }
}
