package org.primefaces.examples.view;


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
    private List<Integer> nombre;
    @PostConstruct  
    public void init() {  
        mois = new ArrayList<String>();  
        annee = new ArrayList<String>();
               nombre = new ArrayList<Integer>();

               
               nombre.add(1);
               nombre.add(2);
               nombre.add(3);
               nombre.add(4);
               nombre.add(5);
               nombre.add(6);
               nombre.add(7);
               nombre.add(8);
               nombre.add(9);
               nombre.add(10);
               
               
               
               
               
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
     public List<Integer> getNombre() {  
        return nombre;  
    }
}
