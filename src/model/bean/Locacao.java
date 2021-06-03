/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author bianc
 */
public class Locacao {
    private int idLoc;
    private int idCli;
    private int idVei;
    private String condutor1_locacao;
    private String condutor2_locacao;
    private double kmSaida_locacao;
    private double tqSaida_locacao;
    private double seguro_locacao;
    private Date dataSaida_locacao;
    private Date dataPrevista_locacao;
    private int qtdDias_locacao;
    private double valorTotal_locacao;

    public int getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdVei() {
        return idVei;
    }

    public void setIdVei(int idVei) {
        this.idVei = idVei;
    }

    public String getCondutor1_locacao() {
        return condutor1_locacao;
    }

    public void setCondutor1_locacao(String condutor1_locacao) {
        this.condutor1_locacao = condutor1_locacao;
    }

    public String getCondutor2_locacao() {
        return condutor2_locacao;
    }

    public void setCondutor2_locacao(String condutor2_locacao) {
        this.condutor2_locacao = condutor2_locacao;
    }

    public double getKmSaida_locacao() {
        return kmSaida_locacao;
    }

    public void setKmSaida_locacao(double kmSaida_locacao) {
        this.kmSaida_locacao = kmSaida_locacao;
    }

    public double getTqSaida_locacao() {
        return tqSaida_locacao;
    }

    public void setTqSaida_locacao(double tqSaida_locacao) {
        this.tqSaida_locacao = tqSaida_locacao;
    }

    public Double getSeguro_locacao() {
        return seguro_locacao;
    }

    public void setSeguro_locacao(Double seguro_locacao) {
        this.seguro_locacao = seguro_locacao;
    }

    public Date getDataSaida_locacao() {
        return dataSaida_locacao;
    }

    public void setDataSaida_locacao(Date dataSaida_locacao) {
        this.dataSaida_locacao = dataSaida_locacao;
    }

    public Date getDataPrevista_locacao() {
        return dataPrevista_locacao;
    }

    public void setDataPrevista_locacao(Date dataPrevista_locacao) {
        this.dataPrevista_locacao = dataPrevista_locacao;
    }

    public int getQtdDias_locacao() {
        return qtdDias_locacao;
    }

    public void setQtdDias_locacao(int qtdDias_locacao) {
        this.qtdDias_locacao = qtdDias_locacao;
    }

    public double getValorTotal_locacao() {
        return valorTotal_locacao;
    }

    public void setValorTotal_locacao(double valorTotal_locacao) {
        this.valorTotal_locacao = valorTotal_locacao;
    }
}
