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
public interface KonsultaDAO {
    
    public void gorde(Konsulta konsulta);
    public void ezabatu(Konsulta konsulta);
    public void editatu(Konsulta konsulta);
    public List<Konsulta> getGaixoaKonsulta(int GSZ);
      public Konsulta getKonsulta(int zenbakia);
    public String saioaItxi();
    
    
}
