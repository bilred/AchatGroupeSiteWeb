package controleur;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hicham
 */
public class difference implements Serializable{
    
    private String count;  
  
    public String getCount() {  
        return count;  
    }  
  
    public void setCount(String count) {  
        this.count = count;  
    }  
      public String increment(String dealTime) {  
              
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Calendar cal = Calendar.getInstance();
String currentTime =dateFormat.format(cal.getTime());


String strDeal[]=dealTime.split(" ");
String strCurrent[]=currentTime.split(" ");

String dateDeal[]=strDeal[0].split("-");
String timeDeal[]=strDeal[1].split(":");

String dateCurrent[]=strCurrent[0].split("-");
String timeCurrent[]=strCurrent[1].split(":");
int mois=0;

int annee=Integer.parseInt(dateDeal[0])-Integer.parseInt(dateCurrent[0]);
 mois=Integer.parseInt(dateDeal[1])-Integer.parseInt(dateCurrent[1]);
if(Integer.parseInt(dateDeal[1])<Integer.parseInt(dateCurrent[1])){

    mois =12-Integer.parseInt(dateCurrent[1])+Integer.parseInt(dateDeal[1]);
}
int jour=Integer.parseInt(dateDeal[2])-Integer.parseInt(dateCurrent[2]);
if((Integer.parseInt(dateDeal[2])<Integer.parseInt(dateCurrent[2]))){

jour=31-Integer.parseInt(dateCurrent[2])+Integer.parseInt(dateDeal[2]);
mois--;
}


int heure=Integer.parseInt(timeDeal[0])-Integer.parseInt(timeCurrent[0]);

if(Integer.parseInt(timeDeal[0])<Integer.parseInt(timeCurrent[0])){
heure=24-Integer.parseInt(timeCurrent[0])+Integer.parseInt(timeDeal[0]);
}
int minute=Integer.parseInt(timeDeal[1])-Integer.parseInt(timeCurrent[1]);

if(Integer.parseInt(timeDeal[1])<Integer.parseInt(timeCurrent[1])){
    minute=60-Integer.parseInt(timeCurrent[1])+Integer.parseInt(timeDeal[1]);
heure--;}



int seconde=Integer.parseInt(timeDeal[2])-Integer.parseInt(timeCurrent[2]);
if(Integer.parseInt(timeDeal[2])<Integer.parseInt(timeCurrent[2])){
   seconde=60-Integer.parseInt(timeCurrent[2])+Integer.parseInt(timeDeal[2]);
minute--;}



count=""+annee+" ans \t"+mois+" mois \t"+jour+"jours \t"+heure+"heures \t"+minute+"minutes \t"+seconde+"secondes \t";
   return count;
      }  
}