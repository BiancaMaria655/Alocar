/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ClienteDAO;

/**
 *
 * @author konno
 */
public class TelaCliente extends javax.swing.JFrame {

     String cod_cli;
    
   
    public TelaCliente() throws SQLException {
        initComponents();
        setLocationRelativeTo(this);
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabelaCli.getModel();
        tabelaCli.setRowSorter(new TableRowSorter(modelo));

        exibirDados();
    }

    
      public void exibirDados() throws SQLException {
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaCli.getModel();
        modelo.setNumRows(0);
        ClienteDAO cli = new ClienteDAO();

        for (Cliente p : cli.listar()) {

            modelo.addRow(new Object[]{
                p.getIdCli(),
                p.getNomeCli(),
                p.getCpfCli(),
                p.getNumeroCNHCli(),
                p.getValidadeCNHCli()
            });

        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNovo = new javax.swing.JButton();
        BtnPesquisar = new javax.swing.JButton();
        BtnExcluir1 = new javax.swing.JButton();
        BtnEditar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCli = new javax.swing.JTable();
        BtnVoltar2 = new javax.swing.JButton();
        pesquisarCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BtnNovo.setBackground(new java.awt.Color(255, 0, 0));
        BtnNovo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNovo);
        BtnNovo.setBounds(710, 410, 170, 40);

        BtnPesquisar.setBackground(new java.awt.Color(255, 0, 0));
        BtnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPesquisar);
        BtnPesquisar.setBounds(290, 50, 90, 30);

        BtnExcluir1.setBackground(new java.awt.Color(255, 0, 0));
        BtnExcluir1.setForeground(new java.awt.Color(255, 255, 255));
        BtnExcluir1.setText("Excluir");
        BtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExcluir1);
        BtnExcluir1.setBounds(310, 410, 170, 40);

        BtnEditar1.setBackground(new java.awt.Color(255, 0, 0));
        BtnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar1.setText("Editar");
        BtnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditar1);
        BtnEditar1.setBounds(510, 410, 170, 40);

        tabelaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "N?? da CNH", "Validade da CNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCli);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 910, 300);

        BtnVoltar2.setBackground(new java.awt.Color(255, 0, 0));
        BtnVoltar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnVoltar2.setText("Voltar");
        BtnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVoltar2);
        BtnVoltar2.setBounds(110, 410, 170, 40);

        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarCliente);
        pesquisarCliente.setBounds(50, 50, 230, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem-T??tulo-3.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 460, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem-T??tulo-2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 10, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo1000500.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 500);

        setSize(new java.awt.Dimension(1016, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        TelaClientesInserir tela = new TelaClientesInserir();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_BtnNovoActionPerformed
public void pesquisarCli(String chave) throws SQLException {
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaCli.getModel();
        modelo.setNumRows(0);
        ClienteDAO cli = new ClienteDAO();

        for (Cliente p : cli.pesquisar(chave)) {

            modelo.addRow(new Object[]{
                p.getIdCli(),
                p.getNomeCli(),
                p.getCpfCli(),
                p.getNumeroCNHCli(),
                p.getValidadeCNHCli()
            });

        }

    }
    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        try {
            pesquisarCli(pesquisarCliente.getText());
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluir1ActionPerformed
        if(tabelaCli.getSelectedRow() != -1){
            int resposta = JOptionPane.showConfirmDialog(null, "Esta opera????o ir?? remover valores na base de dados e n??o poder?? ser desfeita!\n\nDeseja continuar?", "Aviso", JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION){
                try{
                    Cliente cli = new Cliente();
                    cli.setIdCli((int)tabelaCli.getValueAt(tabelaCli.getSelectedRow(),0));
                    ClienteDAO dao = new ClienteDAO();
                    dao.excluir(cli);
                    exibirDados();
                    JOptionPane.showMessageDialog(null, "Dados removidos com sucesso");    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Erro ao remover dados\n\n" + e);
                }
            }
       }else{
            JOptionPane.showMessageDialog(null,"Selecione um cliente.");
        }
    }//GEN-LAST:event_BtnExcluir1ActionPerformed

    private void BtnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditar1ActionPerformed
         try {
             TelaClientesAlterar tela = new TelaClientesAlterar(cod_cli);
             tela.setVisible(true);
             dispose();
         } catch (SQLException ex) {
             Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_BtnEditar1ActionPerformed

    private void BtnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltar2ActionPerformed
       TelaAtendente tela = new TelaAtendente();
       tela.setVisible(true);
       dispose();
    }//GEN-LAST:event_BtnVoltar2ActionPerformed

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarClienteActionPerformed

    private void tabelaCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCliMouseClicked
        
         cod_cli = " "+ tabelaCli.getValueAt(tabelaCli.getSelectedRow(),0);  
    }//GEN-LAST:event_tabelaCliMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                try {
                    new TelaCliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar1;
    private javax.swing.JButton BtnExcluir1;
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnVoltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisarCliente;
    private javax.swing.JTable tabelaCli;
    // End of variables declaration//GEN-END:variables
}
