/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.restfulclient.OffreRestfulClient;


/**
 *
 * @author zakaria
 */
public class OffreJSON {
     public void findAll_JSON(OffreRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object offres = parser.parse(response);
        JsonObject offresJSON = (JsonObject) offres;
        JsonArray offresArray = (JsonArray) offresJSON.get("offre");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Offre = (JsonObject) offresArray.get(i);
            System.out.println("Info Offre prix: " + Offre.get("prix"));
            System.out.println("\tnom\t : " + Offre.get("nb_achteur"));
            System.out.println("\tprenom\t : " + Offre.get("description"));
            
    }
    }
    
    public void create_JSON(OffreRestfulClient client) {
        JsonObject offre = new JsonObject();   
        offre.addProperty("prix", "45");
        offre.addProperty("nb_achteur", 3);
       offre.addProperty("description", "bismillah");
        client.create_JSON(offre.toString());
    }
    
    
    public JsonObject getProduit(String id){
        OffreRestfulClient client=new OffreRestfulClient();
     String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object offres = parser.parse(response);
        JsonObject offresJSON = (JsonObject) offres;
        JsonArray offresArray = (JsonArray) offresJSON.get("offre");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Offre = (JsonObject) offresArray.get(i);
            if(Offre.get("idOffre").getAsString().equals(id)){
            return Offre.get("produitidProdui").getAsJsonObject();
            
            }
    }
    return null;
    
    }
     public JsonObject getOffre(String id){
        OffreRestfulClient client=new OffreRestfulClient();
     String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object offres = parser.parse(response);
        JsonObject offresJSON = (JsonObject) offres;
        JsonArray offresArray = (JsonArray) offresJSON.get("offre");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Offre = (JsonObject) offresArray.get(i);
            if(Offre.get("idOffre").getAsString().equals(id)){
            return Offre;
            
            }
    }
    return null;
    
    }
}
