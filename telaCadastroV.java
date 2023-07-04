package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus Duarte
 */
public class telaCadastroV extends javax.swing.JFrame {
    
    private Carro c = new Carro();
    private BancoDadosCarro bdc = new BancoDadosCarro();

    private static telaCadastroV telaCadastroVeiculo;
    
    public telaCadastroV() {
        initComponents();
    }
    
     public static telaCadastroV gettelaCadastroV(){
        
        if(telaCadastroVeiculo == null){
            
            telaCadastroVeiculo = new telaCadastroV();
            
        }
        
        return telaCadastroVeiculo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnCad = new javax.swing.JButton();
        btnCons = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnAlt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVeiculo = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("CADASTRAR VEICULO");

        lblPlaca.setText("Placa");

        lblMarca.setText("Marca");

        lblAno.setText("Ano");

        lblCor.setText("Cor");

        lblModelo.setText("Modelo");

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnCons.setText("Consultar");
        btnCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAlt.setText("Alterar");
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });

        tabVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Ano", "Cor", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabVeiculo);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLimpar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCons)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRemove)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAlt))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblModelo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtModelo)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPlaca)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblMarca)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblAno)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(55, 55, 55))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPlaca)
                        .addComponent(lblMarca)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAno)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCad)
                    .addComponent(btnCons)
                    .addComponent(btnRemove)
                    .addComponent(btnAlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        try {
            cadCarroPlaca();
        } catch (PlacaFormatException ex) {
            Logger.getLogger(telaCadastroV.class.getName()).log(Level.SEVERE, null, ex);
        }
        listTabCarro();
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsActionPerformed
         try {
            consCarroPlaca();
        } catch (PlacaFormatException ex) {
            Logger.getLogger(telaCadastroV.class.getName()).log(Level.SEVERE, null, ex);
        }
        listTabCarro();
    }//GEN-LAST:event_btnConsActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            excCarroPlaca();
        } catch (PlacaFormatException ex) {
            Logger.getLogger(telaCadastroV.class.getName()).log(Level.SEVERE, null, ex);
        }
        listTabCarro();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed
        try {
            altCarroPlaca();
        } catch (PlacaFormatException ex) {
            Logger.getLogger(telaCadastroV.class.getName()).log(Level.SEVERE, null, ex);
        }
        listTabCarro();
    }//GEN-LAST:event_btnAltActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabVeiculoMouseClicked
       selectTab();
    }//GEN-LAST:event_tabVeiculoMouseClicked

    public void cadCarroPlaca()throws PlacaFormatException{
        c = new Carro();
        try{
            c.setCarroPlaca(txtPlaca.getText());
            c.setCarroMarca(txtMarca.getText());
            c.setCarroAno(Integer.parseInt(txtAno.getText()));
            c.setCarroCor(txtCor.getText());
            c.setCarroModelo(txtModelo.getText());

            c = BancoDadosCarro.getCarroList().cadCarroPlaca(c);

            if(c != null){
                JOptionPane.showMessageDialog(null,"Carro cadastrado com sucesso", "Cadastro do Carro", JOptionPane.PLAIN_MESSAGE);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Ja existe um carro com esta placa", "Cadastro do Carro", JOptionPane.ERROR_MESSAGE);
            }            
        }
        catch(PlacaFormatException pfe){
            JOptionPane.showMessageDialog(null,"Placa informada não condiz com a formatação", "Erro de Preenchimento", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public void consCarroPlaca()throws PlacaFormatException{
        c = new Carro();
        c.setCarroPlaca(txtPlaca.getText());
          
        
         c = BancoDadosCarro.getCarroList().consCarroPlaca(c);
         
            if(c != null){
               txtAno.setText(Integer.toString(c.getCarroAno()));  
               txtMarca.setText(c.getCarroMarca());        
               txtCor.setText(c.getCarroCor());
               txtModelo.setText(c.getCarroModelo());

                JOptionPane.showMessageDialog(
                        null,
                        "Verifique os dados",
                        "Consulta Carro pelo numero da Placa",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
            else{
                       JOptionPane.showMessageDialog(
                        null,
                        "Não existe Carro com este numero de Placa",
                        "Consulta Carro pelo numero da Placa",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        
       
    }
     
    public void excCarroPlaca() throws PlacaFormatException{
        c = new Carro();
        c.setCarroPlaca(txtPlaca.getText());
        
        c = BancoDadosCarro.getCarroList().removeCarroPlaca(c);
        
        if(c == null){
            JOptionPane.showMessageDialog(null,"Verifique os Dados", "Atualização pela placa do carro", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ja existe um carro com esta placa", "Atualização da placa do carro", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }
    public void altCarroPlaca() throws PlacaFormatException{
        c = new Carro();
        c.setCarroPlaca(txtPlaca.getText());
        
        c = BancoDadosCarro.getCarroList().atualizaCarroPlaca(c);
        if(c != null){
            
            txtAno.setText(Integer.toString(c.getCarroAno()));  
            txtMarca.setText(c.getCarroMarca());        
            txtCor.setText(c.getCarroCor());
            txtModelo.setText(c.getCarroModelo());
            
            JOptionPane.showMessageDialog(null,"Verifique os dados","Atualização do Carro pela Placa",JOptionPane.PLAIN_MESSAGE);
             limpar();
        }
        else{
                   JOptionPane.showMessageDialog(null,"Não existe Carro com esta Placa","Alteração do Carro pela Placa",JOptionPane.ERROR_MESSAGE
            );
        }
    
    }
    public void listTabCarro(){
        DefaultTableModel modelo = (DefaultTableModel)tabVeiculo.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Carro c : BancoDadosCarro.getCarroList().getListaCarro()){
            modelo.insertRow(posLin, new Object[]{c.getCarroPlaca(),c.getCarroMarca(),c.getCarroAno(),c.getCarroCor(),c.getCarroModelo()});
            posLin++;
        }
    }
    
    public void selectTab(){
        String valLin = "";
        int posLin = tabVeiculo.getSelectedRow();
        
        for(int coluna = 0; coluna < tabVeiculo.getColumnCount(); coluna++){
            valLin += tabVeiculo.getModel().getValueAt(posLin,coluna).toString();
            
            if(coluna + 1 < tabVeiculo.getColumnCount()){
                valLin += " - ";
            }
        }
        JOptionPane.showMessageDialog(
               null,
               "O carro selecionado foi: \n"+valLin,
               "Resultado da seleção",
               JOptionPane.INFORMATION_MESSAGE
       );
    }
    
    
    public void limpar(){
        txtPlaca.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtCor.setText("");
        txtModelo.setText("");
        
        txtPlaca.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(telaCadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnCons;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tabVeiculo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
