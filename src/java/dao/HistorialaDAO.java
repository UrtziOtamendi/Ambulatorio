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
public interface HistorialaDAO{
    
    public void gorde(Historiala Historiala);
    public void ezabatu(Historiala Historiala);
    public void editatu(Historiala Historiala);
    public List<Historiala> getGaixoaHistorial(int GSZ);
    public Historiala getKonsultaHistorial(int zenbakia);

    public Historiala getHistoriala(int zenbakia);
    public String saioaItxi();
    
    
}
