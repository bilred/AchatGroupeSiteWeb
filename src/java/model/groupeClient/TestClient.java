/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.groupeClient;

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
        UtilisateurRestfulClient ut=new UtilisateurRestfulClient();
       UtilisateurJSON uti=new UtilisateurJSON();
       System.out.println( uti.checkIdentifiant("zimaghri", "zakaria"));
        }
}
