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
public class KonsultaDAOHibernate implements KonsultaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Konsulta konsulta) {
        try {
            session.beginTransaction();
            session.save(konsulta);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Konsulta konsulta) {
        try {
            session.beginTransaction();
            session.delete(konsulta);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Konsulta konsulta) {
        try {
            session.beginTransaction();
            session.update(konsulta);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<Konsulta> getGaixoaKonsulta(int GSZ) {
        try {
            session.beginTransaction();
            String hql = "from KONSULTA konsulta where konsulta.GSZ = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, GSZ);
            /*
             * return (GAIXOA) kontsulta.uniqueResult();
             */
            
             List<Konsulta> lista = kontsulta.list();
            session.getTransaction().commit();
            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }

    }

    @Override
    public Konsulta getKonsulta(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Konsulta e = (Konsulta) session.get(Konsulta.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Konsulta();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
