package dao;
// Generated 30-abr-2012 18:20:00 by Hibernate Tools 3.2.1.GA


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 * Erabiltzailea generated by hbm2java
 */
public class Konsulta_Orokorra  implements java.io.Serializable {

     @Size(min=8,max=9,message="GSZ zenbakia ez da zuzena, 8 edo 9 karaktere eduki behar ditu")
     private int zenbakia;
     
     
    
     
     
     private Sendagile_Orokorra Sendagile;
    

    public Konsulta_Orokorra() {
    }

	
    public Konsulta_Orokorra(int zenbakia , Sendagile_Orokorra Sendagile ) {
        this.Sendagile = Sendagile;
        this.zenbakia = zenbakia;
       

    }

    public Sendagile_Orokorra getSendagile() {
        return Sendagile;
    }

    public void setSendagile(Sendagile_Orokorra Sendagile) {
        this.Sendagile = Sendagile;
    }

    public int getZenbakia() {
        return zenbakia;
    }

    public void setZenbakia(int zenbakia) {
        this.zenbakia = zenbakia;
    }


  
   
    


}


