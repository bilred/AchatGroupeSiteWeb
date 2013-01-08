/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import com.google.gson.JsonObject;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.groupeClient.OffreJSON;

/**
 *
 * @author zakaria
 */
@ManagedBean(name = "dealBean1")
@RequestScoped
public class DealBean {
    private String nomOffre;
    private String nomProduit;
    private String prix;
    private String descriptionProduit;
    private String descriptionOffre;
    private String tempRest;
    private String nbAchteur;
    private String resultat; 

    public String getNomOffre() {
        return nomOffre;
    }

    public void setNomOffre(String nomOffre) {
        this.nomOffre = nomOffre;
    }

    public String getTempRest() {
        return tempRest;
    }

    public void setTempRest(String tempRest) {
        this.tempRest = tempRest;
    }

    public String getNbAchteur() {
        return nbAchteur;
    }

    public void setNbAchteur(String nbAchteur) {
        this.nbAchteur = nbAchteur;
    }

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptionOffre(String descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public String getResultat() {
        
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

   
    public void acheter(){
    
    }

    public DealBean() {
        OffreJSON offre=new OffreJSON();
        JsonObject produit = offre.getProduit("2");
        
        this.setNomProduit(produit.get("nom").getAsString());
        this.setPrix(offre.getOffre("2").get("prix").getAsString());
        this.setDescriptionProduit(produit.get("description").getAsString());
        this.setDescriptionOffre(offre.getOffre("3").get("description").getAsString());
        this.setNomOffre(offre.getOffre("2").get("nom").getAsString());
        this.setNbAchteur(offre.getOffre("2").get("nbAcheteur").getAsString());
        this.setTempRest(offre.getOffre("2").get("date").getAsString());
        
    }

}