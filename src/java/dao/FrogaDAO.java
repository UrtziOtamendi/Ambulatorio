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
public interface FrogaDAO {
    
    public void gorde(Froga Froga);
    public void ezabatu(Froga Froga);
    public void editatu(Froga Froga);
    public Froga getKonsultaFroga(int zenb);
    public List<Froga> getErizainaFroga(int ID);
    public Froga getFroga(int zenbakia);
    public String saioaItxi();
    
    
}
