/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface ErizainaDAO {
    
    public void gorde(Erizaina erizain);
    public void ezabatu(Erizaina erizain);
    public void editatu(Erizaina erizain);
    public Erizaina getErizainaByID(int ID);
    public String saioaItxi();
    
    
}
