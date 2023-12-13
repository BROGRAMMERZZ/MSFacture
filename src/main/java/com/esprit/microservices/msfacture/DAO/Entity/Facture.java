package com.esprit.microservices.msfacture.DAO.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Facture implements Serializable {
    private static final  long serialVersionUID = 6 ;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idFacture ;
    private Date dateFacture;
    private int idUser ;
    private String titre;

    private int Discount;
    private int idCommande;

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Facture() {
        super();
    }

      public Facture(int idFacture, Date dateFacture, int idUser, String titre, int discount, int idCommande) {
        this.idFacture = idFacture;
        this.dateFacture = dateFacture;
        this.idUser = idUser;
        this.titre = titre;
        this.Discount = discount;
        this.idCommande = idCommande;
    }
}
