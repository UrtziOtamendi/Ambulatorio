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
public class Sendagile_OrokorraDAOHibernate implements Sendagile_OrokorraDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Sendagile_Orokorra sendag) {
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
    public void ezabatu(Sendagile_Orokorra sendag) {
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
    public void editatu(Sendagile_Orokorra sendag) {
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
    public Sendagile_Orokorra getSendagile_OrokorraByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Sendagile_Orokorra e = (Sendagile_Orokorra) session.get(Sendagile_Orokorra.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Sendagile_Orokorra();
        }
    }
   

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
