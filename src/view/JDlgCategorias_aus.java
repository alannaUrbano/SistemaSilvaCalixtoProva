/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;
import javax.swing.JOptionPane;

public class JDlgCategorias_aus extends javax.swing.JDialog {

    public JDlgCategorias_aus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Categorias");
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtSetor_aus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtAtivos_aus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtEfeitos_aus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtTratamentos_aus = new javax.swing.JTextField();
        jCboFaixaetaria_aus = new javax.swing.JComboBox<>();
        jBtnIncluir_aus = new javax.swing.JButton();
        jBtnAlterar_aus = new javax.swing.JButton();
        jBtnExcluir_aus = new javax.swing.JButton();
        jBtnConfirmar_aus = new javax.swing.JButton();
        jBtnCancelar_aus = new javax.swing.JButton();
        jBtnPesquisar_aus = new javax.swing.JButton();
        jTxtCodigo_aus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtFatorFps_aus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtPrecaucoes_aus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Faixa etaria");

        jLabel1.setText("Setor");

        jTxtSetor_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSetor_ausActionPerformed(evt);
            }
        });

        jLabel2.setText("Ativos");

        jLabel5.setText("Efeitos");

        jLabel3.setText("Tratamentos");

        jCboFaixaetaria_aus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Adolescente", "Adulto", "Idoso" }));

        jBtnIncluir_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir_aus.setText("Incluir");
        jBtnIncluir_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_ausActionPerformed(evt);
            }
        });

        jBtnAlterar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        jBtnAlterar_aus.setText("Alterar");
        jBtnAlterar_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_ausActionPerformed(evt);
            }
        });

        jBtnExcluir_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluir_aus.setText("Excluir");
        jBtnExcluir_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_ausActionPerformed(evt);
            }
        });

        jBtnConfirmar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnConfirmar_aus.setText("Confirmar");
        jBtnConfirmar_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmar_ausActionPerformed(evt);
            }
        });

        jBtnCancelar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit_1.png"))); // NOI18N
        jBtnCancelar_aus.setText("Cancelar");
        jBtnCancelar_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_ausActionPerformed(evt);
            }
        });

        jBtnPesquisar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar_1.png"))); // NOI18N
        jBtnPesquisar_aus.setText("Pesquisar");
        jBtnPesquisar_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_ausActionPerformed(evt);
            }
        });

        jTxtCodigo_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigo_ausActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Categoria");

        jLabel7.setText("Fator fps");

        jLabel8.setText("Precauções");

        jTxtPrecaucoes_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecaucoes_ausActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtSetor_aus, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jTxtCodigo_aus)
                    .addComponent(jTxtEfeitos_aus)
                    .addComponent(jTxtFatorFps_aus))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jTxtAtivos_aus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCboFaixaetaria_aus, 0, 219, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtPrecaucoes_aus)
                                    .addComponent(jTxtTratamentos_aus)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnIncluir_aus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlterar_aus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir_aus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnConfirmar_aus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCancelar_aus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnPesquisar_aus)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCboFaixaetaria_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodigo_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtAtivos_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtSetor_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtTratamentos_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5)
                    .addComponent(jTxtEfeitos_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFatorFps_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTxtPrecaucoes_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_aus)
                    .addComponent(jBtnAlterar_aus)
                    .addComponent(jBtnExcluir_aus)
                    .addComponent(jBtnConfirmar_aus)
                    .addComponent(jBtnCancelar_aus)
                    .addComponent(jBtnPesquisar_aus))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluir_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_ausActionPerformed
    }//GEN-LAST:event_jBtnIncluir_ausActionPerformed

    private void jTxtSetor_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSetor_ausActionPerformed
    }//GEN-LAST:event_jTxtSetor_ausActionPerformed

    private void jBtnExcluir_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_ausActionPerformed

        
        int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "deletar registro", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão Realizada.");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão Cancelada");
        }
    }//GEN-LAST:event_jBtnExcluir_ausActionPerformed

    private void jBtnConfirmar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_ausActionPerformed
       
    }//GEN-LAST:event_jBtnConfirmar_ausActionPerformed

    private void jBtnCancelar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_ausActionPerformed
    }//GEN-LAST:event_jBtnCancelar_ausActionPerformed

    private void jBtnPesquisar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_ausActionPerformed
                                              
        JDlgPesquisarCategorias_aus dlgPesquisarCategorias_aus = new JDlgPesquisarCategorias_aus(null, true);
        dlgPesquisarCategorias_aus.setVisible(true);
        
    }//GEN-LAST:event_jBtnPesquisar_ausActionPerformed

    private void jBtnAlterar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_ausActionPerformed
    }//GEN-LAST:event_jBtnAlterar_ausActionPerformed

    private void jTxtCodigo_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_ausActionPerformed

    private void jTxtPrecaucoes_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecaucoes_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecaucoes_ausActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCategorias_aus dialog = new JDlgCategorias_aus(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jBtnAlterar_aus;
    private javax.swing.JButton jBtnCancelar_aus;
    private javax.swing.JButton jBtnConfirmar_aus;
    private javax.swing.JButton jBtnExcluir_aus;
    private javax.swing.JButton jBtnIncluir_aus;
    private javax.swing.JButton jBtnPesquisar_aus;
    private javax.swing.JComboBox<String> jCboFaixaetaria_aus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtAtivos_aus;
    private javax.swing.JTextField jTxtCodigo_aus;
    private javax.swing.JTextField jTxtEfeitos_aus;
    private javax.swing.JTextField jTxtFatorFps_aus;
    private javax.swing.JTextField jTxtPrecaucoes_aus;
    private javax.swing.JTextField jTxtSetor_aus;
    private javax.swing.JTextField jTxtTratamentos_aus;
    // End of variables declaration//GEN-END:variables
}
