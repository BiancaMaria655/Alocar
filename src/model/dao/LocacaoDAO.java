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
import model.bean.Locacao;
/**
 *
 * @author bianc
 */
public class LocacaoDAO {
    Locacao loc = new Locacao();
  
   
    //salvar
    public void novo(Locacao loc) throws SQLException{
        
         //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "insert into locacoes(id_cliente, id_veiculo, condutor1_locacao, condutor2_locacao, kmSaida_locacao"
                + "tqSaida_locacao, seguro_locacao, dataSaida_locacao, dataPrevista_locacao, qtdDias_locacao"
                + "valorTotal_locacao) values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, loc.getIdCli());
        stmt.setInt(2, loc.getIdVei());
        stmt.setString(3, loc.getCondutor1_locacao());
        stmt.setString(4, loc.getCondutor2_locacao());
        stmt.setDouble(5, loc.getKmSaida_locacao());
        stmt.setDouble(6, loc.getTqSaida_locacao());
        stmt.setDouble(7, loc.getSeguro_locacao());
        stmt.setDate(8, loc.getDataSaida_locacao());
        stmt.setDate(9, loc.getDataPrevista_locacao());
        stmt.setInt(10, loc.getQtdDias_locacao());
        stmt.setDouble(11, loc.getValorTotal_locacao());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    //editar
    public void editar(Locacao loc) throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "UPDATE locacoes SET id_cliente = ?, id_veiculo = ?, condutor1_locacao = ?, condutor2_locacao = ?, kmSaida_locacao = ?"
                + "tqSaida_locacao = ?, seguro_locacao = ?, dataSaida_locacao = ?, dataPrevista_locacao = ?, qtdDias_locacao = ?"
                + "valorTotal_locacao = ? where id_locacao = ?";
         PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setInt(1, loc.getIdCli());
        stmt.setInt(2, loc.getIdVei());
        stmt.setString(3, loc.getCondutor1_locacao());
        stmt.setString(4, loc.getCondutor2_locacao());
        stmt.setDouble(5, loc.getKmSaida_locacao());
        stmt.setDouble(6, loc.getTqSaida_locacao());
        stmt.setDouble(7, loc.getSeguro_locacao());
        stmt.setDate(8, loc.getDataSaida_locacao());
        stmt.setDate(9, loc.getDataPrevista_locacao());
        stmt.setInt(10, loc.getQtdDias_locacao());
        stmt.setDouble(11, loc.getValorTotal_locacao());
        
        stmt.execute();
        
        stmt.close();
        ConnectionFactory.closeConnection(Con);
    }
    
    public Locacao buscaCadastroPorCodigo(int cod)throws SQLException{
        Locacao loc= new Locacao(); 
         try {
           Connection Con = ConnectionFactory.getConnection();
            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM locacoes where id_locacao = '"+cod+"'");
            rs.first();
            loc.setIdCli(rs.getInt("id_cliente"));
            loc.setIdVei(rs.getInt("id_veiculo"));
            loc.setCondutor1_locacao(rs.getString("condutor1_locacao"));
            loc.setCondutor2_locacao(rs.getString("condutor2_locacao"));
            loc.setKmSaida_locacao(rs.getDouble("kmSaida_locacao"));
            loc.setTqSaida_locacao(rs.getDouble("tqSaida_locacao"));
            loc.setSeguro_locacao(rs.getDouble("seguro_locacao"));
            loc.setDataSaida_locacao(rs.getDate("dataSaida_locacao"));
            loc.setDataPrevista_locacao(rs.getDate("dataPrevista_locacao"));
            loc.setQtdDias_locacao(rs.getInt("qtdDias_locacao"));
            loc.setValorTotal_locacao(rs.getDouble("valorTotal_locacao"));
            
            rs.close();
            stmt.close();
            Con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return loc;
    }
    
    //listar
    public List<Locacao> listar() throws SQLException{
        //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Locacao> list = new ArrayList<>();
        String sql = "select * from locacoes";
        stmt = Con.prepareStatement(sql);
        rs = stmt.executeQuery();    
        while(rs.next()){
            Locacao loc = new Locacao();
            loc.setIdLoc(rs.getInt("id_locacao"));
            loc.setQtdDias_locacao(rs.getInt("id_veiculo"));
            loc.setValorTotal_locacao(rs.getDouble("qtdDias_locacao"));
            list.add(loc);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }
    
    //pesquisar
    public List<Locacao> pesquisar(int cod) throws SQLException{
       //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;
        List<Locacao> list = new ArrayList<>();
        String sql = "select * from locacoes where id_multa = '"+cod+"'";
        stmt = Con.prepareStatement(sql);
        stmt.setString(1,"%"+cod+"%");            
        rs = stmt.executeQuery();
        while(rs.next()){
           Locacao loc = new Locacao();
            loc.setIdLoc(rs.getInt("id_locacao"));
            loc.setIdCli(rs.getInt("id_cliente"));
            loc.setIdVei(rs.getInt("id_veiculo"));
            loc.setValorTotal_locacao(rs.getDouble("valorTotal_locacao"));
            list.add(loc);
        }
        stmt.execute();
        rs.close();
        ConnectionFactory.closeConnection(Con);
        return list;
    }

    
}
