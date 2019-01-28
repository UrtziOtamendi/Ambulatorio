/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.*;

/**
 *
 * @author Mendel
 */
public class DAOFactory {
    
   public static GaixoaDAO gaixoaDAOSortu(){
        GaixoaDAOHibernate gaixoaDAO = new GaixoaDAOHibernate();
        return gaixoaDAO;
    }  
   public static LangileaDAO langileaDAOSortu(){
        LangileaDAOHibernate langileaDAO = new LangileaDAOHibernate();
        return langileaDAO;
    }
   public static ErizainaDAO erizainaDAOSortu(){
        ErizainaDAOHibernate erizainaDAO = new ErizainaDAOHibernate();
        return erizainaDAO;
    }   
   public static IdazkariaDAO idazkariaDAOSortu(){
        IdazkariaDAOHibernate idazkariaDAO = new IdazkariaDAOHibernate();
        return idazkariaDAO;
    }
   public static BolanteaDAO bolanteaDAOSortu(){
        BolanteaDAOHibernate BolanteaDAO = new BolanteaDAOHibernate();
        return BolanteaDAO;
    }
   public static Espezialista_TxostenaDAO espezialista_TxostenaDAOSortu(){
        Espezialista_TxostenaDAOHibernate Espezialista_TxostenaDAO = new Espezialista_TxostenaDAOHibernate();
        return Espezialista_TxostenaDAO;
    }
   public static FrogaDAO frogaDAOSortu(){
       FrogaDAOHibernate FrogaDAO = new FrogaDAOHibernate();
        return FrogaDAO;
    }
   public static HistorialaDAO historialaDAOSortu(){
       HistorialaDAOHibernate HistorialaDAO = new HistorialaDAOHibernate();
        return HistorialaDAO;
    }
   public static KonsultaDAO konsultaDAOSortu(){
       KonsultaDAOHibernate KonsultaDAO = new KonsultaDAOHibernate();
        return KonsultaDAO;
    }
   public static Konsulta_BereziaDAO konsulta_BereziaDAOSortu(){
        Konsulta_BereziaDAOHibernate Konsulta_BereziaDAO = new Konsulta_BereziaDAOHibernate();
        return Konsulta_BereziaDAO;
        
    } 
   public static Konsulta_OrokorraDAO konsulta_OrokorraDAOSortu(){
        Konsulta_OrokorraDAOHibernate Konsulta_OrokorraDAO = new Konsulta_OrokorraDAOHibernate();
        return Konsulta_OrokorraDAO;
        
    } 
   public static Sendagile_BereziaDAO sendagile_BereziaDAOSortu(){
        Sendagile_BereziaDAOHibernate Sendagile_BereziaDAO = new Sendagile_BereziaDAOHibernate();
        return Sendagile_BereziaDAO;
        
    } 
   public static Sendagile_OrokorraDAO sendagile_OrokorraDAOSortu(){
        Sendagile_OrokorraDAOHibernate Sendagile_OrokorraDAO = new Sendagile_OrokorraDAOHibernate();
        return Sendagile_OrokorraDAO;
        
    } 
}
