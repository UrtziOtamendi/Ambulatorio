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
public class SendagileaDAOHibernate implements SendagileaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Sendagilea Sendagilea) {
        try {
            session.beginTransaction();
            session.save(Sendagilea);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Sendagilea Sendagilea) {
        try {
            session.beginTransaction();
            session.delete(Sendagilea);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Sendagilea Sendagilea) {
        try {
            session.beginTransaction();
            session.update(Sendagilea);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

   

    @Override
    public Sendagilea getSendagileaByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Sendagilea e = (Sendagilea) session.get(Sendagilea.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Sendagilea();
        }
    }
   

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
