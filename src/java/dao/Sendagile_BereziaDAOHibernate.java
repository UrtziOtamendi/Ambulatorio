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
public class Sendagile_BereziaDAOHibernate implements Sendagile_BereziaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Sendagile_Berezia sendag) {
        try {
            session.beginTransaction();
            session.save(sendag);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Sendagile_Berezia sendag) {
        try {
            session.beginTransaction();
            session.delete(sendag);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Sendagile_Berezia sendag) {
        try {
            session.beginTransaction();
            session.update(sendag);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

   

    @Override
    public Sendagile_Berezia getSendagile_BereziaByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Sendagile_Berezia e = (Sendagile_Berezia) session.get(Sendagile_Orokorra.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Sendagile_Berezia();
        }
    }
   

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
