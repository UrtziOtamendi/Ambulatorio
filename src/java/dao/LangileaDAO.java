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
public interface LangileaDAO {
    
    public void gorde(Langilea lengile);
    public void ezabatu(Langilea lengile);
    public void editatu(Langilea lengile);
    public boolean langileaEgiaztatu(int ID, String pasahitza);
    public Langilea getLangileaByID(int ID);
    public String getLangileMota(int ID);
    public String saioaItxi();
    public List<Langilea> listaratu() ;
    
    
}
