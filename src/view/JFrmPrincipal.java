/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

public class JFrmPrincipal extends javax.swing.JFrame {

    public JFrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema Sense");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuUsuario = new javax.swing.JMenuItem();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jMnuCategorias = new javax.swing.JMenuItem();
        jMnuAvaliacao = new javax.swing.JMenuItem();
        jMnuFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuCompra = new javax.swing.JMenuItem();
        jMnuCompraPro = new javax.swing.JMenuItem();
        jMnuVendaPro = new javax.swing.JMenuItem();
        jMnuVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMnuCadastros.setMnemonic('c');
        jMnuCadastros.setText("Cadastros");

        jMnuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jMnuUsuario.setText("Usuario");
        jMnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuarioActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuario);

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuClientes);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar_1.png"))); // NOI18N
        jMnuProdutos.setText("Produtos");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProdutos);

        jMnuCategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        jMnuCategorias.setText("Categorias");
        jMnuCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCategoriasActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuCategorias);

        jMnuAvaliacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuAvaliacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jMnuAvaliacao.setText("Avaliação");
        jMnuAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuAvaliacaoActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuAvaliacao);

        jMnuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/grupo.png"))); // NOI18N
        jMnuFornecedor.setText("Fornecedor");
        jMnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuFornecedor);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMenu2.setMnemonic('m');
        jMenu2.setText("Movimento");

        jMnuCompra.setText("Compra");
        jMnuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCompraActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompra);

        jMnuCompraPro.setText("Compra Produto");
        jMnuCompraPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCompraProActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompraPro);

        jMnuVendaPro.setText("Venda Produto");
        jMnuVendaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendaProActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuVendaPro);

        jMnuVenda.setText("Venda");
        jMnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuVenda);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        JDlgClientes_aus jDlgClientes = new JDlgClientes_aus(null, true);
        jDlgClientes.setVisible(true);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCategoriasActionPerformed
        JDlgCategorias_aus jDlgCategorias = new JDlgCategorias_aus(null, true);
        jDlgCategorias.setVisible(true);
    }//GEN-LAST:event_jMnuCategoriasActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed
        JDlgProdutos_aus jDlgProdutos = new JDlgProdutos_aus(null, true);
        jDlgProdutos.setVisible(true);
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuAvaliacaoActionPerformed
        // TODO add your handling code here:
        JDlgMecc_Avaliacao jDlgAvaliacaoa = new JDlgMecc_Avaliacao(null, true);
        jDlgAvaliacaoa.setVisible(true);
    }//GEN-LAST:event_jMnuAvaliacaoActionPerformed

    private void jMnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorActionPerformed
        // TODO add your handling code here:
        JDlgMecc_Fornecedor jDlgFornecedor = new JDlgMecc_Fornecedor(null, true);
        jDlgFornecedor.setVisible(true);
    }//GEN-LAST:event_jMnuFornecedorActionPerformed

    private void jMnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuarioActionPerformed
        // TODO add your handling code here:
        JDlgMecc_Usuarios jDlgUsuarios = new JDlgMecc_Usuarios(null, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuarioActionPerformed

    private void jMnuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCompraActionPerformed
        // TODO add your handling code here:
        JDlgMecc_Compra jDlgMecc_Compra = new JDlgMecc_Compra(null, true);
        jDlgMecc_Compra.setVisible(true);
    }//GEN-LAST:event_jMnuCompraActionPerformed

    private void jMnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendaActionPerformed
        // TODO add your handling code here:
           JDlgVendas_aus jDlgVendaProduto =  new JDlgVendas_aus(null, true);
        jDlgVendaProduto.setVisible(true);
    }//GEN-LAST:event_jMnuVendaActionPerformed

    private void jMnuCompraProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCompraProActionPerformed
        // TODO add your handling code here:
         JDlgMecc_compra_produto jDlgMecc_compraProduto =  new JDlgMecc_compra_produto(null, true);
       jDlgMecc_compraProduto.setVisible(true);
    }//GEN-LAST:event_jMnuCompraProActionPerformed

    private void jMnuVendaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendaProActionPerformed
        // TODO add your handling code here:
        JDlgVenda_produto_aus jDlgVendaProduto =  new JDlgVenda_produto_aus(null, true);
        jDlgVendaProduto.setVisible(true);
    }//GEN-LAST:event_jMnuVendaProActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuAvaliacao;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuCategorias;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuCompra;
    private javax.swing.JMenuItem jMnuCompraPro;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuario;
    private javax.swing.JMenuItem jMnuVenda;
    private javax.swing.JMenuItem jMnuVendaPro;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
