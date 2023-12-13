package com.esprit.microservices.msfacture.Services;

import com.esprit.microservices.msfacture.DAO.Entity.Facture;
import com.esprit.microservices.msfacture.DAO.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FactureService {
    @Autowired
    private FactureRepository factureRepository ;
    public Facture addFacture(Facture facture){
        return factureRepository.save(facture);
    }
    public List<Facture> ListeFacture(){return factureRepository.findAll();}
    public Facture updateFacture( Facture facture) {
        return factureRepository.save(facture);
    }

    public Facture GenerateFacture(int idCommande , int idUser , String titre){
        Facture facture = new Facture();

        facture.setDateFacture(new Date());
        facture.setTitre(titre);
        facture.setIdCommande(idCommande);
        facture.setIdUser(idUser);
        return factureRepository.save(facture);
    }
    public Facture retrieveFacture(int id) {
        // TODO Auto-generated method stub
        Facture p = factureRepository.findById(id).get();
        // TODO Auto-generated method stub
        return p;	}
    public void deleteFacture(int id){
        Facture f = factureRepository.findById(id).get();
        factureRepository.delete(f);

    }
    public Facture factureDetails(int id){
        return factureRepository.findById(id).get();
    }
}
