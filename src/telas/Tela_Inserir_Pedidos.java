/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import CLASSES.Cliente;
import Classes.Item_pedido;
import Classes.Pedido;
import Classes.Produto;
import DAO.ClienteDao;
import DAO.Item_Pedido_Dao;
import DAO.PedidoDao;
import DAO.ProdutoDao;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_Inserir_Pedidos extends javax.swing.JInternalFrame {

    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Produto> produtos = new ArrayList();
    ArrayList<Produto> produtos_pedido = new ArrayList();
    ArrayList<Item_pedido> items = new ArrayList();
    Double total = 0.0;
    String tipo;
    String valor;
    String quantidade;
    String total_unitario;

    String dia_pedido;
    String mes_pedido;
    String ano_pedido;
    String dia_entrega;
    String mes_entrega;
    String ano_entrega;
    String data_para_pedido_mysql;
    String data_para_entrega_mysql;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    public Tela_Inserir_Pedidos() {

        initComponents();
        atualizar_pagina();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_total = new javax.swing.JTextField();
        btn_Apagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        btn_inserir = new javax.swing.JButton();
        btn_Inserir_produto = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        cbx_cliente = new javax.swing.JComboBox<>();
        cbx_produto = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_inserir_produtos = new javax.swing.JTable();
        txt_tipo = new javax.swing.JTextField();
        lbl_nascimento1 = new javax.swing.JLabel();
        lbl_nascimento3 = new javax.swing.JLabel();
        txt_data_entrega = new javax.swing.JTextField();
        txt_quantidade = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setResizable(true);

        txt_total.setEditable(false);

        btn_Apagar.setText("Apagar Produto Selecionado");
        btn_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tela de Inserção dos Pedidos");

        lbl_nome.setText("Cliente:");

        lbl_endereco.setText("Data da Venda:");

        lbl_telefone.setText("Total:");

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_Inserir_produto.setText("Inserir Produto");
        btn_Inserir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Inserir_produtoActionPerformed(evt);
            }
        });

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        cbx_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_clienteActionPerformed(evt);
            }
        });

        cbx_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_produtoActionPerformed(evt);
            }
        });

        table_inserir_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Quantidade", "Total"
            }
        ));
        table_inserir_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_inserir_produtosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_inserir_produtosMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(table_inserir_produtos);

        lbl_nascimento1.setText("Descrição:");

        lbl_nascimento3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nascimento3.setText("dd/mm/aaaa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_nascimento1)
                            .addComponent(lbl_endereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nascimento3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_data_entrega)
                                .addComponent(txt_tipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbx_cliente, javax.swing.GroupLayout.Alignment.TRAILING, 0, 162, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_inserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbx_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Inserir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Inserir_produto)
                            .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nascimento1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_endereco)
                            .addComponent(txt_data_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_nascimento3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_telefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_inserir)
                            .addComponent(btn_novo)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Apagar)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarActionPerformed

        Integer indice = table_inserir_produtos.getSelectedRow();
        Produto produto = new Produto();
        Item_pedido i = new Item_pedido();
        try {
            produto = produtos_pedido.get(indice);
            i = items.get(indice);

            produtos_pedido.remove(produto);
            items.remove(i);

            calculaTotal();
            atualizar_Tabela_Produto();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showInternalMessageDialog(null, "Erro, favor selecionar o produto a ser excluido:");
        }
    }//GEN-LAST:event_btn_ApagarActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed

        Pedido pedido = new Pedido();
        Pedido pedido_banco = new Pedido();
        Cliente cliente = new Cliente();
        Item_pedido itemPedido = new Item_pedido();
        PedidoDao pedidoDao = new PedidoDao();
        Item_Pedido_Dao item_pedido_dao = new Item_Pedido_Dao();

        Boolean inserir_itens_pedido;
        Boolean inserir_pedido;
        Boolean buscar_pedido;

        if (cbx_cliente.getSelectedIndex() < 0 || txt_tipo.getText().trim().equals("")
                || txt_total.getText().trim().equals("") || txt_data_entrega.getText().trim().equals("")|| produtos_pedido.size()<1) {
            JOptionPane.showInternalMessageDialog(null, "Erro, Insira todos os dados:");
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Inserir o novo Pedido?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    Integer indice = cbx_cliente.getSelectedIndex() - 1;
                    cliente = clientes.get(indice);
                    String entrega_mysql = datas_para_mysql();

                    pedido.setStr_data(entrega_mysql);
                    pedido.setId_cliente(cliente.getId());
                    pedido.setTipo(txt_tipo.getText());
                    pedido.setTotal(Double.valueOf(total));

                    inserir_pedido = pedidoDao.inserir(pedido);
                    
                    if (inserir_pedido == true) {
                        pedido_banco = pedidoDao.buscar_id_pedido(pedido.getId_cliente(), pedido.getStr_data(), pedido.getTotal());

                        for (int i = 0; i < produtos_pedido.size(); i++) {

                            Produto p = new Produto();
                            Item_pedido pq = new Item_pedido();

                            p = produtos_pedido.get(i);
                            pq = items.get(i);

                            itemPedido.setId_pedido(pedido_banco.getId());
                            itemPedido.setId_produto(p.getId());
                            itemPedido.setQuantidade(pq.getQuantidade());
                            itemPedido.setTotal(pq.getTotal());

                            inserir_itens_pedido = item_pedido_dao.inserir(itemPedido);
                        }

                        JOptionPane.showInternalMessageDialog(null, "Pedido inserido com sucesso:");
                        limpar();
    }//GEN-LAST:event_btn_inserirActionPerformed
                    else {
                        JOptionPane.showInternalMessageDialog(null, "Pedido não inserido, Favor verifique os dados e tente novamente:");
                    }
                } catch (IndexOutOfBoundsException e) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, Favor Inserir os dados corretamente:");
                } catch (SQLException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, Favor verificar a conexão com o banco de dados:");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, Favor contatar o Administrador do Sistema:");
                }
            }
        }
    }

    private void btn_Inserir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Inserir_produtoActionPerformed

        Integer indice;
        Double preço_produtos = 0.0;
        Produto produto = new Produto();
        Item_pedido item = new Item_pedido();

        try {
            indice = cbx_produto.getSelectedIndex() - 1;
            produto = produtos.get(indice);
            item.setQuantidade(Integer.valueOf(txt_quantidade.getText()));
            preço_produtos = item.getQuantidade() * produto.getPreco();
            item.setTotal(preço_produtos);
            items.add(item);
            produtos_pedido.add(produto);
            calculaTotal();
            atualizar_Tabela_Produto();

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showInternalMessageDialog(null, "Erro, favor selecionar o produto desejado. ");
        } catch (NumberFormatException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro, digitar a quantidade correta. ");
        }
    }//GEN-LAST:event_btn_Inserir_produtoActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

        int resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Apagar os Dados Digitados?");
        if (resposta == JOptionPane.YES_OPTION) {
            limpar();
        }
    }//GEN-LAST:event_btn_novoActionPerformed

    private void cbx_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_clienteActionPerformed


    }//GEN-LAST:event_cbx_clienteActionPerformed

    private void cbx_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_produtoActionPerformed

    private void table_inserir_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_inserir_produtosMouseClicked


    }//GEN-LAST:event_table_inserir_produtosMouseClicked

    private void table_inserir_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_inserir_produtosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_table_inserir_produtosMouseEntered

    private void limpar() {

        cbx_cliente.setSelectedIndex(0);
        cbx_produto.setSelectedIndex(0);
        txt_total.setText("");
        txt_data_entrega.setText("");
        txt_tipo.setText("");
        txt_quantidade.setText("");
        produtos_pedido.clear();
        items.clear();
        total = 0.0;
        atualizar_Tabela_Produto();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Apagar;
    private javax.swing.JButton btn_Inserir_produto;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JComboBox<String> cbx_cliente;
    private javax.swing.JComboBox<String> cbx_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_nascimento1;
    private javax.swing.JLabel lbl_nascimento3;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JTable table_inserir_produtos;
    private javax.swing.JTextField txt_data_entrega;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void atualizar_Tabela_Produto() {

        DefaultTableModel model = (DefaultTableModel) table_inserir_produtos.getModel();
        model.setRowCount(0);

        for (int i = 0; i < produtos_pedido.size(); i++) {

            Produto p = new Produto();
            Item_pedido pq = new Item_pedido();
            p = produtos_pedido.get(i);
            String t = p.getTipo();
            String v = NumberFormat.getCurrencyInstance().format(p.getPreco());
            pq = items.get(i);
            String q = String.valueOf(pq.getQuantidade());
            String tt = NumberFormat.getCurrencyInstance().format(pq.getTotal());
            model.addRow(new Object[]{t, v, q, tt});
        }

    }

    private void calculaTotal() {
        total = 0.0;
        for (Item_pedido p : items) {
            total = total + p.getTotal();
        }
        txt_total.setText(NumberFormat.getCurrencyInstance().format(total));
    }

    private String datas_para_mysql() {

        String dia = txt_data_entrega.getText().substring(0, 2);
        String mes = txt_data_entrega.getText().substring(3, 5);
        String ano = txt_data_entrega.getText().substring(6);
        String data_para_mysql = ano + "-" + mes + "-" + dia;
        return data_para_mysql;
    }

    private void atualizar_pagina() {
        
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        ClienteDao clienteDao = new ClienteDao();
        ProdutoDao produtoDao = new ProdutoDao();

        cbx_cliente.addItem("Selecione");
        cbx_produto.addItem("Selecione");
        try {
            clientes = clienteDao.buscarClientes("");
            produtos = produtoDao.buscarProdutos("");
            for (Cliente c : clientes) {
                cbx_cliente.addItem(c.getNome().toString());
            }
            for (Produto p : produtos) {
                cbx_produto.addItem(p.getTipo().toString());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_Inserir_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
}
