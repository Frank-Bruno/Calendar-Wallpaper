/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.util.ArrayList;
import javax.swing.DefaultListModel;



/**
 *
 * @author joaod
 */
public class Dia_principal extends javax.swing.JFrame {

    dia_hoje dia_hoje = new dia_hoje();
    agenda agenda = new agenda();
    String texto;
    
    
    public Dia_principal() {
        
        initComponents();
        trocatexto();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D = new javax.swing.JLabel();
        colocartexto = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        mes = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();
        Atualizar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        tirar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        L = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        D.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("jLabel1");

        colocartexto.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        colocartexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        colocartexto.setText("Digite algo aqui");
        colocartexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocartextoActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        enter.setText("enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        mes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes.setText("jLabel1");

        ano.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ano.setText("jLabel2");

        Atualizar.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Atualizar.setText("Atualizar a lista");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        remover.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        remover.setText("Remover da lista");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        tirar.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jScrollPane2.setViewportView(L);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(431, 431, 431))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colocartexto, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(tirar))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addGap(398, 398, 398))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(60, 60, 60))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(270, 270, 270))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colocartexto)
                    .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tirar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colocartextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocartextoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_colocartextoActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // Botão de Adicionar a lista
        
        texto = colocartexto.getText();
        agenda.adicionar(texto);
        
       int i;
       int n = agenda.tamanho();
       DefaultListModel listModel = new DefaultListModel(); 
       for (i=0;i<n;i++) {
               listModel.addElement(i+" "+agenda.texto1(i));
            }
            L.setModel(listModel);
                                        
        
    }//GEN-LAST:event_enterActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // Botão de Atualizar a Lista
        int i;
        int n = agenda.tamanho();
       DefaultListModel listModel = new DefaultListModel(); 
       for (i=0;i<n;i++) {
               listModel.addElement(i+" "+agenda.texto1(i));
            }
            L.setModel(listModel);
    }//GEN-LAST:event_AtualizarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        //Botão de remover da lista
        int sonumero = Integer.parseInt(tirar.getText());
        agenda.remover(sonumero);
    
    }//GEN-LAST:event_removerActionPerformed

    private void tirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarActionPerformed
        // caixa para adiconar o numero
    }//GEN-LAST:event_tirarActionPerformed

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
            java.util.logging.Logger.getLogger(Dia_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dia_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dia_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dia_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dia_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JLabel D;
    private javax.swing.JList<String> L;
    private javax.swing.JLabel ano;
    private javax.swing.JTextField colocartexto;
    private javax.swing.JButton enter;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mes;
    private javax.swing.JButton remover;
    private javax.swing.JTextField tirar;
    // End of variables declaration//GEN-END:variables
       public void trocatexto(){
       
    
    
    //adicionando o texto nas variaveis
    D.setText("Dia "+dia_hoje.DiaFixo());
    mes.setText("Mês "+dia_hoje.MesFixo());
    ano.setText("Ano "+dia_hoje.AnoFixo());
    
       
       
       }
    
        
        

}