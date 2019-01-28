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
import javax.servlet.http.HttpSession;
import util.DAOFactory;

/**
 *
 * @author Mendel
 */
@ManagedBean
@SessionScoped
public class loginBean {

  
   private Langilea langile = new Langilea();
   private Gaixoa gaixoa = new Gaixoa();
   private int username;
   private  String password;
    

    public loginBean() {
    }

    public Langilea getLangilea() {
        return langile;
    }
     public Gaixoa getGaixoa() {
        return gaixoa;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
   
    public String login() {
        LangileaDAO langileDAO = DAOFactory.langileaDAOSortu();
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        if(langileDAO.langileaEgiaztatu(username, password)){
            HttpSession session = SessionUtils.getSession();
	    session.setAttribute(String.valueOf(username), password);
            System.out.print("aaa");
            return langileDAO.getLangileMota(username);
        }
        else{
            System.out.print("jajaja");
               FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
			return "loginError";
            }
        }
        
    
    public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
        
    
  
}
