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
public class HistorialaDAOHibernate implements  HistorialaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde( Historiala  Historiala) {
        try {
            session.beginTransaction();
            session.save( Historiala);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu( Historiala  Historiala) {
        try {
            session.beginTransaction();
            session.delete( Historiala);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu( Historiala  Historiala) {
        try {
            session.beginTransaction();
            session.update( Historiala);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<Historiala> getGaixoaHistorial(int GSZ) {
        try {
            session.beginTransaction();
            String hql = "from HISTORIAL hist where hist.GSZ = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, GSZ);
            /*
             * return (GAIXOA) kontsulta.uniqueResult();
             */
            
             List<Historiala> lista = kontsulta.list();
            session.getTransaction().commit();
            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }

    }
  @Override
    public Historiala getKonsultaHistorial(int zenbakia) {
        try {
            session.beginTransaction();
            String hql = "from HISTORIAL hist where hist.KONSULTA = ? ";
            Query kontsulta = session.createQuery(hql).setParameter(0, zenbakia);
            /*
             * return (GAIXOA) kontsulta.uniqueResult();
             */
            
            List<Historiala> lista = kontsulta.list();
            session.getTransaction().commit();
            if(lista.isEmpty()){
                return lista.get(0);   
            }
            else{
                  return new Historiala();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Historiala();
        }

    }
    @Override
    public Historiala getHistoriala(int zenbakia) {
        try {
            session = this.session.getSessionFactory().openSession();//????
            session.beginTransaction();
            Historiala e = (Historiala) session.get(Historiala.class, zenbakia);
            session.getTransaction().commit();
            return e;
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return new Historiala();
        }
    }

    @Override
    public String saioaItxi() {
        
        session.close();
        return "index";
    }
    
    
}
