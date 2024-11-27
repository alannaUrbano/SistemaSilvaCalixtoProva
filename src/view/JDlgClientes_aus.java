/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Tools.Util;
import javax.swing.JOptionPane;

public class JDlgClientes_aus extends javax.swing.JDialog {

    public JDlgClientes_aus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtNome_aus = new javax.swing.JTextField();
        jTxtIdade_aus = new javax.swing.JTextField();
        jTxtCpf_aus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtCep_aus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtEmail_aus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtTelefone_aus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtRua_aus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtNumero_aus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtBairro_aus = new javax.swing.JTextField();
        jTxtSobrenome_aus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtNomeSocial_aus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtDataNascimento_aus = new javax.swing.JTextField();
        jTxtRg_aus = new javax.swing.JTextField();
        jBtnIncluir_aus = new javax.swing.JButton();
        jBtnAlterar_aus = new javax.swing.JButton();
        jBtnExcluir_aus = new javax.swing.JButton();
        jBtnConfirmar_aus = new javax.swing.JButton();
        jBtnCancelar_aus = new javax.swing.JButton();
        jBtnPesquisar_aus = new javax.swing.JButton();
        jTxtTipoPele_aus = new javax.swing.JTextField();
        jTxtCodigo_aus = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtAlergias_aus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Nome");

        jLabel3.setText("CPF");

        jLabel6.setText("Idade");

        jTxtNome_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNome_ausActionPerformed(evt);
            }
        });

        jLabel2.setText("CEP");

        jTxtCep_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCep_ausActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jTxtEmail_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmail_ausActionPerformed(evt);
            }
        });

        jLabel13.setText("Telefone");

        jLabel14.setText("Tipo pele");

        jLabel11.setText("Rua");

        jTxtRua_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRua_ausActionPerformed(evt);
            }
        });

        jLabel9.setText("Numero");

        jLabel1.setText("Bairro");

        jLabel12.setText("Sobrenome");

        jTxtBairro_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairro_ausActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome social");

        jLabel4.setText("Data nascimento");

        jLabel10.setText("RG");

        jBtnIncluir_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_1.png"))); // NOI18N
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

        jBtnExcluir_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir_aus.setText("Excluir ");
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

        jBtnCancelar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jBtnCancelar_aus.setText("Cancelar");
        jBtnCancelar_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_ausActionPerformed(evt);
            }
        });

        jBtnPesquisar_aus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
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

        jLabel15.setText("Codigo de Clientes");

        jTxtAlergias_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAlergias_ausActionPerformed(evt);
            }
        });

        jLabel16.setText("Alergias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNome_aus, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(jTxtCodigo_aus, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addContainerGap(510, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtSobrenome_aus)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBtnIncluir_aus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnAlterar_aus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir_aus))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmail_aus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNomeSocial_aus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtRg_aus)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCpf_aus)
                            .addComponent(jTxtDataNascimento_aus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtIdade_aus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConfirmar_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnCancelar_aus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar_aus)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtBairro_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14)
                                        .addComponent(jTxtTipoPele_aus)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jTxtCep_aus)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(5, 5, 5)
                                                    .addComponent(jLabel11))
                                                .addComponent(jLabel9)
                                                .addComponent(jTxtNumero_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jTxtAlergias_aus)
                                        .addComponent(jTxtRua_aus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(139, 139, 139))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jTxtTelefone_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTipoPele_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtAlergias_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodigo_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSobrenome_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(jTxtCpf_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtRg_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jTxtDataNascimento_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNomeSocial_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtIdade_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(jTxtEmail_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTelefone_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtCep_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNumero_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtRua_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtBairro_aus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_aus)
                    .addComponent(jBtnAlterar_aus)
                    .addComponent(jBtnExcluir_aus)
                    .addComponent(jBtnConfirmar_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar_aus)
                    .addComponent(jBtnPesquisar_aus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNome_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNome_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNome_ausActionPerformed

    private void jTxtCep_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCep_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCep_ausActionPerformed

    private void jTxtEmail_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmail_ausActionPerformed
        // TODO add your handling code jBtnIncluir  }//GEN-LAST:event_jTxtEmail_ausActionPerformed
      }
    private void jBtnIncluir_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_ausActionPerformed
        Util.habilitar(true, jBtnConfirmar_aus, jBtnCancelar_aus,jTxtCodigo_aus, jTxtNome_aus, jTxtAlergias_aus, jTxtBairro_aus, jTxtCep_aus, jTxtCpf_aus, jTxtDataNascimento_aus, jTxtEmail_aus, jTxtIdade_aus, jTxtNomeSocial_aus, jTxtNumero_aus, jTxtRg_aus,jTxtRua_aus, jTxtSobrenome_aus, jTxtTelefone_aus, jTxtTipoPele_aus);
        Util.habilitar(false, jBtnIncluir_aus, jBtnAlterar_aus, jBtnExcluir_aus, jBtnPesquisar_aus);
        Util.limpar(jTxtCodigo_aus, jTxtNome_aus, jTxtAlergias_aus, jTxtBairro_aus, jTxtCep_aus, jTxtCpf_aus, jTxtDataNascimento_aus, jTxtEmail_aus, jTxtIdade_aus, jTxtNomeSocial_aus, jTxtNumero_aus, jTxtRg_aus,jTxtRua_aus, jTxtSobrenome_aus, jTxtTelefone_aus, jTxtTipoPele_aus);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluir_ausActionPerformed

    private void jBtnPesquisar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_ausActionPerformed

        JDlgPesquisarClientes_aus jDlgPesquisarClientes_aus = new JDlgPesquisarClientes_aus(null, true);
        jDlgPesquisarClientes_aus.setVisible(true);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBtnPesquisar_ausActionPerformed

    private void jBtnAlterar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_ausActionPerformed
       Util.habilitar(false, jBtnIncluir_aus, jBtnAlterar_aus, jBtnExcluir_aus, jBtnPesquisar_aus);
        Util.habilitar(true, jBtnCancelar_aus, jBtnConfirmar_aus, jTxtCodigo_aus, jTxtCodigo_aus, jTxtNome_aus, jTxtAlergias_aus, jTxtBairro_aus, jTxtCep_aus, jTxtCpf_aus, jTxtDataNascimento_aus, jTxtEmail_aus, jTxtIdade_aus, jTxtNomeSocial_aus, jTxtNumero_aus, jTxtRg_aus,jTxtRua_aus, jTxtSobrenome_aus, jTxtTelefone_aus, jTxtTipoPele_aus);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterar_ausActionPerformed

    private void jBtnExcluir_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_ausActionPerformed
        // TODO add your handling code here:
       
        int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "deletar registro", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão Realizada.");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão Cancelada");
        }
    }//GEN-LAST:event_jBtnExcluir_ausActionPerformed

    private void jBtnConfirmar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_ausActionPerformed
        Util.habilitar(true, jBtnIncluir_aus, jBtnAlterar_aus, jBtnExcluir_aus, jBtnPesquisar_aus);
        Util.habilitar(false, jBtnCancelar_aus, jBtnConfirmar_aus, jTxtCodigo_aus, jTxtCodigo_aus, jTxtNome_aus, jTxtAlergias_aus, jTxtBairro_aus, jTxtCep_aus, jTxtCpf_aus, jTxtDataNascimento_aus, jTxtEmail_aus, jTxtIdade_aus, jTxtNomeSocial_aus, jTxtNumero_aus, jTxtRg_aus,jTxtRua_aus, jTxtSobrenome_aus, jTxtTelefone_aus, jTxtTipoPele_aus);        
// TODO add your handling code here:
        
    }//GEN-LAST:event_jBtnConfirmar_ausActionPerformed

    private void jBtnCancelar_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_ausActionPerformed
      Util.habilitar(true, jBtnIncluir_aus, jBtnAlterar_aus, jBtnExcluir_aus, jBtnPesquisar_aus);
      Util.habilitar(false, jBtnCancelar_aus, jBtnConfirmar_aus, jTxtCodigo_aus, jTxtCodigo_aus, jTxtNome_aus, jTxtAlergias_aus, jTxtBairro_aus, jTxtCep_aus, jTxtCpf_aus, jTxtDataNascimento_aus, jTxtEmail_aus, jTxtIdade_aus, jTxtNomeSocial_aus, jTxtNumero_aus, jTxtRg_aus,jTxtRua_aus, jTxtSobrenome_aus, jTxtTelefone_aus, jTxtTipoPele_aus);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelar_ausActionPerformed

    private void jTxtBairro_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairro_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairro_ausActionPerformed

    private void jTxtRua_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRua_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRua_ausActionPerformed

    private void jTxtCodigo_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_ausActionPerformed

    private void jTxtAlergias_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAlergias_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAlergias_ausActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgClientes_aus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_aus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_aus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgClientes_aus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientes_aus dialog = new JDlgClientes_aus(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar_aus;
    private javax.swing.JButton jBtnCancelar_aus;
    private javax.swing.JButton jBtnConfirmar_aus;
    private javax.swing.JButton jBtnExcluir_aus;
    private javax.swing.JButton jBtnIncluir_aus;
    private javax.swing.JButton jBtnPesquisar_aus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtAlergias_aus;
    private javax.swing.JTextField jTxtBairro_aus;
    private javax.swing.JTextField jTxtCep_aus;
    private javax.swing.JTextField jTxtCodigo_aus;
    private javax.swing.JTextField jTxtCpf_aus;
    private javax.swing.JTextField jTxtDataNascimento_aus;
    private javax.swing.JTextField jTxtEmail_aus;
    private javax.swing.JTextField jTxtIdade_aus;
    private javax.swing.JTextField jTxtNomeSocial_aus;
    private javax.swing.JTextField jTxtNome_aus;
    private javax.swing.JTextField jTxtNumero_aus;
    private javax.swing.JTextField jTxtRg_aus;
    private javax.swing.JTextField jTxtRua_aus;
    private javax.swing.JTextField jTxtSobrenome_aus;
    private javax.swing.JTextField jTxtTelefone_aus;
    private javax.swing.JTextField jTxtTipoPele_aus;
    // End of variables declaration//GEN-END:variables
}
