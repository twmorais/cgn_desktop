/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import Classes.Patrimonio;
import DAO.PatrimonioDao;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author m10816361
 */
public class Tela_Patrimonio extends javax.swing.JInternalFrame {

    ArrayList<Patrimonio> lista_patrimonio = new ArrayList();
    Patrimonio patrimonio = new Patrimonio();
    Double total = 00.00;

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
     * Creates new form T_editar_cliente
     */
    public Tela_Patrimonio() throws ClassNotFoundException {

        initComponents();
        buscarTodos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Tipo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_editar_patrimonio = new javax.swing.JTable();
        lbl_buscar_pelo_nome = new javax.swing.JLabel();
        txt_busca_por_tipo = new javax.swing.JTextField();
        btn_buscar_pelo_tipo = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_inserir = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        txt_valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_total_patrimonio = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        btn_buscar_todos = new javax.swing.JButton();
        lbl_buscar_pelo_nome1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btn_Editar.setText("Atualizar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        txt_Tipo.setColumns(20);
        txt_Tipo.setRows(5);
        jScrollPane1.setViewportView(txt_Tipo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tela de Edição do Patrimônio");

        lbl_nome.setText("Tipo:");

        lbl_endereco.setText("Valor:");

        table_editar_patrimonio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Aquisição", "Valor"
            }
        ));
        table_editar_patrimonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_editar_patrimonioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_editar_patrimonio);

        lbl_buscar_pelo_nome.setText("Buscar Patrimônio pelo tipo :");

        btn_buscar_pelo_tipo.setText("Filtrar");
        btn_buscar_pelo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_pelo_tipoActionPerformed(evt);
            }
        });

        lbl_id.setText("ID");

        txt_id.setEnabled(false);
        txt_id.setEditable(false);

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

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Valor total do Patrimônio da empresa:");

        btn_buscar_todos.setText("Buscar Todos");
        btn_buscar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_todosActionPerformed(evt);
            }
        });

        lbl_buscar_pelo_nome1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_buscar_pelo_nome1.setText("Usar ponto para os valores, ex: 45.00");

        jLabel3.setText("dd/mm/aaaa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_buscar_pelo_nome1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_endereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_total_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_buscar_pelo_nome)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txt_data, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_busca_por_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_buscar_pelo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_buscar_todos))))))
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_buscar_pelo_nome)
                    .addComponent(txt_busca_por_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_pelo_tipo)
                    .addComponent(btn_buscar_todos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_buscar_pelo_nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_nome)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_endereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Editar)
                            .addComponent(btn_inserir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_apagar)
                            .addComponent(btn_limpar))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        PatrimonioDao patrimonioDao = new PatrimonioDao();
        boolean atualizar;
        boolean validar;
        Integer resposta;

        validar = validar_atualizar();
        if (validar == true) {
            resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Atualizar o Item Selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    atualizar = patrimonioDao.Atualizar(patrimonio);
                    if (atualizar == true) {
                        JOptionPane.showMessageDialog(null, "Patrimonio Atualizado com sucesso.");
                        txt_busca_por_tipo.setText(patrimonio.getTipo());
                        atualizar_tbl_patrimonio();
                        limpar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro, Patrimonio não Atualizado.");
                    }
                    buscarTodos();
                } catch (SQLException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro SQL , favor contatar o Administrador do sistema:");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                }
            }
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_buscar_pelo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_pelo_tipoActionPerformed

        String tipo_patrimonio = txt_busca_por_tipo.getText();
        PatrimonioDao patrimonioDao = new PatrimonioDao();
        Patrimonio patrimonio = new Patrimonio();

        DefaultTableModel model = (DefaultTableModel) table_editar_patrimonio.getModel();
        model.setRowCount(0);

        if (txt_busca_por_tipo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um tipo de produto para realizar a busca.");
        } else {

            try {
                lista_patrimonio = patrimonioDao.buscarPatrimonio(tipo_patrimonio);

                if (lista_patrimonio.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Patrimônio não encontrado.");
                    txt_busca_por_tipo.setText("");
                    limpar();
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showInternalMessageDialog(null, "Erro método buscar pelo tipo, favor contatar o Administrador do sistema:");
            }
            atualizar_table_patrimonio();

        }
    }//GEN-LAST:event_btn_buscar_pelo_tipoActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed

        PatrimonioDao patrimonioDao = new PatrimonioDao();
        boolean inserir;
        boolean validar;
        Integer resposta;

        validar = validar_inserir();
        if (validar == true) {
            resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Inserir o Item Selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    inserir = patrimonioDao.inserir(patrimonio);
                    if (inserir == true) {
                        JOptionPane.showMessageDialog(null, "Patrimonio Inserido com sucesso.");
                        txt_busca_por_tipo.setText(patrimonio.getTipo());
                        atualizar_tbl_patrimonio();
                        limpar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro, Patrimonio não Inserido.");
                    }
                    buscarTodos();
                } catch (SQLException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro SQL btn_inserir, favor contatar o Administrador do sistema:");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                }
            }
        }
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed

        Integer indice = table_editar_patrimonio.getSelectedRow();
        Patrimonio patrimonio = new Patrimonio();
        if (indice > -1) {
            patrimonio = lista_patrimonio.get(indice);
            PatrimonioDao patrimonioDao = new PatrimonioDao();
            boolean apagar;
            Integer resposta;
            resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Apagar o Item Selecionado?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    apagar = patrimonioDao.Apagar(patrimonio.getId());
                    JOptionPane.showInternalMessageDialog(null, "Dados apagados com sucesso?");
                    txt_busca_por_tipo.setText(patrimonio.getTipo());
                    atualizar_tbl_patrimonio();
                    limpar();
                    // TODO add your handling code here:
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showInternalMessageDialog(null, "Erro, favor contatar o Administrador do sistema:");
                }
            }
        } else {
            JOptionPane.showInternalMessageDialog(null, "Favor clique no item da tabela que deseja excluir:");
        }
        try {
            buscarTodos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_Patrimonio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        limpar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparActionPerformed

    private void table_editar_patrimonioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_editar_patrimonioMouseClicked

        try {
            Integer indice = table_editar_patrimonio.getSelectedRow();
            String nome = "" + table_editar_patrimonio.getValueAt(table_editar_patrimonio.getSelectedRow(), 1);
            Patrimonio patrimonio = new Patrimonio();
            patrimonio = lista_patrimonio.get(indice);

            txt_id.setText(patrimonio.getId().toString());
            txt_Tipo.setText(patrimonio.getTipo().toString());
            txt_data.setText(patrimonio.getData_aquisicao().toString());
            txt_valor.setText(patrimonio.getValor().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, clique em uma linha válida.");
        }


    }//GEN-LAST:event_table_editar_patrimonioMouseClicked

    private void btn_buscar_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_todosActionPerformed
        try {
            buscarTodos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro, contate o Administrador do Sistema.");
        }
    }//GEN-LAST:event_btn_buscar_todosActionPerformed

    private void limpar() {

        txt_id.setText("");
        txt_data.setText("");
        txt_valor.setText("");
        txt_Tipo.setText("");
        txt_busca_por_tipo.setText("");
    }

    Boolean validar_inserir() {

        try {
            if (txt_Tipo.getText().trim().equals("") || txt_data.getText().trim().equals("") || txt_valor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Erro, confira os valores digitados.");
                return false;
            } else {
                patrimonio.setData_aquisicao(txt_data.getText());
                patrimonio.setTipo(txt_Tipo.getText());
                patrimonio.setValor(Float.valueOf(txt_valor.getText()));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, confira os valores digitados.");
        }
        return false;
    }

    Boolean validar_atualizar() {

        try {
            if (txt_Tipo.getText().trim().equals("") || txt_data.getText().trim().equals("") || txt_valor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Erro, confira os valores digitados.");
                return false;
            } else {
                patrimonio.setId(Integer.valueOf(txt_id.getText()));
                patrimonio.setData_aquisicao(txt_data.getText());
                patrimonio.setTipo(txt_Tipo.getText());
                patrimonio.setValor(Float.valueOf(txt_valor.getText()));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, confira os valores digitados.");
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar_pelo_tipo;
    private javax.swing.JButton btn_buscar_todos;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_buscar_pelo_nome;
    private javax.swing.JLabel lbl_buscar_pelo_nome1;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JTable table_editar_patrimonio;
    private javax.swing.JTextArea txt_Tipo;
    private javax.swing.JTextField txt_busca_por_tipo;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_total_patrimonio;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    private void buscarTodos() throws ClassNotFoundException {

        PatrimonioDao patrimonioDao = new PatrimonioDao();
        try {
            lista_patrimonio = patrimonioDao.buscarTodos();
            atualizar_table_patrimonio();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro método buscar patrimônio todos, favor acionar o Administrador do Sistema.");
        }

    }

    private void atualizar_tbl_patrimonio() {

        String busca_patrimonio = txt_busca_por_tipo.getText();
        PatrimonioDao patrimonioDao = new PatrimonioDao();
        Patrimonio patrimonio = new Patrimonio();
        DefaultTableModel model = (DefaultTableModel) table_editar_patrimonio.getModel();
        model.setRowCount(0);

        if (txt_busca_por_tipo.getText().trim().equals("")) {
        } else {
            try {
                lista_patrimonio = patrimonioDao.buscarPatrimonio(busca_patrimonio);
                atualizar_table_patrimonio();
            } catch (ClassNotFoundException ex) {
                JOptionPane.showInternalMessageDialog(null, "Erro atualizar tabela patrimônio, favor contatar o Administrador do sistema:");
            }

        }
    }

    private void atualizar_table_patrimonio() {

        DefaultTableModel model = (DefaultTableModel) table_editar_patrimonio.getModel();
        model.setRowCount(0);
        total = 0.0;

        for (Patrimonio p : lista_patrimonio) {
            String tipo;
            String aquisicao;
            String valor;
            tipo = p.getTipo();
            aquisicao = p.getData_aquisicao();
            valor = NumberFormat.getCurrencyInstance().format(p.getValor());
            model.addRow(new Object[]{tipo, aquisicao, valor});
            total = total + p.getValor();
        }
        txt_total_patrimonio.setText(NumberFormat.getCurrencyInstance().format(total));
    }
}
