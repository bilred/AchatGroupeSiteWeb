/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

import java.util.LinkedList;
import model.restfulclient.ProduitRestfulClient;
import model.restfulclient.UtilisateurRestfulClient;




/**
 *
 * @author zakaria
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     CategorieJSON tata=new CategorieJSON();
        LinkedList<String> var = tata.idlistCategorie();
        System.out.println(var.get(1));
       
       
       
        }
}
