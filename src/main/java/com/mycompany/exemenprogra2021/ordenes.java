/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemenprogra2021;
import arreglotab.arreglos;
import clase.tab;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author herna
 */
public class ordenes extends javax.swing.JFrame {
   public static  administracion inicio = new administracion();
    arreglos ctm = new arreglos();

    /**
     * Creates new form ordenes
     */
    public ordenes() {
        initComponents();
       
        comordsucur.addItem("GUATEMALA");
        comordsucur.addItem("JALAPA");
        comordsucur.addItem("PROGRESO");
    }
    
    public String [] spacio(String spacio){
        String [] espacio = new String[1];
        espacio[0] = "";
        return espacio;
    }
    
    public String [] data(String data){
        String [] datosgua = new String[ctm.tamaño()];
        if(data.equals("GUATEMALA")){
            for (int i = 0; i < ctm.tamaño(); i++) {
                datosgua[i] = ctm.obtener(i).getNombre();
            }
        }
        return datosgua;
    }
    public String [] datajal(String data){
        String [] datosjal = new String[ctm.tamañojal()];
        if(data.equals("JALAPA")){
            for (int i = 0; i < ctm.tamañojal(); i++) {
                datosjal[i] = ctm.obtenerjal(i).getNombre();
            }
        }
        return datosjal;
    }
    public String [] datapro(String data){
        String [] datopro = new String[ctm.tamañopro()];
        if(data.equals("EL PROGRESO")){
            for (int i = 0; i < ctm.tamañopro(); i++) {
                datopro[i] = ctm.obtenerpro(i).getNombre();
            }
        }
        return datopro;
    }
    
 

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comordsucur = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comordpizzas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AREAORDENES = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        LBLPRECIO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("ORDENES");

        jLabel2.setText("sucursal");

        comordsucur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comordsucur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comordsucurItemStateChanged(evt);
            }
        });

        jLabel3.setText("pizzas:");

        comordpizzas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comordpizzas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comordpizzasItemStateChanged(evt);
            }
        });
        comordpizzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comordpizzasMouseClicked(evt);
            }
        });
        comordpizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comordpizzasActionPerformed(evt);
            }
        });

        AREAORDENES.setColumns(20);
        AREAORDENES.setRows(5);
        jScrollPane1.setViewportView(AREAORDENES);

        jLabel4.setText("DESCRIPCION:");

        jButton1.setBackground(new java.awt.Color(204, 51, 0));
        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setText("ORDENAR");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setText("PRECIO Q.");

        LBLPRECIO.setText("CANT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comordsucur, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addGap(60, 60, 60)
                                .addComponent(LBLPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comordpizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comordsucur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(comordpizzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LBLPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comordpizzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comordpizzasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comordpizzasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comordsucurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comordsucurItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            if(this.comordsucur.getSelectedIndex() == 0 ){
            
                this.comordpizzas.setModel(new DefaultComboBoxModel(this.spacio(this.comordsucur.getSelectedItem().toString())));
                AREAORDENES.setText("");
                LBLPRECIO.setText("--");    
            }else if(this.comordsucur.getSelectedIndex() == 1 ){
            
                this.comordpizzas.setModel(new DefaultComboBoxModel(this.data(this.comordsucur.getSelectedItem().toString())));
                AREAORDENES.setText("");
                LBLPRECIO.setText("--");    
            }else if(this.comordsucur.getSelectedIndex() == 2 ){
            
                this.comordpizzas.setModel(new DefaultComboBoxModel(this.datajal(this.comordsucur.getSelectedItem().toString())));
                AREAORDENES.setText("");
                LBLPRECIO.setText("--");    
            }else if(this.comordsucur.getSelectedIndex() == 3 ){
            
                this.comordpizzas.setModel(new DefaultComboBoxModel(this.datapro(this.comordsucur.getSelectedItem().toString())));
                AREAORDENES.setText("");
                LBLPRECIO.setText("--");    
            }
    }//GEN-LAST:event_comordsucurItemStateChanged
    }
    
    
    
    private void comordpizzasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comordpizzasItemStateChanged
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_comordpizzasItemStateChanged

    private void comordpizzasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comordpizzasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comordpizzasMouseClicked
    
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
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREAORDENES;
    private javax.swing.JLabel LBLPRECIO;
    private javax.swing.JComboBox<String> comordpizzas;
    private javax.swing.JComboBox<String> comordsucur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
