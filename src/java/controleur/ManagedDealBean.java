/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import model.groupeClient.CategorieJSON;
import model.groupeClient.OffreJSON;

/**
 *
 * @author zakaria
 */
public class ManagedDealBean {
    
 
   private LinkedList<String> idlisteCategorie;
   private LinkedList<CategorieClasse> listeCategorie;
   private int size;
    private String itemChoisi;
    private String prixtt;

    public String getPrixtt() {
        return prixtt;
    }

    public void setPrixtt(String prixtt) {
        this.prixtt = prixtt;
    }
    

    public String getItemChoisi() {
        return itemChoisi;
    }

    public void setItemChoisi(String itemChoisi) {
        this.itemChoisi = itemChoisi;
    }

    public LinkedList<String> getIdlisteCategorie() {
        return idlisteCategorie;
    }

    public void setIdlisteCategorie(LinkedList<String> idlisteCategorie) {
        this.idlisteCategorie = idlisteCategorie;
    }

    public LinkedList<CategorieClasse> getListeCategorie() {
        return listeCategorie;
    }

    public void setListeCategorie(LinkedList<CategorieClasse> listeCategorie) {
        this.listeCategorie = listeCategorie;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   
   
    public CategorieClasse doneCategorie(String i){
        int id=Integer.parseInt(i);
        id=id-1;
    return this.listeCategorie.get(id);
    }
    public void toto(String id){
    OffreJSON oo=new OffreJSON();
    oo.addAchteur(id);
    //this.prixtt=String.valueOf(Float.parseFloat(oo.getOffre(id).get("prix").getAsString())*3);
    }
   
    
    public ManagedDealBean() {
       
        CategorieJSON categorie=new CategorieJSON();
        this.listeCategorie=new LinkedList<CategorieClasse>();
        this.idlisteCategorie=categorie.idlistCategorie();
        for(int i=0;i<this.idlisteCategorie.size();i++){
          this.listeCategorie.add(new CategorieClasse(this.idlisteCategorie.get(i)));
        }
        
     
    }
}
