/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Mendel
 */
public interface Konsulta_OrokorraDAO {
    
    public void gorde(Konsulta_Orokorra konsulta);
    public void ezabatu(Konsulta_Orokorra konsulta);
    public void editatu(Konsulta_Orokorra konsulta);
    public List<Konsulta_Orokorra> getSendagileKonsulta(int ID);
    public Konsulta_Orokorra getKonsulta_Orokorra(int zenbakia);
    public String saioaItxi();
    
    
}
