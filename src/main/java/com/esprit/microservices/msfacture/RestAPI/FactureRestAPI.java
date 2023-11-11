package com.esprit.microservices.msfacture.RestAPI;

import com.esprit.microservices.msfacture.DAO.Entity.Facture;
import com.esprit.microservices.msfacture.Services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("factureRestAPI")
public class FactureRestAPI {
    @Autowired
    private FactureService factureService ;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Facture>> FactureListe(){
        return new ResponseEntity<>(factureService.ListeFacture(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Facture> factureDetails(@PathVariable("id") int id){
        return new ResponseEntity<>(factureService.factureDetails(id),HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Facture> createCommande(@RequestBody Facture facture){
        return new ResponseEntity<>(factureService.addFacture(facture),HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public void DeleteFacture(@PathVariable("id") int id){
        factureService.deleteFacture(id);
    }

}