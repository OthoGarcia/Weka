/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ogarcia
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro2
     */
    public Cadastro() {
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

        jLabel1 = new javax.swing.JLabel();
        CbPeriodo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CbIdade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CbLocal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CbTrabalha = new javax.swing.JComboBox<>();
        CbCasado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbFilhos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CbOrigem = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CbIngresso = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CbCota = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CbLocomocao = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CbTempo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CbDependencia = new javax.swing.JComboBox<>();
        CbPerdeu = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CbAfinidade = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Périodo");

        CbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1oP", "2oP", "3oP", "4oP", "5oP", "6oP", "7oP", "8oP" }));
        CbPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbPeriodoActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade");

        CbIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17-20", "21-29", "29-30", "MaisDe30" }));
        CbIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbIdadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo");

        CbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel4.setText("Mora em Itaperuna");

        CbLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        CbLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbLocalActionPerformed(evt);
            }
        });

        jLabel5.setText("Trabalha?");

        CbTrabalha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        CbCasado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        CbCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCasadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Casado?");

        jLabel7.setText("Filhos");

        CbFilhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "zero", "um", "dois", "tres", "MaiDe3" }));
        CbFilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbFilhosActionPerformed(evt);
            }
        });

        jLabel8.setText("Origem");

        CbOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Estadual", "Federal" }));
        CbOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbOrigemActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingresso");

        CbIngresso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENEM", "Vestibular", "Transferencia" }));
        CbIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbIngressoActionPerformed(evt);
            }
        });

        jLabel10.setText("Cota");

        CbCota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        CbCota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCotaActionPerformed(evt);
            }
        });

        jLabel11.setText("Locomoção");

        CbLocomocao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Outros", "Onibus" }));

        jLabel12.setText("Tempo para chegar");

        CbTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30m", "1h-2h", "30min-1h", "Sup2h" }));

        jLabel13.setText("Dependencia");

        CbDependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1a2", "3a5", "Maisde5" }));

        CbPerdeu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1a2", "3a5", "Maisde5" }));

        jLabel14.setText("Perdeu");

        jLabel15.setText("Afinidade");

        CbAfinidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administracao", "AnalProjetoSistemas", "DesenvdeSistemas", "InfraRedes", "Matematica" }));
        CbAfinidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAfinidadeActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbCasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbTrabalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbCota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbPerdeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbAfinidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbLocomocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CbTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CbTrabalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbPerdeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbCasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(CbAfinidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CbFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(CbIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CbCota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CbLocomocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbIdadeActionPerformed

    private void CbLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbLocalActionPerformed

    private void CbCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbCasadoActionPerformed

    private void CbFilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbFilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbFilhosActionPerformed

    private void CbOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbOrigemActionPerformed

    private void CbIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbIngressoActionPerformed

    private void CbCotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbCotaActionPerformed

    private void CbAfinidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAfinidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbAfinidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calculo c = new Calculo(CbPeriodo.getSelectedItem().toString(),
                CbIdade.getSelectedItem().toString(),
                CbSexo.getSelectedItem().toString(),
                CbLocal.getSelectedItem().toString(),
                CbTrabalha.getSelectedItem().toString(),
                CbCasado.getSelectedItem().toString(),
                CbFilhos.getSelectedItem().toString(),
                CbOrigem.getSelectedItem().toString(),
                CbIngresso.getSelectedItem().toString(),
                CbCota.getSelectedItem().toString(),
                CbLocomocao.getSelectedItem().toString(),
                CbTempo.getSelectedItem().toString(),
                CbDependencia.getSelectedItem().toString(),
                CbPerdeu.getSelectedItem().toString(),
                CbAfinidade.getSelectedItem().toString()                
        );
        try {
            c.importarArquivo();
        } catch (Exception ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CbPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbPeriodoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbAfinidade;
    private javax.swing.JComboBox<String> CbCasado;
    private javax.swing.JComboBox<String> CbCota;
    private javax.swing.JComboBox<String> CbDependencia;
    private javax.swing.JComboBox<String> CbFilhos;
    private javax.swing.JComboBox<String> CbIdade;
    private javax.swing.JComboBox<String> CbIngresso;
    private javax.swing.JComboBox<String> CbLocal;
    private javax.swing.JComboBox<String> CbLocomocao;
    private javax.swing.JComboBox<String> CbOrigem;
    private javax.swing.JComboBox<String> CbPerdeu;
    private javax.swing.JComboBox<String> CbPeriodo;
    private javax.swing.JComboBox<String> CbSexo;
    private javax.swing.JComboBox<String> CbTempo;
    private javax.swing.JComboBox<String> CbTrabalha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}