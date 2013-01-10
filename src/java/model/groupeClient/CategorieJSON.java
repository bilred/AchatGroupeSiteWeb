/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.LinkedList;
import model.restfulclient.CategorieRestfulClient;



/**
 *
 * @author zakaria
 */
public class CategorieJSON {
    public void findAll_JSON(CategorieRestfulClient client) {
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object Categories = parser.parse(response);
        JsonObject CategoriesJSON = (JsonObject) Categories;
        JsonArray offresArray = (JsonArray) CategoriesJSON.get("categorie");
        
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Categorie = (JsonObject) offresArray.get(i);
            System.out.println(Categorie);
           
    }
    }
    
    public void create_JSON(CategorieRestfulClient client) {
        JsonObject offre = new JsonObject();   
       
        client.create_JSON(offre.toString());
    }
    public LinkedList<String> idlistCategorie(){
     CategorieRestfulClient client=new CategorieRestfulClient();
        String response=client.findAll_JSON(String.class);
        JsonParser parser = new JsonParser();
        Object Categories = parser.parse(response);
        JsonObject CategoriesJSON = (JsonObject) Categories;
        JsonArray offresArray = (JsonArray) CategoriesJSON.get("categorie");
        LinkedList<String> listid=new LinkedList<String>();
        for (int i = 0; i < offresArray.size(); i++) {
            JsonObject Categorie = (JsonObject) offresArray.get(i);
          listid.add(Categorie.get("idCategorie").getAsString());
           
    }
    
    return listid;
    
    }
}
