/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import model.groupeClient.OffreJSON;

/**
 *
 * @author zakaria
 */
@ManagedBean(name = "dealBean1")
@NoneScoped
public class DealBean {
    
    private String idDeal;
    private String nomOffre;
    private String nomProduit;
    private String prix;
    private String descriptionProduit;
    private String descriptionOffre;
    private String tempRest;
    private String nbAchteur;
    private String resultat; 
public void test(){System.out.print("Zakaria");}
    public String getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(String idDeal) {
        
        this.idDeal = idDeal;
    }

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
        FacesContext context = FacesContext.getCurrentInstance();
		Map map = context.getExternalContext().getRequestParameterMap();
		//String id=(String)map.get("toto");

        this.setIdDeal("1");
        this.setNomProduit(offre.getOffre(getIdDeal()).get("produitidProdui").getAsJsonObject().get("nom").getAsString());
        this.setPrix(offre.getOffre(getIdDeal()).get("prix").getAsString());
        this.setDescriptionProduit(offre.getOffre(getIdDeal()).get("produitidProdui").getAsJsonObject().get("description").getAsString());
        this.setDescriptionOffre(offre.getOffre(getIdDeal()).get("description").getAsString());
        this.setNomOffre(offre.getOffre(getIdDeal()).get("nom").getAsString());
        this.setNbAchteur(offre.getOffre(getIdDeal()).get("nbAcheteur").getAsString());
        this.setTempRest(offre.getOffre(getIdDeal()).get("date").getAsString());
        
    }
    
    public DealBean(String id){
    this.idDeal=id;
    
    
    }

}