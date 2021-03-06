/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author gabri
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);

        atualizarTabela();
    }

    // relaciona o arraylist com o JTable
    private void atualizarTabela() {
        // pega o modelo da tabAlunos como sendo um modelo padrão de tabelas
        DefaultTableModel modelo = (DefaultTableModel) tabProdutos.getModel();

        // limpando a tabela
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // varrer a lista de alunos e colocar dentro do tabAlunos
        for (Produto p : listaProdutos) {
            modelo.addRow(new Object[]{p.getCodigo(), p.getDescricao(), p.getValor()});
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

        jPanel1 = new javax.swing.JPanel();
        jLabelManutencaoDeAlunos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVizualizar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonComprar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelManutencaoDeAlunos.setBackground(new java.awt.Color(0, 0, 0));
        jLabelManutencaoDeAlunos.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelManutencaoDeAlunos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelManutencaoDeAlunos.setText("MANUTEÇÃO DE PRODUTOS");

        tabProdutos.setBackground(new java.awt.Color(255, 255, 255));
        tabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "VALOR"
            }
        ));
        jScrollPane1.setViewportView(tabProdutos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButtonNovo.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNovo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonNovo.setText("Novo");
        jButtonNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNovoMouseClicked(evt);
            }
        });
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNovo);

        jButtonAlterar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAlterar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAlterar);

        jButtonExcluir.setBackground(new java.awt.Color(204, 204, 204));
        jButtonExcluir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir);

        jButtonVizualizar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVizualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVizualizar.setText("Vizualizar");
        jButtonVizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVizualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVizualizar);

        jButtonVender.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVender.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVender.setText("Comprar");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVender);

        jButtonComprar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonComprar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonComprar.setText("Vender");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonComprar);

        jButtonSair.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSair.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSair);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabelManutencaoDeAlunos)
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManutencaoDeAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
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

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        DialogDadosDoProduto tela = new DialogDadosDoProduto(this, true);

        tela.setVisible(true);
        if(tela.isConfirmou())
        {
            listaProdutos.add(tela.getProdutos());
        }



        atualizarTabela();

        tela.dispose();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        int linha = tabProdutos.getSelectedRow();

        if (linha != -1) {

            DialogDadosDoProduto tela = new DialogDadosDoProduto(this, true);

            tela.setProdutos(listaProdutos.get(linha));

            tela.setVisible(true);

            listaProdutos.set(linha, tela.getProdutos());

            atualizarTabela();
        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // pega a linha selecionada na tabela ou 
        // -1 se o usuário não tiver selecionado
        int linha = tabProdutos.getSelectedRow();

        // uma linha foi selecionada
        if (linha != -1) {
            // JOptionPane.showConfirmDialog(rootPane, linha, title, linha, HEIGHT)
            listaProdutos.remove(linha);

            atualizarTabela();
        } else {
            // se o usuário clicou no botão sem selecionar uma linha
            // apresentar uma mensagem           
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVizualizarActionPerformed
        // pega a linha selecionada na tabela ou 
        // -1 se o usuário não tiver selecionado
        int linha = tabProdutos.getSelectedRow();

        // uma linha foi selecionada
        if (linha != -1) {
            // criar o dialog dos dados do aluno
            DialogDadosDoProduto tela = new DialogDadosDoProduto(this, true);

            // pego o aluno que está na linha selecionada e envio para a tela
            // a tela será preenchida com os dados do aluno
            tela.setProdutos(listaProdutos.get(linha));
            tela.bloquearCampos();
            tela.setVisible(true);
        } else {
            // se o usuário clicou no botão sem selecionar uma linha
            // apresentar uma mensagem

            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_jButtonVizualizarActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        DialogVendaECompraDeprodutos tela = new DialogVendaECompraDeprodutos(this, true);

        tela.funcaoVender();

        tela.setVisible(true);

        listaProdutos.add(tela.getProdutos());

        atualizarTabela();

        tela.dispose();
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        DialogVendaECompraDeprodutos tela = new DialogVendaECompraDeprodutos(this, true);

        tela.funcaoComprar();

        tela.setVisible(true);

        listaProdutos.add(tela.getProdutos());

        atualizarTabela();

        tela.dispose();
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovoMouseClicked

    }//GEN-LAST:event_jButtonNovoMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JButton jButtonVizualizar;
    private javax.swing.JLabel jLabelManutencaoDeAlunos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabProdutos;
    // End of variables declaration//GEN-END:variables
}
