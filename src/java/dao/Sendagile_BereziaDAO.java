/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface Sendagile_BereziaDAO {
    
    public void gorde(Sendagile_Berezia sendag);
    public void ezabatu(Sendagile_Berezia sendag);
    public void editatu(Sendagile_Berezia sendag);
    public Sendagile_Berezia getSendagile_BereziaByID(int ID);
    public String saioaItxi();
    
    
}
