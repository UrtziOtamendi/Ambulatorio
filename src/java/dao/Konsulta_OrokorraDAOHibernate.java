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
public class Konsulta_OrokorraDAOHibernate implements Konsulta_OrokorraDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Konsulta_Orokorra konsulta) {
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
    public void ezabatu(Konsulta_Orokorra konsulta) {
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
    public void editatu(Konsulta_Orokorra konsulta) {
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
    public List<Konsulta_Orokorra> getSendagileKonsulta(int ID) {
        try {
            session.beginTransaction();
            String hql = "from OROKORRA konsulta where konsulta.SENDAGILEID = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0,ID);
            /*
             * return (GAIXOA) kontsulta.uniqueResult();
             */
            
             List<Konsulta_Orokorra> lista = kontsulta.list();
            session.getTransaction().commit();
            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }

    }

    @Override
    public Konsulta_Orokorra getKonsulta_Orokorra(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Konsulta_Orokorra e = (Konsulta_Orokorra) session.get(Konsulta_Orokorra.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Konsulta_Orokorra();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
