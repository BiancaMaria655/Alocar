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
import model.bean.Checklist;
/**
 *
 * @author konno
 */
public class ChecklistDAO {
     public void salvar (Checklist chk) throws SQLException{
        
         //abrir conexão com o banco
        Connection Con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO checklist(retrovisor_checklist, farol_checklist, lanternas_checklist, luzFreio_checklist, luzRe_checklist, setas_checklist,"
                + "luzTeto_checklist, arCondicionado_checklist, partida_checklist, teto_checklist,limpadores_checklist,sensor_checklist,relogio_checklist,"
                + "alarme_checklist,travas_checklist,tampaPortaLuv_checklist,piscaAlerta_checklist,acendedor_checklist,radio_checklist,"
                + "vidroElet_checklist,bateria_checklist,buzina_checklist,assentoElevADC_checklist,cadeirinhaADC_checklist,bebeConfADC_checklist,"
                + "gpsADC_checklist,wifiADC_checklist,kitConnecADC_checklist) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
        PreparedStatement stmt = Con.prepareStatement(sql);
        stmt.setString(1, chk.getRetrovisor_checklist());
        stmt.setString(2, chk.getFarol_checklist());
        stmt.setString(3, chk.getLanternas_checklist());
        stmt.setString(4, chk.getLuzFreio_checklist());
        stmt.setString(5, chk.getLuzRe_checklist());
        stmt.setString(6, chk.getSetas_checklist());      
        stmt.setString(7, chk.getLuzTeto_checklist());
        stmt.setString(8, chk.getArCondicionado_checklist());
        stmt.setString(9, chk.getPartida_checklist());
        stmt.setString(10, chk.getTeto_checklist());
        stmt.setString(11, chk.getLimpadores_checklist());     
        stmt.setString(12, chk.getSensor_checklist());
        stmt.setString(13, chk.getRelogio_checklist());
        stmt.setString(14, chk.getAlarme_checklist());
        stmt.setString(15, chk.getTravas_checklist());
        stmt.setString(16, chk.getTampaPortaLuv_checklist());     
        stmt.setString(17, chk.getPiscaAlerta_checklist());
        stmt.setString(18, chk.getAcendedor_checklist());
        stmt.setString(19, chk.getRadio_checklist());
        stmt.setString(20, chk.getVidroElet_checklist());
        stmt.setString(21, chk.getBateria_checklist());      
        stmt.setString(22, chk.getBuzina_checklist());
        stmt.setString(23, chk.getAssentoElevADC_checklist());
        stmt.setString(24, chk.getCadeirinhaADC_checklist());
        stmt.setString(25, chk.getBebeConfADC_checklist());
        stmt.setString(26, chk.getGpsADC_checklist());
        stmt.setString(27, chk.getWifiADC_checklist());
        stmt.setString(28, chk.getKitConnecADC_checklist());
        
        stmt.execute();
        stmt.close();
        ConnectionFactory.closeConnection(Con);
         
    }
}

