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
public class GaixoaDAOHibernate implements GaixoaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Gaixoa gaixo) {
        try {
            session.beginTransaction();
            session.save(gaixo);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Gaixoa gaixo) {
        try {
            session.beginTransaction();
            session.delete(gaixo);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Gaixoa gaixo) {
        try {
            session.beginTransaction();
            session.update(gaixo);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public boolean gaixoaEgiaztatu(int GSZ, String pasahitza) {
        try {
             System.out.print(GSZ);
            System.out.print(pasahitza);
            session.beginTransaction();
            String hql = "Select GSZ from Gaixoa where GSZ=:gsz and pasahitza=:pass";
            Query kontsulta = session.createQuery(hql);
            kontsulta.setParameter("gsz", GSZ);
            kontsulta.setParameter("pass", pasahitza);
            /*
             * return (GAIXOA) kontsulta.uniqueResult();
             */
            List<Gaixoa> lista = kontsulta.list();
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
    public Gaixoa getGaixoaByGSZ(int GSZ) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Gaixoa e = (Gaixoa) session.get(Gaixoa.class, GSZ);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Gaixoa();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
