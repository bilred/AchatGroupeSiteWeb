package controleur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.TextField;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.groupeClient.UtilisateurJSON;

/**
 *
 * @author zakaria
 */
@ManagedBean
@RequestScoped
public class UtilisateurBean {
    private String nom;
   private String prenom;
    private String titre;
    private String ville;
    private String email;
   private String teletphone;
   private Date dateNaissance;
    private String identifiant;
    private String motPasse;
   private String reponse;
   private String connexion;
   

   

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public String getTeletphone() {
        return teletphone;
    }

    public void setTeletphone(String teletphone) {
        this.teletphone = teletphone;
    }

   

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

   

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
   

    public String getReponse() {
         UtilisateurJSON user=new UtilisateurJSON();
 if(titre.equalsIgnoreCase("1")) {
            titre="homme";
        }
 else {
            titre="femme";
        }
     java.sql.Date date = new java.sql.Date(dateNaissance.getTime());
      user.create_JSON(nom,prenom,titre,ville,teletphone,date.toString(),
       email,identifiant,motPasse);
      
       reponse="Utilisateur bien enregistrer";
        return this.reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
    
    
    public UtilisateurBean() {
    }
   
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    

    

   public void conexion(){
         UtilisateurJSON utilisateur=new UtilisateurJSON();
        if(utilisateur.checkIdentifiant(identifiant, motPasse)) {
             
             this.setConnexion("La connexion est etablit");
         }
        else {
             this.setConnexion("Le mot de passe ou l'identifiant est incorrect");
         }
        
   
   }
   public void setConnexion(String connexion) {
        this.connexion = connexion;
    }
    public String getConnexion() {
        
        return connexion;
    }
}
