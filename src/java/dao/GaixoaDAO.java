/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mendel
 */
public interface GaixoaDAO {
    
    public void gorde(Gaixoa gaixo);
    public void ezabatu(Gaixoa gaixo);
    public void editatu(Gaixoa gaixo);
    public boolean gaixoaEgiaztatu(int GSZ, String pasahitza);
    public Gaixoa getGaixoaByGSZ(int GSZ);
    public String saioaItxi();
    
    
}
