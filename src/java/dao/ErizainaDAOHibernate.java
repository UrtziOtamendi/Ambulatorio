/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Mendel
 */
public class ErizainaDAOHibernate implements ErizainaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Erizaina erizaina) {
        try {
            session.beginTransaction();
            session.save(erizaina);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Erizaina erizaina) {
        try {
            session.beginTransaction();
            session.delete(erizaina);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Erizaina erizaina) {
        try {
            session.beginTransaction();
            session.update(erizaina);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

   

    @Override
    public Erizaina getErizainaByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Erizaina e = (Erizaina) session.get(Erizaina.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Erizaina();
        }
    }
   

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
