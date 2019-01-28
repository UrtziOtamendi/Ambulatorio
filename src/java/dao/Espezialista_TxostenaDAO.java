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
public interface Espezialista_TxostenaDAO {
    
    public void gorde(Espezialista_Txostena txost);
    public void ezabatu(Espezialista_Txostena txost);
    public void editatu(Espezialista_Txostena txost);
 public Espezialista_Txostena getKonsultaTxostena(int konsulta);
     public Espezialista_Txostena getEspezialistaTxostena(int zenbakia);
    public String saioaItxi();
    
    
}
