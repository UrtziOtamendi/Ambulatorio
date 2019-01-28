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
public class BolanteaDAOHibernate implements BolanteaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Bolantea bolante) {
        try {
            session.beginTransaction();
            session.save(bolante);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Bolantea bolante) {
        try {
            session.beginTransaction();
            session.delete(bolante);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Bolantea bolante) {
        try {
            session.beginTransaction();
            session.update(bolante);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

  
    @Override
    public Bolantea getBolantea(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Bolantea e = (Bolantea) session.get(Bolantea.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Bolantea();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
