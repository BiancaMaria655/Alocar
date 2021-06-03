/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author konno
 */
public class Atendente {
    private int id_atendente;
    private String login_atendente;
    private String senha_atendente;

    public int getId() {
        return id_atendente;
    }

    public void setId(int id) {
        this.id_atendente = id;
    }

    public String getLogin() {
        return login_atendente;
    }

    public void setLogin(String login) {
        this.login_atendente = login;
    }

    public String getSenha() {
        return senha_atendente;
    }

    public void setSenha(String senha) {
        this.senha_atendente = senha;
    }
    
    
    
}
    

