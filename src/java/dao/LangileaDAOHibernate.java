/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;
import web.LangileaBean;

/**
 *
 * @author Mendel
 */
public class LangileaDAOHibernate implements LangileaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Langilea langile) {
        try {
            session.beginTransaction();
            session.save(langile);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Langilea langile) {
        try {
            session.beginTransaction();
            session.delete(langile);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Langilea langile) {
        try {
            session.beginTransaction();
            session.update(langile);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public boolean langileaEgiaztatu(int ID, String pasahitza) {
        try {
            System.out.print(ID);
            System.out.print(pasahitza);
            session.beginTransaction();
            String hql = "select ID from Langilea where ID =:id and pasahitza =:pass ";
            
            Query kontsulta = session.createQuery(hql);
            kontsulta.setParameter("id", ID);
            kontsulta.setParameter("pass", pasahitza);
            /*
             * return (Langilea) kontsulta.uniqueResult();
             */
            List<Langilea> lista = kontsulta.list();
            session.getTransaction().commit();
            if (lista.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }

    }

    @Override
    public Langilea getLangileaByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Langilea e = (Langilea) session.get(Langilea.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Langilea();
        }
    }
    
    @Override
    public String getLangileMota(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Erizaina e = (Erizaina) session.get(Erizaina.class, ID);
            Idazkaria i = (Idazkaria) session.get(Idazkaria.class, ID);
            Sendagile_Berezia b = (Sendagile_Berezia) session.get(Sendagile_Berezia.class, ID);
            Sendagile_Orokorra o = (Sendagile_Orokorra) session.get(Sendagile_Orokorra.class, ID);
            session.getTransaction().commit();
            if(e==null){
                 if(i==null){
                       if(b==null){
                           if(o==null){
                               return " ";
                            }
                            else{
                                   return "sendagileOrokorra";
                           }
                        }
                        else{
                               return "sendagileBerezia";
                        }
                 }
                 else{
                        return "idazkaria";
                 }
            }
            else{
                return "erizaina";
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return "";
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
      @Override
    public List<Langilea> listaratu() {
        List<Langilea> bidaiaLista = new ArrayList<Langilea>();
        try{
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Langilea.class);
            bidaiaLista = criteria.list();
            session.getTransaction().commit();
        }catch (Exception ex) {
            Logger.getLogger(LangileaBean.class.getName()).log(Level.SEVERE, " listaratzean errorea");
            session.getTransaction().rollback();
        }
        return bidaiaLista;
    }
}
