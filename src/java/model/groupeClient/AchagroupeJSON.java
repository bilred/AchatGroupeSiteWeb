/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.restfulclient.AchatGroupeRestfulClient;


/**
 *
 * @author zakaria
 */
public class AchagroupeJSON {
    public void findAll_JSON(AchatGroupeRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object Achatgroupes = parser.parse(response);
        JsonObject AchatgroupesJSON = (JsonObject) Achatgroupes;
        JsonArray AchatgroupesArray = (JsonArray) AchatgroupesJSON.get("categorie");
        
        for (int i = 0; i < AchatgroupesArray.size(); i++) {
            JsonObject Achatgroupe = (JsonObject) AchatgroupesArray.get(i);
            System.out.println(Achatgroupe);
           
    }
    }
    
    public void create_JSON(AchatGroupeRestfulClient client) {
        JsonObject offre = new JsonObject();   
       
        client.create_JSON(offre.toString());
    }
    
    
}
