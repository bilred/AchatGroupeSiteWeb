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
    
}
