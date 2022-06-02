/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Produto;

/**
 *
 * @author gabri
 */
public class DialogVendaECompraDeprodutos extends javax.swing.JDialog {

    /**
     * Creates new form DialogVendaECompraDeprodutos
     */
    public DialogVendaECompraDeprodutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(this);
    }

    public void setProdutos(Produto p) {

        jTextCodigo.setText(String.valueOf(p.getCodigo()));
        jTextDescricao.setText(p.getDescricao());
        jTextEstoque.setText(String.valueOf(p.getQntEstoque()));
        jTextQuantidade.setText(String.valueOf(p.getQntEstoque()));

    }

    public Produto getProdutos() {

        Produto p = new Produto();

        p.setCodigo(Integer.parseInt(jTextCodigo.getText()));
        p.setDescricao(jTextDescricao.getText());
        p.setQntEstoque(Integer.parseInt(jTextEstoque.getText()));
        p.setValor(Double.parseDouble(jTextQuantidade.getText()));

        return p;
    }

    public void bloquearCampos() {
        jTextCodigo.setEditable(false);
        jTextDescricao.setEditable(false);
        jTextEstoque.setEditable(false);
        jTextQuantidade.setEditable(false);
    }

    public void funcaoComprar() {
        this.jLabelCompraDeProdutos.setVisible(false);
    }

    public void funcaoVender() {
        this.jLabelVendaDeProdutos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCompraDeProdutos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonConfirmar1 = new javax.swing.JButton();
        jTextDescricao = new javax.swing.JTextField();
        jTextEstoque = new javax.swing.JTextField();
        jTextQuantidade = new javax.swing.JTextField();
        jTextCodigo = new javax.swing.JTextField();
        jLabelVendaDeProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCompraDeProdutos.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelCompraDeProdutos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCompraDeProdutos.setText("COMPRA DE PRODUTOS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade vendida");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estoque");

        jButtonConfirmar1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonConfirmar1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonConfirmar1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar1.setText("Confirmar");
        jButtonConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar1ActionPerformed(evt);
            }
        });

        jTextDescricao.setBackground(new java.awt.Color(204, 204, 204));
        jTextDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoActionPerformed(evt);
            }
        });

        jTextEstoque.setBackground(new java.awt.Color(204, 204, 204));
        jTextEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextEstoque.setForeground(new java.awt.Color(0, 0, 0));
        jTextEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEstoqueActionPerformed(evt);
            }
        });

        jTextQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        jTextQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuantidadeActionPerformed(evt);
            }
        });

        jTextCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jTextCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jLabelVendaDeProdutos.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelVendaDeProdutos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelVendaDeProdutos.setText("VENDA DE PRODUTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jTextEstoque))
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmar1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCompraDeProdutos)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelVendaDeProdutos)
                        .addGap(146, 146, 146))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCompraDeProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVendaDeProdutos)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButtonConfirmar1)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConfirmar1ActionPerformed

    private void jTextDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescricaoActionPerformed

    private void jTextEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEstoqueActionPerformed

    private void jTextQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuantidadeActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(DialogVendaECompraDeprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogVendaECompraDeprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogVendaECompraDeprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogVendaECompraDeprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVendaECompraDeprodutos dialog = new DialogVendaECompraDeprodutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonConfirmar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCompraDeProdutos;
    private javax.swing.JLabel jLabelVendaDeProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextEstoque;
    private javax.swing.JTextField jTextQuantidade;
    // End of variables declaration//GEN-END:variables

}