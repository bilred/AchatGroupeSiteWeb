package controleur.style;  
  
import java.util.ArrayList;  
import java.util.LinkedList;
import java.util.List;  
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;  
import javax.faces.bean.RequestScoped;
import model.groupeClient.PhotoJSON;
  
@ManagedBean (name= "galleriaBean")
@RequestScoped
public class GalleriaBean {  
  
    private List<String> images;  
  public GalleriaBean(){
   }
    public GalleriaBean(String id){
        images = new LinkedList<String>();  
  
       PhotoJSON photojson=new PhotoJSON();
       LinkedList<String> ll=new LinkedList<String>();
  ll=photojson.getPhotosIdByProduit(id);
  
        for(int i=0;i<ll.size();i++) {  
            images.add(photojson.getPhotoById(ll.get(i)).get("lien").getAsString());  
            
        }
} 
  
    public List<String> getImages() {  
        return images;  
    }  
}