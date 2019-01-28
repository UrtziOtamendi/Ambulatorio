/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface Sendagile_OrokorraDAO {
    
    public void gorde(Sendagile_Orokorra sendag);
    public void ezabatu(Sendagile_Orokorra sendag);
    public void editatu(Sendagile_Orokorra sendag);
    public Sendagile_Orokorra getSendagile_OrokorraByID(int ID);
    public String saioaItxi();
    
    
}
