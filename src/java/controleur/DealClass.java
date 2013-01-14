/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import controleur.style.GalleriaBean;
import java.util.LinkedHashMap;
import java.util.Map;
import model.groupeClient.OffreJSON;
import model.groupeClient.PhotoJSON;

/**
 *
 * @author zakaria
 */
public class DealClass {
     private String idDeal;
    private String nomOffre;
    private String nomProduit;
    private String prix;
    private String descriptionProduit;
    private String descriptionOffre;
    private String tempRest;
    private String nbAchteur;
    private String resultat;
    private String lienImage;
    private String lienSlide;
    private GalleriaBean galeria;
    private String  prixttc;
   private String remise;

    public String getRemise() {
        return remise;
    }

    public void setRemise(String remise) {
        this.remise = remise;
    }
   
    public String getPrixttc() {
        return prixttc;
    }

    public void setPrixttc(String prixttc) {
        this.prixttc = prixttc;
    }
    
    
    public GalleriaBean getGaleria() {
        return galeria;
    }

    public void setGaleria(GalleriaBean galeria) {
        this.galeria = galeria;
    }

    public String getLienSlide() {
        return lienSlide;
    }

    public void setLienSlide(String lienSlide) {
        this.lienSlide = lienSlide;
    }
    

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

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

    public DealClass() {
        
        
    }
    
    
    public DealClass(String id){
    this.idDeal=id;
    OffreJSON offre=new OffreJSON();
    PhotoJSON photo=new PhotoJSON();
    difference dif=new difference(); 
    this.galeria=new GalleriaBean(offre.getOffre(getIdDeal()).get("produitidProdui").getAsJsonObject().get("idProdui").getAsString());
        this.setNomProduit(offre.getOffre(getIdDeal()).get("produitidProdui").getAsJsonObject().get("nom").getAsString());
        this.setPrix(offre.getOffre(getIdDeal()).get("prix").getAsString());
        this.setDescriptionProduit(offre.getOffre(getIdDeal()).get("produitidProdui").getAsJsonObject().get("description").getAsString());
        this.setDescriptionOffre(offre.getOffre(getIdDeal()).get("description").getAsString());
        this.setRemise(offre.getOffre(getIdDeal()).get("achatgroupeidAchatgroupe").getAsJsonObject().get("remise").getAsString());
        this.setNomOffre(offre.getOffre(getIdDeal()).get("nom").getAsString());
        this.setNbAchteur(offre.getOffre(getIdDeal()).get("nbAcheteur").getAsString());
       this.setTempRest(dif.increment(offre.getOffre("1").get("date").getAsString().substring(0, 19).replace("T", " ")));
        this.setLienImage("/Pages/images/"+photo.getPhotoById(photo.getPhotosIdByProduit(getIdDeal()).getFirst()).get("lien").getAsString());
        this.setLienSlide("../Pages/images/"+photo.getPhotoById(photo.getPhotosIdByProduit(getIdDeal()).getFirst()).get("lien").getAsString());
    }
    
}
