package dao;
// Generated 30-abr-2012 18:20:00 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Erabiltzailea generated by hbm2java
 */
public class Gaixoa  implements java.io.Serializable {

     @Size(min=8,max=9,message="GSZ zenbakia ez da zuzena, 8 edo 9 karaktere eduki behar ditu")
     private int GSZ;
     
     
     @Size(min=1,max=50,message="Karaktere kopurua ez da zuzena, gutxienez 1 eta gehienez 50")
     private String izena;
     
     @Size(min=1,max=50,message="Karaktere kopurua ez da zuzena, gutxienez 1 eta gehienez 50")
     private String abizenak;
     
     @Size(min=9,max=9,message="Karaktere kopurua ez da zuzena, 9 izan behar da")
     private int telefonoa;
     
     @Size(min=6,max=6,message="Karaktere kopurua ez da zuzena, 6 izan behar da ")
     private String pasahitza;
     
    
     @Size(min=1,max=50,message="Karaktere kopurua ez da zuzena, gutxienez 1 eta gehienez 50")
     private String helbidea;
     private Set<Historiala> historialak = new HashSet<Historiala>(0);
     private Set<Konsulta> konsultak = new HashSet<Konsulta>(0);

    public Gaixoa() {
    }

    public Gaixoa(int gsz, String izena, String abizena, int telefonoa, String pasahitza, String helbidea) {
        this.GSZ = gsz;
        this.izena = izena;
        this.abizenak = abizena;
        this.pasahitza = pasahitza;
        this.telefonoa = telefonoa;
        this.helbidea = helbidea;

    }
    public Gaixoa(int gsz, String izena, String abizena, int telefonoa, String pasahitza, String helbidea, Set<Historiala> historialak,Set<Konsulta> konsultak  ) {
        this.GSZ = gsz;
        this.izena = izena;
        this.abizenak = abizena;
        this.pasahitza = pasahitza;
        this.telefonoa = telefonoa;
        this.helbidea = helbidea;
        this.historialak=historialak;
        this.konsultak=konsultak;
    }

    public int getGSZ() {
        return GSZ;
    }

    public void setGSZ(int GSZ) {
        this.GSZ = GSZ;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizenak() {
        return abizenak;
    }

    public void setAbizenak(String abizenak) {
        this.abizenak = abizenak;
    }

    public int getTelefonoa() {
        return telefonoa;
    }

    public void setTelefonoa(int telefonoa) {
        this.telefonoa = telefonoa;
    }

    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public Set<Historiala> getHistorialak() {
        return historialak;
    }

    public void setHistorialak(Set<Historiala> historialak) {
        this.historialak = historialak;
    }

    public Set<Konsulta> getKonsultak() {
        return konsultak;
    }

    public void setKonsultak(Set<Konsulta> konsultak) {
        this.konsultak = konsultak;
    }
   
   
    


}


