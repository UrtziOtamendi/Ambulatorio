/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dao.*;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import util.DAOFactory;

/**
 *
 * @author Mendel
 */
@ManagedBean
@SessionScoped
public class LangileaBean {

    Langilea langileBerria = new Langilea();
    Langilea langile = new Langilea();
    

    public LangileaBean() {
    }

    public Langilea getLangilea() {
        return langile;
    }
   
    public List<Langilea> listaratu() {
        LangileaDAO langileDAO = DAOFactory.langileaDAOSortu();
        return langileDAO.listaratu();
        
    }

    
  
}
