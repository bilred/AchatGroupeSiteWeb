/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.LinkedList;
import model.groupeClient.OffreJSON;

/**
 *
 * @author zakaria
 */

public class CategorieClasse {
    private LinkedList<String> idlisteOffre;
    private LinkedList<DealClass> listeOffre;
   
    private  int size;

    public LinkedList<String> getIdlisteOffre() {
        return idlisteOffre;
    }

    public void setIdlisteOffre(LinkedList<String> idlisteOffre) {
        this.idlisteOffre = idlisteOffre;
    }

    public LinkedList<DealClass> getListeOffre() {
        return listeOffre;
    }

    public void setListeOffre(LinkedList<DealClass> listeOffre) {
        this.listeOffre = listeOffre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public DealClass doneDeal(String i){
        int id=Integer.parseInt(i);
        id=id-1;
    return this.listeOffre.get(id);
    }
    
    public CategorieClasse(String Categorie){
        
         OffreJSON offre=new OffreJSON();
         this.listeOffre=new LinkedList<DealClass>();
         this.idlisteOffre=offre.getOffreByCategorie(String.valueOf(Categorie));
        this.size=this.idlisteOffre.size();
        for(int i=0;i<this.idlisteOffre.size();i++){
      this.listeOffre.add(new DealClass(this.idlisteOffre.get(i)));
        }
    
    
    }
}
