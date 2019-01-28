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
public class IdazkariaDAOHibernate implements IdazkariaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Idazkaria idazkari) {
        try {
            session.beginTransaction();
            session.save(idazkari);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Idazkaria idazkari) {
        try {
            session.beginTransaction();
            session.delete(idazkari);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Idazkaria idazkari) {
        try {
            session.beginTransaction();
            session.update(idazkari);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

   

    @Override
    public Idazkaria getIdazkariaByID(int ID) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Idazkaria e = (Idazkaria) session.get(Idazkaria.class, ID);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Idazkaria();
        }
    }
   

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
