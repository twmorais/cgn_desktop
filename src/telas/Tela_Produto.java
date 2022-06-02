/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import Classes.Produto;
import DAO.ProdutoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author m10816361
 */
public class Tela_Produto extends javax.swing.JInternalFrame {

    ArrayList<Produto> produtos = new ArrayList();
    Double total = 0.00;

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    /**
     * Creates new form Tela_Produto
     */
    public Tela_Produto() {
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

        lbl_nome = new javax.swing.JLabel();
        lbl_nascimento = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        txt_preco_sugerido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_editar_Produto = new javax.swing.JTable();
        btn_buscar_pelo_nome = new javax.swing.JButton();
        txt_busca_por_tipo = new javax.swing.JTextField();
        lbl_buscar_pelo_nome = new javax.swing.JLabel();
        btn_limpar = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_materia_prima = new javax.swing.JTextField();
        txt_entrega = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mao_de_obra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Lucro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        lbl_endereco1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbl_nome.setText("Tipo:");

        lbl_nascimento.setText("Descrição:");

        lbl_endereco.setText("Data:");

        lbl_id.setText("Id:");

        txt_id.setVisible(true);
        txt_id.setEditable(false);

        txt_data.setEditable(false);

        txt_preco_sugerido.setEditable(false);

        txt_descricao.setColumns(20);
        txt_descricao.setRows(5);
        jScrollPane1.setViewportView(txt_descricao);

        table_editar_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Descrição", "Preço"
            }
        ));
        table_editar_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_editar_ProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_editar_Produto);

        btn_buscar_pelo_nome.setText("Buscar");
        btn_buscar_pelo_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_pelo_nomeActionPerformed(evt);
            }
        });

        lbl_buscar_pelo_nome.setText("Buscar  por tipo: ");

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Atualizar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tela de Edição dos Produtos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Preço sugerido:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Entrega:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Mão de Obra:");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Preço do Produto:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Lucro:");

        txt_preco_sugerido.setEditable(false);

        lbl_endereco1.setText("Preço, ex: 00.00");

        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Matéria Prima:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_materia_prima, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_mao_de_obra)
                                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_preco_sugerido)
                            .addComponent(txt_Lucro)
                            .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_id)
                                    .addComponent(lbl_endereco)
                                    .addComponent(lbl_nome))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_endereco1)
                                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_preco, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_buscar_pelo_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_busca_por_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar_pelo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_buscar_pelo_nome)
                    .addComponent(txt_busca_por_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_pelo_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_endereco)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nascimento)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_endereco1)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inserir)
                    .addComponent(btn_Editar)
                    .addComponent(btn_apagar)
                    .addComponent(btn_limpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_materia_prima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mao_de_obra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_preco_sugerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_calcular)
                    .addComponent(jLabel4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_editar_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_editar_ProdutoMouseClicked

        try {
            Integer indice = table_editar_Produto.getSelectedRow();
            String tipo = "" + table_editar_Produto.getValueAt(table_editar_Produto.getSelectedRow(), 1);
            Produto produto = new Produto();
            produto = produtos.get(indice);
            txt_id.setText(produto.getId().toString());
            txt_tipo.setText(produto.getTipo().toString());
            txt_data.setText(produto.getData_produto().toString());
            txt_preco.setText(produto.getPreco().toString());
            txt_descricao.setText(produto.getDescricao().toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, clique em uma linha válida.");
        }
    }//GEN-LAST:event_table_editar_ProdutoMouseClicked

    private void btn_buscar_pelo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_pelo_nomeActionPerformed

        String nome_produto = txt_busca_por_tipo.getText();
        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto();
        DefaultTableModel model = (DefaultTableModel) table_editar_Produto.getModel();
        model.setRowCount(0);

        if (txt_busca_por_tipo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um produto para realizar a busca.");
        } else {

            try {
                produtos = produtoDao.buscarProdutos(nome_produto);

                if (produtos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                    txt_busca_por_tipo.setText("");
                    limpar();
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
            }

            atualizar_tbl_produto();
        }

    }//GEN-LAST:event_btn_buscar_pelo_nomeActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        limpar();
        atualizar_tbl_produto();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed

        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto();
        boolean inserir;
        boolean validar;
        Integer resposta;
        pega_hora();
        produto.setTipo(txt_tipo.getText());
        produto.setDescricao(txt_descricao.getText());
        produto.setData_produto(txt_data.getText());

        validar = validar_inserir_atualizar();

        if (validar == true) {
            resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Inserir o Produto?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    produto.setPreco(Double.valueOf(txt_preco.getText()));
                    inserir = produtoDao.inserir(produto);
                    if (inserir == true) {
                        JOptionPane.showMessageDialog(null, "Produto Inserido com sucesso.");
                        txt_busca_por_tipo.setText(produto.getTipo());
                        limpar();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não Inserido, Favor preencha todos os campos.");
    }//GEN-LAST:event_btn_inserirActionPerformed
        atualizar_tbl_produto();
    }

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed

        Boolean apagado;
        Integer indice = table_editar_Produto.getSelectedRow();
        Produto produto = new Produto();

        if (indice > -1) {
            produto = produtos.get(indice);
            ProdutoDao produtoDao = new ProdutoDao();
            boolean apagar;
            Integer resposta;
            resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Apagar o Item Selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    apagar = produtoDao.Apagar(produto.getId());
                    if (apagar == true) {
                        JOptionPane.showInternalMessageDialog(null, "Dados apagados com sucesso?");
                    } else {
                        JOptionPane.showInternalMessageDialog(null, "Dados não podem ser apagados devido a possuir outras relações no banco de dados?");
                    }
                    txt_busca_por_tipo.setText(produto.getTipo());
                    atualizar_tbl_produto();
                    limpar();
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                }
            }
    }//GEN-LAST:event_btn_apagarActionPerformed
        else {
            JOptionPane.showInternalMessageDialog(null, "Favor clique no item da tabela que deseja excluir:");
        }
    }

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        pega_hora();

        try {
            ProdutoDao produtoDao = new ProdutoDao();
            Produto produto = new Produto();
            boolean atualizar = false;
            boolean validar;
            Integer resposta;

            produto.setId(Integer.valueOf(txt_id.getText()));
            produto.setTipo(txt_tipo.getText());
            produto.setDescricao(txt_descricao.getText());
            produto.setData_produto(txt_data.getText());
            produto.setPreco(Double.valueOf(txt_preco.getText()));

            validar = validar_inserir_atualizar();

            if (validar == true) {
                resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Atualizar o Produto?");
                if (resposta == JOptionPane.YES_OPTION) {
                    atualizar = produtoDao.Atualizar(produto);
                }
            }
            if (atualizar == true) {
                JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso...");
                txt_busca_por_tipo.setText(produto.getTipo());
                limpar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro, Confira os dados digitados:");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro, Confira o Banco de Dados:");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
        }
        atualizar_tbl_produto();
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void atualizar_tbl_produto() {

        String busca_produto = txt_busca_por_tipo.getText();
        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto();
        DefaultTableModel model = (DefaultTableModel) table_editar_Produto.getModel();
        model.setRowCount(0);

        if (txt_busca_por_tipo.getText().trim().equals("")) {
        } else {
            try {
                produtos = produtoDao.buscarProdutos(busca_produto);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
            }
            for (Produto c : produtos) {
                String tipo;
                String descricao;
                String preco;
                tipo = c.getTipo();
                descricao = c.getDescricao();
                preco = NumberFormat.getCurrencyInstance().format(c.getPreco());
                model.addRow(new Object[]{tipo, descricao, preco});
            }
        }
    }


    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

        Float materia_prima;
        Float mao_de_obra;
        Float entrega;
        Float lucro;
        Float total;

        try {

            materia_prima = Float.valueOf(txt_materia_prima.getText());
            mao_de_obra = Float.valueOf(txt_mao_de_obra.getText());
            entrega = Float.valueOf(txt_entrega.getText());
            lucro = Float.valueOf(txt_Lucro.getText());
            total = materia_prima + entrega + mao_de_obra + lucro;
            txt_preco_sugerido.setText(total.toString());
            txt_preco.setText(total.toString());

        } catch (NumberFormatException e) {
            JOptionPane.showInternalMessageDialog(null, "Erro, insira os valores corretos para calcular:");
        }

    }//GEN-LAST:event_btn_calcularActionPerformed

    boolean validar_inserir_atualizar() {

        if (txt_tipo.getText().trim().equals("") || txt_preco.getText().trim().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar_pelo_nome;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_buscar_pelo_nome;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_endereco1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nascimento;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JTable table_editar_Produto;
    private javax.swing.JTextField txt_Lucro;
    private javax.swing.JTextField txt_busca_por_tipo;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_entrega;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mao_de_obra;
    private javax.swing.JTextField txt_materia_prima;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_preco_sugerido;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables

    private void limpar() {

        DefaultTableModel model = (DefaultTableModel) table_editar_Produto.getModel();
        model.setRowCount(0);
        produtos.clear();
        txt_id.setText("");
        txt_tipo.setText("");
        txt_data.setText("");
        txt_preco_sugerido.setText("");
        txt_descricao.setText("");
        txt_materia_prima.setText("");
        txt_busca_por_tipo.setText("");
        txt_mao_de_obra.setText("");
        txt_entrega.setText("");
        txt_Lucro.setText("");
        txt_preco.setText("");
        atualizar_tbl_produto();
    }

    private void pega_hora() {
        Date data_atual = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        txt_data.setText(formatador.format(data_atual));
    }
}