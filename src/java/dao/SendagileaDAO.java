/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface SendagileaDAO{
    
    public void gorde(Sendagilea Sendagilea);
    public void ezabatu(Sendagilea Sendagilea);
    public void editatu(Sendagilea Sendagilea);
    public Sendagilea getSendagileaByID(int ID);
    public String saioaItxi();
    
    
}
