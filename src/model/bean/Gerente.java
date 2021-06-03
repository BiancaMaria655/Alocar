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
public class Gerente {
    private int id_gerente;
    private String login_gerente;
    private String senha_gerente;

    public int getId() {
        return id_gerente;
    }

    public void setId(int id) {
        this.id_gerente = id;
    }

    public String getLogin() {
        return login_gerente;
    }

    public void setLogin(String login) {
        this.login_gerente = login;
    }

    public String getSenha() {
        return senha_gerente;
    }

    public void setSenha(String senha) {
        this.senha_gerente = senha;
    }
    
    
    
}
