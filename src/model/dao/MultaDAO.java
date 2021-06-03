/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.sql.Date;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Multa;
/**
 *
 * @author bianc
 */
public class MultaDAO {
    Multa mul = new Multa();
   
    //salvar
    public void novo(Multa mul) throws SQLException{
        
         //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "insert into multas(id_cliente, id_locacao, situacao_multa, numero_multa, valor_multa,"
                + "local_multa, cidade_multa, estado_multa, descricao_multa, data_multa, orgao_multa) "
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, mul.getIdCli());
        stmt.setInt(2, mul.getIdLoc());
        stmt.setString(3, mul.getSitMul());
        stmt.setLong(4, mul.getNumMul());
        stmt.setDouble(5, mul.getValMul());
        stmt.setString(6, mul.getLocMul());
        stmt.setString(7, mul.getCidMul());
        stmt.setString(8, mul.getEstMul());
        stmt.setString(9, mul.getDescMult());
        stmt.setDate(10, new java.sql.Date(mul.getDatMul().getTime()));
        stmt.setString(11, mul.getOrgMul());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    //editar
    public void editar(Multa mul) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "UPDATE multas SET id_locacao = ?, situacao_multa = ?, numero_multa = ?, valor_multa = ?,"
                + "local_multa = ?, cidade_multa = ?, estado_multa = ?, descricao_multa = ?, "
                + "data_multa = ?, orgao_multa = ? where id_multa = ?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, mul.getIdLoc());
        stmt.setString(2, mul.getSitMul());
        stmt.setLong(3, mul.getNumMul());
        stmt.setDouble(4, mul.getValMul());
        stmt.setString(5, mul.getLocMul());
        stmt.setString(6, mul.getCidMul());
        stmt.setString(7, mul.getEstMul());
        stmt.setString(8, mul.getDescMult());
        stmt.setDate(9, mul.getDatMul());
        stmt.setString(10, mul.getOrgMul());
        stmt.setInt(11, mul.getIdCli());
        
        stmt.execute();
        
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    public Multa buscaCadastroPorCodigo(int cod)throws SQLException{
        Multa mul= new Multa(); 
         try {
           Connection Con = ConnectionFactory.getConnection();
            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM multas where id_multa = '"+cod+"'");
            rs.first();
            mul.setIdCli(rs.getInt("id_cliente"));
            mul.setIdLoc(rs.getInt("id_locacao"));
            mul.setSitMul(rs.getString("situacao_multa"));
            mul.setNumMul(rs.getLong("numero_multa"));
            mul.setValMul(rs.getDouble("valor_multa"));
            mul.setLocMul(rs.getString("local_multa"));
            mul.setCidMul(rs.getString("cidade_multa"));
            mul.setEstMul(rs.getString("estado_multa"));
            mul.setDescMult(rs.getString("descricao_multa"));
            mul.setDatMul(rs.getDate("data_multa"));
            mul.setOrgMul(rs.getString("orgao_multa"));
            
            rs.close();
            stmt.close();
            Con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return mul;
    }
               
    

    //excluir
    public void excluir(Multa mul) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "delete from multas where id_multa=?";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, mul.getIdMul());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    //listar
    public List<Multa> listar() throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Multa> list = new ArrayList<>();
        String sql = "select * from multas";
        stmt = Con.prepareStatement(sql);
        rs = stmt.executeQuery();    
        while(rs.next()){
            Multa mul = new Multa();
            mul.setIdMul(rs.getInt("id_multa"));
            mul.setNumMul(rs.getInt("numero_multa"));
            mul.setValMul(rs.getLong("valor_multa"));
            mul.setDatMul(rs.getDate("data_multa"));
            mul.setSitMul(rs.getString("situacao_multa"));
            list.add(mul);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }
    
    //pesquisar
    public List<Multa> pesquisar(int cod) throws SQLException{
       //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Multa> list = new ArrayList<>();
        String sql = "select * from multas where id_multa = '"+cod+"'";
        stmt = Con.prepareStatement(sql);
        stmt.setString(1,"%"+cod+"%");            
        rs = stmt.executeQuery();
        while(rs.next()){
            Multa mul = new Multa();
            mul.setIdMul(rs.getInt("id_multa"));
            mul.setNumMul(rs.getInt("numero_multa"));
            mul.setValMul(rs.getLong("valor_multa"));
            mul.setDatMul(rs.getDate("data_multa"));
            mul.setSitMul(rs.getString("situacao_multa"));
            list.add(mul);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }

    
}

