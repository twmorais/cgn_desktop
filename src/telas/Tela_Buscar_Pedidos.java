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
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_Buscar_Pedidos extends javax.swing.JInternalFrame {

    Cliente cliente = new Cliente();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ArrayList<Item_pedido> itens = new ArrayList<Item_pedido>();

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    public Tela_Buscar_Pedidos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Inserir_produto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_buscar_cliente = new javax.swing.JTable();
        txt_busca_cliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_produtos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_pedidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_inicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_fim = new javax.swing.JTextField();
        btn_busca_data = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setToolTipText("");
        setVisible(true);

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tela de Busca e visualização dos Pedidos:");

        btn_Inserir_produto.setText("Buscar Cliente");
        btn_Inserir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Inserir_produtoActionPerformed(evt);
            }
        });

        table_buscar_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ));
        table_buscar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_buscar_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_buscar_clienteMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(table_buscar_cliente);

        txt_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busca_clienteActionPerformed(evt);
            }
        });

        table_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Preço", "Quantidade", "Total"
            }
        ));
        table_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produtosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_produtosMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(table_produtos);

        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Data da Venda", "Total"
            }
        ));
        table_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_pedidosMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(table_pedidos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Produdos do Pedido:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cliente:");

        txt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inicioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Inicio: dd/MM/aaaa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fim: dd/MM/aaaa");

        txt_fim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fimActionPerformed(evt);
            }
        });

        btn_busca_data.setText("Buscar");
        btn_busca_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busca_dataActionPerformed(evt);
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_busca_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Inserir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_busca_data, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_busca_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Inserir_produto)
                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busca_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setBounds(0, 0, 644, 466);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed

        int resposta = JOptionPane.showConfirmDialog(null, "Certeza que deseja Limpar todas as Tabelas?");
        if (resposta == JOptionPane.YES_OPTION) {

            DefaultTableModel model = (DefaultTableModel) table_pedidos.getModel();
            model.setRowCount(0);
            DefaultTableModel mode1 = (DefaultTableModel) table_buscar_cliente.getModel();
            mode1.setRowCount(0);
            DefaultTableModel mode2 = (DefaultTableModel) table_produtos.getModel();
            mode2.setRowCount(0);
            txt_busca_cliente.setText("");

        }

    }//GEN-LAST:event_btn_limparActionPerformed

    private void table_buscar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_buscar_clienteMouseClicked

        DefaultTableModel mode2 = (DefaultTableModel) table_produtos.getModel();
        mode2.setRowCount(0);

        DefaultTableModel model = (DefaultTableModel) table_pedidos.getModel();
        model.setRowCount(0);

        ClienteDao clienteDao = new ClienteDao();
        PedidoDao pedidoDao = new PedidoDao();
        Cliente cliente = new Cliente();

        try {
            Integer indice = table_buscar_cliente.getSelectedRow();
            cliente = clientes.get(indice);
            pedidos = pedidoDao.buscarPedidos(cliente.getId());
            atualizar_tabela_pedidos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, clique em uma linha válida.");
        }


    }//GEN-LAST:event_table_buscar_clienteMouseClicked

    private void table_buscar_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_buscar_clienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_table_buscar_clienteMouseEntered

    private void btn_Inserir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Inserir_produtoActionPerformed

        String nome_cliente = txt_busca_cliente.getText();
        ClienteDao clienteDao = new ClienteDao();

        if (txt_busca_cliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um nome para realizar a busca.");
        } else {

            try {
                clientes = clienteDao.buscarClientes(nome_cliente);
                if (clientes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    txt_busca_cliente.setText("");
                    limpar();
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
            }

            atualizar_tabela_cliente();
        }
    }//GEN-LAST:event_btn_Inserir_produtoActionPerformed

    private void table_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produtosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_produtosMouseClicked

    private void table_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produtosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_table_produtosMouseEntered

    private void table_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pedidosMouseClicked

        ProdutoDao produtoDao = new ProdutoDao();
        Pedido pedido = new Pedido();
        Item_Pedido_Dao item_pedido_Dao = new Item_Pedido_Dao();

        try {
            Integer indice = table_pedidos.getSelectedRow();
            pedido = pedidos.get(indice);
            produtos = produtoDao.buscar_Produtos_pelo_id(pedido.getId());
            itens = item_pedido_Dao.buscarItens(pedido.getId());
            atualizar_tabela_itens_pedido();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, clique em uma linha válida.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_table_pedidosMouseClicked

    private void table_pedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pedidosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_table_pedidosMouseEntered

    private void txt_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busca_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busca_clienteActionPerformed

    private void txt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inicioActionPerformed

    private void txt_fimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fimActionPerformed

    private void btn_busca_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_dataActionPerformed

        DefaultTableModel mode2 = (DefaultTableModel) table_produtos.getModel();
        mode2.setRowCount(0);

        DefaultTableModel model = (DefaultTableModel) table_pedidos.getModel();
        model.setRowCount(0);

        ClienteDao clienteDao = new ClienteDao();
        PedidoDao pedidoDao = new PedidoDao();
        Cliente cliente = new Cliente();

        if (table_buscar_cliente.getSelectedRow() < 0 || txt_inicio.getText() == "" || txt_fim.getText() == "") {
            JOptionPane.showMessageDialog(null, "Por favor, verifique os dados digitados e tente novamente.");

        } else {
            try {
                String inicio = inicio_para_mysql();
                String fim = fim_para_mysql();
                Integer indice = table_buscar_cliente.getSelectedRow();
                cliente = clientes.get(indice);
                pedidos = pedidoDao.buscarPedidosTodosPorData(cliente.getId(), inicio, fim);
                atualizar_tabela_pedidos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, Verifique os dados e tente novamente.");
            }
        }
    }//GEN-LAST:event_btn_busca_dataActionPerformed

    private void limpar() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inserir_produto;
    private javax.swing.JButton btn_busca_data;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table_buscar_cliente;
    private javax.swing.JTable table_pedidos;
    private javax.swing.JTable table_produtos;
    private javax.swing.JTextField txt_busca_cliente;
    private javax.swing.JTextField txt_fim;
    private javax.swing.JTextField txt_inicio;
    // End of variables declaration//GEN-END:variables

    private void atualizar_tabela_cliente() {

        DefaultTableModel model = (DefaultTableModel) table_buscar_cliente.getModel();
        model.setRowCount(0);
        for (Cliente c : clientes) {
            String nome;
            String telefone;
            String email;
            nome = c.getNome();
            telefone = c.getTelefone();
            email = c.getEmail();
            model.addRow(new Object[]{nome, telefone, email});
        }
    }

    private void atualizar_tabela_pedidos() {

        DefaultTableModel model = (DefaultTableModel) table_pedidos.getModel();
        model.setRowCount(0);

        for (Pedido p : pedidos) {
            String tipo;
            String entrega;
            String total;
            tipo = p.getTipo();
            entrega = converte_data(p.getStr_data());
            total = NumberFormat.getCurrencyInstance().format(p.getTotal());
            model.addRow(new Object[]{tipo, entrega, total});
        }
    }

    private void atualizar_tabela_itens_pedido() {

        DefaultTableModel model = (DefaultTableModel) table_produtos.getModel();
        model.setRowCount(0);

        for (int i = 0; i < itens.size(); i++) {

            Produto p = new Produto();
            Item_pedido pq = new Item_pedido();
            p = produtos.get(i);
            String t = p.getTipo();
            String v = NumberFormat.getCurrencyInstance().format(p.getPreco());
            pq = itens.get(i);
            String q = String.valueOf(pq.getQuantidade());
            String tt = NumberFormat.getCurrencyInstance().format(pq.getTotal());
            model.addRow(new Object[]{t, v, q, tt});
        }
    }

    private String converte_data(String str_data) {

        String dia_inicio = str_data.substring(8);
        String mes_inicio = str_data.substring(5, 7);
        String ano_inicio = str_data.substring(0, 4);
        String entrega = dia_inicio + "/" + mes_inicio + "/" + ano_inicio;
        return entrega;
    }

    private String inicio_para_mysql() {

        String dia = txt_inicio.getText().substring(0, 2);
        String mes = txt_inicio.getText().substring(3, 5);
        String ano = txt_inicio.getText().substring(6);
        String data_para_mysql = ano + "-" + mes + "-" + dia;
        return data_para_mysql;
    }

    private String fim_para_mysql() {

        String dia = txt_fim.getText().substring(0, 2);
        String mes = txt_fim.getText().substring(3, 5);
        String ano = txt_fim.getText().substring(6);
        String data_para_mysql = ano + "-" + mes + "-" + dia;
        return data_para_mysql;
    }
}
