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
public interface Konsulta_BereziaDAO {
    
    public void gorde(Konsulta_Berezia konsulta);
    public void ezabatu(Konsulta_Berezia konsulta);
    public void editatu(Konsulta_Berezia konsulta);
    public List<Konsulta_Berezia> getSendagileKonsulta(int ID);
    public Konsulta_Berezia getKonsulta_Orokorra(int zenbakia);
    public String saioaItxi();
    
    
}
