/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface IdazkariaDAO {
    
    public void gorde(Idazkaria idazkari);
    public void ezabatu(Idazkaria idazkari);
    public void editatu(Idazkaria idazkari);
    public Idazkaria getIdazkariaByID(int ID);
    public String saioaItxi();
    
    
}
