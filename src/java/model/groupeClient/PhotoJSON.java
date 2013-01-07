/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.restfulclient.PhotoRestfulClient;



/**
 *
 * @author zakaria
 */
public class PhotoJSON {
    public void findAll_JSON(PhotoRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object Photos = parser.parse(response);
        JsonObject PhotosJSON = (JsonObject) Photos;
        JsonArray offresArray = (JsonArray) PhotosJSON.get("categorie");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Photo = (JsonObject) offresArray.get(i);
            System.out.println(Photo);
           
    }
    }
    
    public void create_JSON(PhotoRestfulClient client) {
        JsonObject offre = new JsonObject();   
       
        client.create_JSON(offre.toString());
    }
    
}
