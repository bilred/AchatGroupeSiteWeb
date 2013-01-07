/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author zakaria
 */
@ManagedBean(name = "dealBean1")
@RequestScoped
public class DealBean {
    private String prix;
    private String description;
    private String resultat; 

    public String getResultat() {
        
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void acheter(){
    
    }

    public DealBean() {
    }
}
