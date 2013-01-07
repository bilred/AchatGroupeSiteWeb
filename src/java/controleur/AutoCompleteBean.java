package controleur;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nora
 */
@ManagedBean (name= "autoCompleteBean")
public class AutoCompleteBean {
    private List<String> mois;  
    private List<String> annee; 
    @PostConstruct  
    public void init() {  
        mois = new ArrayList<String>();  
        annee = new ArrayList<String>();
       
            mois.add("janvier");  
            mois.add("février");  
            mois.add("mars");  
            mois.add("avril");  
            mois.add("mai");  
            mois.add("juin");  
            mois.add("juillet");  
            mois.add("août"); 
            mois.add("septembre");  
            mois.add("october");  
            mois.add("novembre");  
            mois.add("décembre"); 
            
            annee.add("2013");
            annee.add("2014");
            annee.add("2015");
            annee.add("2016");
         
    }  
  
    public List<String> getMois() {  
        return mois;  
    }
    public List<String> getAnnee() {  
        return annee;  
    }
}
