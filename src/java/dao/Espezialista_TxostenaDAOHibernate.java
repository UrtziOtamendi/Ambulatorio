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
public class Espezialista_TxostenaDAOHibernate implements Espezialista_TxostenaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Espezialista_Txostena txost) {
        try {
            session.beginTransaction();
            session.save(txost);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Espezialista_Txostena txost) {
        try {
            session.beginTransaction();
            session.delete(txost);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Espezialista_Txostena txost) {
        try {
            session.beginTransaction();
            session.update(txost);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

  
    @Override
    public Espezialista_Txostena getEspezialistaTxostena(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Espezialista_Txostena e = (Espezialista_Txostena) session.get(Espezialista_Txostena.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Espezialista_Txostena();
        }
    }
  @Override
    public Espezialista_Txostena getKonsultaTxostena(int konsulta) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            
            String hql = "from ESPEZIALISTA_TXOSTENA txost where txost.KONSULTA = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, konsulta);
            List<Espezialista_Txostena> lista = kontsulta.list();
            session.getTransaction().commit();
            
                return lista.get(0);
           
            
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Espezialista_Txostena();
        }
    }
    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
