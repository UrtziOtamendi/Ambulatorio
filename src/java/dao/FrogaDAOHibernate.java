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
public class FrogaDAOHibernate implements FrogaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Froga Froga) {
        try {
            session.beginTransaction();
            session.save(Froga);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Froga Froga) {
        try {
            session.beginTransaction();
            session.delete(Froga);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Froga Froga) {
        try {
            session.beginTransaction();
            session.update(Froga);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<Froga> getErizainaFroga(int ID) {
        try {
            session.beginTransaction();
            String hql = "from FROGA_ZERRENDA froga where froga.ERIZAINAID = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, ID);
          
            
             List<Froga> lista = kontsulta.list();
            session.getTransaction().commit();
            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }

    }
     @Override
    public Froga getKonsultaFroga(int zenb) {
        try {
            session.beginTransaction();
            String hql = "from FROGA_ZERRENDA froga where froga.KONSULTA = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, zenb);
          
            
             List<Froga> lista = kontsulta.list();
            session.getTransaction().commit();
            return lista.get(0);
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }

    }

    @Override
    public Froga getFroga(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Froga e = (Froga) session.get(Froga.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Froga();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
