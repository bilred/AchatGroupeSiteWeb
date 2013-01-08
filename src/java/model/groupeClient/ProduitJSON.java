/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.restfulclient.ProduitRestfulClient;


/**
 *
 * @author zakaria
 */
public class ProduitJSON {
     public void findAll_JSON(ProduitRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object produits = parser.parse(response);
        JsonObject produitsJSON = (JsonObject) produits;
        JsonArray offresArray = (JsonArray) produitsJSON.get("produit");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject produit = (JsonObject) offresArray.get(i);
           
            
    }
    }
    
    public void create_JSON(ProduitRestfulClient client) {
        JsonObject offre = new JsonObject();   
       
        client.create_JSON(offre.toString());
    }
    
    public String[] getInfoProduit(String id){
        ProduitRestfulClient client=new ProduitRestfulClient();
     String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object produits = parser.parse(response);
        JsonObject produitsJSON = (JsonObject) produits;
        JsonArray offresArray = (JsonArray) produitsJSON.get("produit");
        String[] info=new String[3];
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject produit = (JsonObject) offresArray.get(i);
           if(produit.get("idProdui").getAsString().equals(id)){
           info[0]= produit.get("nom").getAsString();
            info[1]= produit.get("description").getAsString();
            info[2]= produit.get("categorieidCategorie").getAsJsonObject().get("idCategorie").getAsString();
            
            return info;
           }
           
    }
    
    return null; 
    }
    
}
