/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.Date;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Cliente;
/**
 *
 * @author bianc
 */
public class ClienteDAO {
    Cliente cli = new Cliente();
 
    
   
   
    //salvar
    public void novo(Cliente cli) throws SQLException{
        
         //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "insert into clientes(nome_cliente, cpf_cliente, rg_cliente, telefoneSMS_cliente, telefone2_cliente, "
                + "email_cliente, endereco_cliente,bairro_cliente, cidade_cliente, uf_cliente, cep_cliente, numeroCNH_cliente,"
                + "validadeCNH_cliente,categoriaCNH_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setString(1, cli.getNomeCli());
        stmt.setLong(2, cli.getCpfCli());
        stmt.setString(3, cli.getRgCli());
        stmt.setString(4, cli.getTelefoneSMSCli());
        stmt.setString(5, cli.getTelefone2Cli());
        stmt.setString(6, cli.getEmailCli());
        stmt.setString(7, cli.getEnderecoCli());
        stmt.setString(8, cli.getBairroCli());
        stmt.setString(9, cli.getCidadeCli());
        stmt.setString(10, cli.getUfCli());
        stmt.setString(11, cli.getCepCli());
        stmt.setString(12, cli.getNumeroCNHCli());
        stmt.setDate(13, cli.getValidadeCNHCli());
        stmt.setString(14, cli.getCategoriaCli());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    //editar
    public void editar(Cliente cli) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "UPDATE clientes SET nome_cliente=?, cpf_cliente=?, rg_cliente=?, telefoneSMS_cliente=?, telefone2_cliente=?, "
                + "email_cliente=?, endereco_cliente=?, bairro_cliente=?, cidade_cliente=?, uf_cliente=?, cep_cliente=?, numeroCNH_cliente=?,"
                + "validadeCNH_cliente=?,categoriaCNH_cliente=? where id_cliente=?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setString(1, cli.getNomeCli());
        stmt.setLong(2, cli.getCpfCli());
        stmt.setString(3, cli.getRgCli());
        stmt.setString(4, cli.getTelefoneSMSCli());
        stmt.setString(5, cli.getTelefone2Cli());
        stmt.setString(6, cli.getEmailCli());
        stmt.setString(7, cli.getEnderecoCli());
        stmt.setString(8, cli.getBairroCli());
        stmt.setString(9, cli.getCidadeCli());
        stmt.setString(10, cli.getUfCli());
        stmt.setString(11, cli.getCepCli());
        stmt.setString(12, cli.getNumeroCNHCli());
        stmt.setDate(13, cli.getValidadeCNHCli());
        stmt.setString(14, cli.getCategoriaCli());
        stmt.setInt(15, cli.getIdCli());
        
        stmt.execute();
        
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    public Cliente buscaCadastroPorCodigo(int cod)throws SQLException{
        Cliente cli= new Cliente(); 
         try {
           Connection Con = ConnectionFactory.getConnection();
            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes where id_cliente = '"+cod+"'");
            rs.first();
            cli.setNomeCli(rs.getString("nome_cliente"));
            cli.setCpfCli(rs.getInt("cpf_cliente"));
            cli.setRgCli(rs.getString("rg_cliente"));
            cli.setEmailCli(rs.getString("email_cliente"));
            cli.setCidadeCli(rs.getString("cidade_cliente"));
            cli.setTelefoneSMSCli(rs.getString("telefoneSMS_cliente"));
            cli.setTelefone2Cli(rs.getString("telefone2_cliente"));
            cli.setEnderecoCli(rs.getString("endereco_cliente"));
            cli.setBairroCli(rs.getString("bairro_cliente"));
            cli.setCidadeCli(rs.getString("cidade_cliente"));
            cli.setUfCli(rs.getString("uf_cliente"));
            cli.setCepCli(rs.getString("cep_cliente"));
            cli.setNumeroCNHCli(rs.getString("numeroCNH_cliente"));
            cli.setValidadeCNHCli(rs.getDate("validadeCNH_cliente"));
            cli.setCategoriaCli(rs.getString("categoriaCNH_cliente"));
            
            rs.close();
            stmt.close();
            Con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return cli;
    }
               
    

    //excluir
    public void excluir(Cliente cli) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "delete from clientes where id_cliente=?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, cli.getIdCli());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    //listar
    public List<Cliente> listar() throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Cliente> list = new ArrayList<>();
        String sql = "select * from clientes";
        stmt = Con.prepareStatement(sql);
        rs = stmt.executeQuery();    
        while(rs.next()){
            Cliente cli = new Cliente();
            cli.setIdCli(rs.getInt("id_cliente"));
            cli.setNomeCli(rs.getString("nome_cliente"));
            cli.setCpfCli(rs.getLong("cpf_cliente"));
            cli.setNumeroCNHCli(rs.getString("numeroCNH_cliente"));
            cli.setValidadeCNHCli(rs.getDate("validadeCNH_cliente"));
            list.add(cli);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }
    
    //pesquisar
    public List<Cliente> pesquisar(String chave) throws SQLException{
       //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Cliente> list = new ArrayList<>();
        String sql = "select * from clientes where nome_cliente like ?";
        stmt = Con.prepareStatement(sql);
        stmt.setString(1,"%"+chave+"%");            
        rs = stmt.executeQuery();
        while(rs.next()){
            Cliente cli = new Cliente();
            cli.setIdCli(rs.getInt("id_cliente"));
            cli.setNomeCli(rs.getString("nome_cliente"));
            cli.setCpfCli(rs.getLong("cpf_cliente"));
            cli.setNumeroCNHCli(rs.getString("numeroCNH_cliente"));
            cli.setValidadeCNHCli(rs.getDate("validadeCNH_cliente"));
            list.add(cli);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }

    
}
