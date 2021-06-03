/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;


import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Multa;
import model.dao.MultaDAO;


public class TelaMultasInserir extends javax.swing.JFrame {

    public TelaMultasInserir() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnumero = new javax.swing.JLabel();
        lorgao = new javax.swing.JLabel();
        ldata = new javax.swing.JLabel();
        lcidade = new javax.swing.JLabel();
        lestado = new javax.swing.JLabel();
        llocal = new javax.swing.JLabel();
        lvalor = new javax.swing.JLabel();
        ldescricao = new javax.swing.JLabel();
        lsituacao = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldorgao = new javax.swing.JTextField();
        jTextFielddata = new javax.swing.JTextField();
        jTextFieldcidade = new javax.swing.JTextField();
        jTextFieldestado = new javax.swing.JTextField();
        jTextFieldLocal = new javax.swing.JTextField();
        jTextFieldvalor = new javax.swing.JTextField();
        jTextFielddescricao = new javax.swing.JTextField();
        jTextFieldcliente = new javax.swing.JTextField();
        jTextFieldsituacao = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldlocacao = new javax.swing.JTextField();
        llocacao = new javax.swing.JLabel();
        lcliente = new javax.swing.JLabel();
        javax.swing.JLabel jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lnumero.setText("Número:");
        getContentPane().add(lnumero);
        lnumero.setBounds(40, 130, 300, 20);

        lorgao.setText("Órgão autuador:");
        getContentPane().add(lorgao);
        lorgao.setBounds(360, 130, 180, 20);

        ldata.setText("Data:");
        getContentPane().add(ldata);
        ldata.setBounds(570, 130, 190, 20);

        lcidade.setText("Cidade:");
        getContentPane().add(lcidade);
        lcidade.setBounds(420, 200, 180, 20);

        lestado.setText("Estado:");
        getContentPane().add(lestado);
        lestado.setBounds(630, 200, 130, 20);

        llocal.setText("Local da infração:");
        getContentPane().add(llocal);
        llocal.setBounds(40, 200, 360, 20);

        lvalor.setText("Valor:");
        getContentPane().add(lvalor);
        lvalor.setBounds(40, 270, 140, 20);

        ldescricao.setText("Descrição:");
        getContentPane().add(ldescricao);
        ldescricao.setBounds(200, 270, 550, 20);

        lsituacao.setText("Situação:");
        getContentPane().add(lsituacao);
        lsituacao.setBounds(420, 340, 150, 20);

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero);
        jTextFieldNumero.setBounds(40, 150, 300, 30);
        getContentPane().add(jTextFieldorgao);
        jTextFieldorgao.setBounds(360, 150, 180, 30);
        getContentPane().add(jTextFielddata);
        jTextFielddata.setBounds(570, 150, 190, 30);

        jTextFieldcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcidade);
        jTextFieldcidade.setBounds(420, 220, 190, 30);

        jTextFieldestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldestadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldestado);
        jTextFieldestado.setBounds(630, 220, 130, 30);
        getContentPane().add(jTextFieldLocal);
        jTextFieldLocal.setBounds(40, 220, 370, 30);

        jTextFieldvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldvalorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldvalor);
        jTextFieldvalor.setBounds(40, 290, 140, 30);

        jTextFielddescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddescricao);
        jTextFielddescricao.setBounds(200, 290, 560, 30);

        jTextFieldcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldclienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcliente);
        jTextFieldcliente.setBounds(240, 360, 160, 30);
        getContentPane().add(jTextFieldsituacao);
        jTextFieldsituacao.setBounds(420, 360, 150, 30);

        btnInserir.setBackground(new java.awt.Color(255, 0, 0));
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Adicionar");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir);
        btnInserir.setBounds(660, 440, 110, 40);

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(530, 440, 110, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem-Título-2.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 40, 150, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem-Título-3.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(320, 440, 140, 60);

        jTextFieldlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlocacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldlocacao);
        jTextFieldlocacao.setBounds(40, 360, 180, 30);

        llocacao.setText("Locação:");
        getContentPane().add(llocacao);
        llocacao.setBounds(40, 340, 180, 20);

        lcliente.setText("Cliente:");
        getContentPane().add(lcliente);
        lcliente.setBounds(240, 340, 160, 20);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo800500.png"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void  salvar() throws ParseException, ParseException, SQLException{
        try{
            Multa mul = new Multa();
            mul.setIdCli(Integer.parseInt(jTextFieldcliente.getText()));
            mul.setIdLoc(Integer.parseInt(jTextFieldlocacao.getText()));
            mul.setSitMul(jTextFieldsituacao.getText());
            mul.setNumMul(Long.parseLong(jTextFieldNumero.getText()));
            mul.setValMul(Double.parseDouble(jTextFieldvalor.getText()));
            mul.setLocMul(jTextFieldLocal.getText());
            mul.setCidMul(jTextFieldcidade.getText());
            mul.setEstMul(jTextFieldestado.getText());
            mul.setDescMult(jTextFielddescricao.getText());
            
            SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-DD");
            String data = jTextFielddata.getText();
            Date parseData =  formato.parse(data);
            mul.setDatMul((java.sql.Date) parseData);
            mul.setOrgMul(jTextFieldorgao.getText());

            MultaDAO dao = new MultaDAO();
            dao.novo(mul);
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!\n\n");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n\n" + e);
        }
    }
     boolean verificavazio(){
         return (!jTextFieldNumero.getText().equals("") || !jTextFieldorgao.getText().equals("")
                || !jTextFielddata.getText().equals("") || !jTextFieldestado.getText().equals("")
                || !jTextFieldLocal.getText().equals("") || !jTextFieldcidade.getText().equals("")
                || !jTextFieldvalor.getText().equals("") || !jTextFielddescricao.getText().equals("")
                || !jTextFieldcliente.getText().equals("") || !jTextFieldsituacao.getText().equals(""));
     }       
             
         
 
    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            TelaMultas tela = new TelaMultas();
            tela.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        if(!verificavazio()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos. ");
        }else{
               
                try {
                    salvar();
                    TelaMultas tela = new TelaMultas();
                    tela.setVisible(true);
                    dispose();
                    
                   
                   
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n\n" + ex);
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n\n" + ex);
                }
            }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void jTextFieldvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldvalorActionPerformed

    private void jTextFielddescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddescricaoActionPerformed

    private void jTextFieldcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcidadeActionPerformed

    private void jTextFieldlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlocacaoActionPerformed

    private void jTextFieldestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldestadoActionPerformed

    private void jTextFieldclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldclienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMultasInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMultasInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMultasInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMultasInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMultasInserir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldcliente;
    private javax.swing.JTextField jTextFielddata;
    private javax.swing.JTextField jTextFielddescricao;
    private javax.swing.JTextField jTextFieldestado;
    private javax.swing.JTextField jTextFieldlocacao;
    private javax.swing.JTextField jTextFieldorgao;
    private javax.swing.JTextField jTextFieldsituacao;
    private javax.swing.JTextField jTextFieldvalor;
    private javax.swing.JLabel lcidade;
    private javax.swing.JLabel lcliente;
    private javax.swing.JLabel ldata;
    private javax.swing.JLabel ldescricao;
    private javax.swing.JLabel lestado;
    private javax.swing.JLabel llocacao;
    private javax.swing.JLabel llocal;
    private javax.swing.JLabel lnumero;
    private javax.swing.JLabel lorgao;
    private javax.swing.JLabel lsituacao;
    private javax.swing.JLabel lvalor;
    // End of variables declaration//GEN-END:variables


    

}
