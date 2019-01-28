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
public interface BolanteaDAO {
    
    public void gorde(Bolantea bolante);
    public void ezabatu(Bolantea bolante);
    public void editatu(Bolantea bolante);

      public Bolantea getBolantea(int zenbakia);
    public String saioaItxi();
    
    
}
