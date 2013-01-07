package controleur.style;  
  
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;  
  
@ManagedBean (name= "galleriaBean")
public class GalleriaBean {  
  
    private List<String> images;  
  
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=12;i++) {  
            images.add("galleria" + i + ".jpg");  
        }  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
}