/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.restfulclient.UtilisateurRestfulClient;

/**
 *
 * @author zakaria
 */
public class UtilisateurJSON {
     public void findAll_JSON(UtilisateurRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object utilisateurs = parser.parse(response);
        JsonObject sallesJSON = (JsonObject) utilisateurs;
        JsonArray sallesArray = (JsonArray) sallesJSON.get("utilisateur");
        for (int i = 0; i < sallesArray.size(); i++) {
            JsonObject salle = (JsonObject) sallesArray.get(i);
            System.out.println("Info Utilisateur idUtilisateur : " + salle.get("idUtilisateur"));
            System.out.println("\tnom\t : " + salle.get("nom"));
            System.out.println("\tprenom\t : " + salle.get("prenom"));
            
    }
    }
    
    public void create_JSON(String nom,String prenom,String titre,String ville,String teletphone,String dateNaissance,
            String email,String identifiant,String motPasse) {
        UtilisateurRestfulClient client=new UtilisateurRestfulClient();
        JsonObject utilisateur = new JsonObject();
      
        utilisateur.addProperty("nom", nom);
        utilisateur.addProperty("prenom",prenom );
        utilisateur.addProperty("titre", titre);
        utilisateur.addProperty("ville",ville);
        utilisateur.addProperty("email", email);
        utilisateur.addProperty("teletphone", teletphone);
        utilisateur.addProperty("identifiant",identifiant );
        utilisateur.addProperty("motPasse", motPasse);
        utilisateur.addProperty("dateNaissance", dateNaissance);
        
       
        
        client.create_JSON(utilisateur.toString());
     
  
   
    }
    public boolean checkIdentifiant(String identifiant,String motPasse){
        UtilisateurRestfulClient client=new UtilisateurRestfulClient();
    String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object utilisateurs = parser.parse(response);
        JsonObject sallesJSON = (JsonObject) utilisateurs;
        JsonArray sallesArray = (JsonArray) sallesJSON.get("utilisateur");
        for (int i = 0; i < sallesArray.size(); i++) {
            JsonObject utilisateur = (JsonObject) sallesArray.get(i);
            String id=utilisateur.get("identifiant").getAsString();
            String passe=utilisateur.get("motPasse").getAsString();
            if(id.equals(identifiant) && passe.equals(motPasse) ){
            return true;
            }
          
    }
    
    return false;
    }
    
}
