package controleur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.groupeClient.UtilisateurJSON;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.panel.Panel;

/**
 *
 * @author zakaria
 */


@ManagedBean
@SessionScoped
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
   private String reponse="";
   private String connexion;
   private Panel panelUserForm;
   private Panel panelUserForm1;
   private Boolean loginHome=true;
private String etatdeConnection="Se Connecter";
private String pageDeDirection="Connection.xhtml";

    public String getPageDeDirection() {
        return pageDeDirection;
    }

    public void setPageDeDirection(String pageDeDirection) {
        this.pageDeDirection = pageDeDirection;
    }

    public String getEtatdeConnection() {
        return etatdeConnection;
    }

    public void setEtatdeConnection(String etatdeConnection) {
        this.etatdeConnection = etatdeConnection;
    }

    public Boolean getLoginHome() {
        return loginHome;
    }

    public void setLoginHome(Boolean loginHome) {
        this.loginHome = loginHome;
    }
 
   
   
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
   private Panel panelUserForm2;
   private Boolean estConnecter=false;
   private String page="Connection.xhtml";
    private String  nvig="";
    public String getNvig() {
        return nvig;
    }
 
    
    public void setNvig(String nvig) {
        this.nvig = nvig;
    }

    public Boolean getEstConnecter() {
        return estConnecter;
    }

    public void setEstConnecter(Boolean estConnecter) {
        this.estConnecter = estConnecter;
    }

    public Panel getPanelUserForm2() {
        return panelUserForm2;
    }

    public void setPanelUserForm2(Panel panelUserForm2) {
        this.panelUserForm2 = panelUserForm2;
    }
   
   private boolean affiche;
   private CommandButton button;

    public Panel getPanelUserForm1() {
        return panelUserForm1;
    }

    public void setPanelUserForm1(Panel panelUserForm1) {
        this.panelUserForm1 = panelUserForm1;
    }

    public CommandButton getButton() {
        return button;
    }

    public void setButton(CommandButton button) {
        this.button = button;
    }

   
   
    public boolean isAffiche() {
        return affiche;       
    }

    public void setAffiche(boolean affiche) {
        this.affiche = affiche;
    }
 
    
    
    
    public Panel getPanelUserForm() {
        return panelUserForm;
    }

    public void setPanelUserForm(Panel panelUserForm) {
        this.panelUserForm = panelUserForm;
    }

 
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
        if(titre.equalsIgnoreCase("1")) {
            this.titre="homme";
        }
 else {
           this.titre="femme";
        }
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
    
    public void enregister(){
         UtilisateurJSON user=new UtilisateurJSON();
 
     java.sql.Date date = new java.sql.Date(dateNaissance.getTime());
      user.create_JSON(nom,prenom,titre,ville,teletphone,date.toString(),
       email,identifiant,motPasse);
      
       reponse="Utilisateur bien enregistrer";
    this.panelUserForm.setRendered(false);
    this.panelUserForm1.setRendered(false);
    this.panelUserForm2.setRendered(true);
    this.button.setRendered(false);
    }

    
    
    
    public void testPages(){
   //this.etatdeConnection="Se Connecter";
   //this.estConnecter=false;
   //this.page=".xhtml";
    }

   public void conexion(){
         UtilisateurJSON utilisateur=new UtilisateurJSON();
        if(utilisateur.checkIdentifiant(identifiant, motPasse)) {
             this.estConnecter=true;
             this.page="Acheter.xhtml";
             this.nvig="Acheter";
             this.setConnexion("La connexion est etablit");
             this.etatdeConnection="Se deconnecter";
            this.pageDeDirection="home.xhtml";
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
 