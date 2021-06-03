/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bean.Veiculo;

/**
 *
 * @author bianc
 */
public class VeiculoDAO {
    Veiculo vei = new Veiculo();
  
    //salvar
    public void novo(Veiculo vei) throws SQLException{
        
         //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "insert into veiculos(placa_veiculo, renavam_veiculo, ano_veiculo, "
                + "chassi_veiculo, marca_veiculo, modelo_veiculo, motor_veiculo, cor_veiculo, categoria_veiculo, "
                + "cambio_veiculo, qtdPassageiros_veiculo, arCondicionado_veiculo, diaria_veiculo, status_veiculo)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setString(1, vei.getPlaVei());
        stmt.setLong(2, vei.getRenVei());
        stmt.setInt(3, vei.getAnoVei());
        stmt.setString(4, vei.getChaVei());
        stmt.setString(5, vei.getMarVei());
        stmt.setString(6, vei.getModVei());
        stmt.setString(7, vei.getMotVei());
        stmt.setString(8, vei.getCorVei());
        stmt.setString(9, vei.getCatVei());
        stmt.setString(10, vei.getCamVei());
        stmt.setInt(11, vei.getPasVei());
        stmt.setString(12, vei.getArVei());
        stmt.setFloat(13, vei.getDiaVei());
        stmt.setString(14, vei.getStaVei());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    //editar
    public void editar(Veiculo vei) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "UPDATE veiculos SET placa_veiculo=?, renavam_veiculo=?, ano_veiculo=?, chassi_veiculo=?, marca_veiculo=?, "
                + "modelo_veiculo=?, motor_veiculo=?, cor_veiculo=?, categoria_veiculo=?, cambio_veiculo=?, qtdPassageiros_veiculo=?, arCondicionado_veiculo=?,"
                + "diaria_veiculo=?,status_veiculo=? where id_veiculo=?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setString(1, vei.getPlaVei());
        stmt.setLong(2, vei.getRenVei());
        stmt.setInt(3, vei.getAnoVei());
        stmt.setString(4, vei.getChaVei());
        stmt.setString(5, vei.getMarVei());
        stmt.setString(6, vei.getModVei());
        stmt.setString(7, vei.getMotVei());
        stmt.setString(8, vei.getCorVei());
        stmt.setString(9, vei.getCatVei());
        stmt.setString(10, vei.getCamVei());
        stmt.setInt(11, vei.getPasVei());
        stmt.setString(12, vei.getArVei());
        stmt.setFloat(13, vei.getDiaVei());
        stmt.setString(14, vei.getStaVei());
        stmt.setInt(15, vei.getIdVei());
        
        stmt.execute();
        
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    public Veiculo buscaCadastroPorCodigo(int cod)throws SQLException{
        Veiculo vei= new Veiculo(); 
         try {
           Connection Con = ConnectionFactory.getConnection();
            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM veiculos where id_veiculo = '"+cod+"'");
            rs.first();
            vei.setPlaVei(rs.getString("placa_veiculo"));
            vei.setRenVei(rs.getLong("renavam_veiculo"));
            vei.setAnoVei(rs.getInt("ano_veiculo"));
            vei.setChaVei(rs.getString("chassi_veiculo"));
            vei.setMarVei(rs.getString("marca_veiculo"));
            vei.setModVei(rs.getString("modelo_veiculo"));
            vei.setMotVei(rs.getString("motor_veiculo"));
            vei.setCorVei(rs.getString("cor_veiculo"));
            vei.setCatVei(rs.getString("categoria_veiculo"));
            vei.setCamVei(rs.getString("cambio_veiculo"));
            vei.setPasVei(rs.getInt("qtdPassageiros_veiculo"));
            vei.setArVei(rs.getString("arCondicionado_veiculo"));
            vei.setDiaVei(rs.getFloat("diaria_veiculo"));
            vei.setStaVei(rs.getString("status_veiculo"));
            
            rs.close();
            stmt.close();
            ConnectionFactory.closeConnection(Con);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return vei;
    }
               
    

    //excluir
    public void excluir(Veiculo vei) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "delete from veiculos where id_veiculo=?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, vei.getIdVei());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    //listar
    public List<Veiculo> listar() throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Veiculo> list = new ArrayList<>();
        String sql = "select * from veiculos";
        stmt = Con.prepareStatement(sql);
        rs = stmt.executeQuery();    
        while(rs.next()){
            Veiculo vei = new Veiculo();
            vei.setIdVei(rs.getInt("id_veiculo"));
            vei.setPlaVei(rs.getString("placa_veiculo"));
            vei.setModVei(rs.getString("modelo_veiculo"));
            vei.setDiaVei(rs.getFloat("diaria_veiculo"));
            vei.setStaVei(rs.getString("status_veiculo"));
            list.add(vei);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }
    
    //pesquisar
    public List<Veiculo> pesquisar(String chave) throws SQLException{
       //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Veiculo> list = new ArrayList<>();
        String sql = "select * from veiculos where placa_veiculo like ?";
        stmt = Con.prepareStatement(sql);
        stmt.setString(1,"%"+chave+"%");            
        rs = stmt.executeQuery();
        while(rs.next()){
            Veiculo vei = new Veiculo();
            vei.setIdVei(rs.getInt("id_veiculo"));
            vei.setPlaVei(rs.getString("placa_veiculo"));
            vei.setModVei(rs.getString("modelo_veiculo"));
            vei.setDiaVei(rs.getFloat("diaria_veiculo"));
            vei.setStaVei(rs.getString("status_veiculo"));
            list.add(vei);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }

}
