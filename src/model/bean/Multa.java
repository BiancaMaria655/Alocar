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
public class Multa {
    private int idMul;
    private int idCli;
    private int idLoc;
    private String sitMul;
    private Long numMul;
    private double valMul;
    private String locMul;
    private String cidMul;
    private String estMul;
    private String descMult;
    private Date datMul;
    private String orgMul;

    public int getIdMul() {
        return idMul;
    }

    public void setIdMul(int idMul) {
        this.idMul = idMul;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }

    public String getSitMul() {
        return sitMul;
    }

    public void setSitMul(String sitMul) {
        this.sitMul = sitMul;
    }

    public long getNumMul() {
        return numMul;
    }

    public void setNumMul(long numMul) {
        this.numMul = numMul;
    }

    public double getValMul() {
        return valMul;
    }

    public void setValMul(double valMul) {
        this.valMul = valMul;
    }

    public String getLocMul() {
        return locMul;
    }

    public void setLocMul(String locMul) {
        this.locMul = locMul;
    }

    public String getCidMul() {
        return cidMul;
    }

    public void setCidMul(String cidMul) {
        this.cidMul = cidMul;
    }

    public String getEstMul() {
        return estMul;
    }

    public void setEstMul(String estMul) {
        this.estMul = estMul;
    }

    public String getDescMult() {
        return descMult;
    }

    public void setDescMult(String descMult) {
        this.descMult = descMult;
    }

    public Date getDatMul() {
        return datMul;
    }

    public void setDatMul(Date datMul) {
        this.datMul = datMul;
    }

    public String getOrgMul() {
        return orgMul;
    }

    public void setOrgMul(String orgMul) {
        this.orgMul = orgMul;
    }
    
    
}
