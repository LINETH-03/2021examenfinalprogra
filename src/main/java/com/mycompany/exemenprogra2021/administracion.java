/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemenprogra2021;
import arreglotab.arreglos;
import clase.tab;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author herna
 */
public class administracion extends javax.swing.JFrame {
    public static ordenes s = new ordenes();
    arreglos ctm = new arreglos();
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form administracion
     */
    public administracion() {
        initComponents();
        COMBOSUCURSALES.addItem("GUATEMALA");
        COMBOSUCURSALES.addItem("JALAPA");
        COMBOSUCURSALES.addItem("EL PROGRESO");
        String titulos[]= {"NOMBRE","DESCRIPCION","PRECIO"};
        model.setColumnIdentifiers(titulos);
        //model.addColumn("NOMBRE");
       // model.addColumn("DESCRIPCION");
        //model.addColumn("PRECIO");
        tabadmon.setModel(model);
    }
    
    public void limpiar(){
    TXTNAME.setText("");
    AREADESCRIP.setText("");
    TXTPRECIO.setText("");

}
    public void mostrartablaguatemala(){
        boolean verificar;
        String sucursal=COMBOSUCURSALES.getSelectedItem().toString();
    if(sucursal=="GUATEMALA"){
        String nombre = TXTNAME.getText();
        String descripcion = AREADESCRIP.getText();
        String precio =TXTPRECIO.getText();
        verificar= TXTNAME.getText().equals("")|| AREADESCRIP.getText().equals("")|| TXTPRECIO.getText().equals("");
        if(!verificar){
        tab a = new tab(nombre, descripcion, precio);
        ctm.adicionar(a);
        model.setRowCount(0);
        for(int i = 0; i <ctm.tamaño();i++){
            Object[] fila={
                ctm.obtener(i).getNombre(),
                ctm.obtener(i).getDescripcion(),
                ctm.obtener(i).getPrecio(),
                
                
            };
            model.addRow(fila);
            limpiar();
            JOptionPane.showMessageDialog(null, "Se agrego en la Sucursal GUATEMALA");
        
        }
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        
        }
    }
    }
    public void mostrartablajalapa(){
        boolean verificar;
        String sucursal=COMBOSUCURSALES.getSelectedItem().toString();
        
        String nombre = TXTNAME.getText();
        String descripcion = AREADESCRIP.getText();
        String precio =TXTPRECIO.getText();
        verificar= TXTNAME.getText().equals("")|| AREADESCRIP.getText().equals("")|| TXTPRECIO.getText().equals("");
        if(!verificar){
        tab b = new tab(nombre, descripcion, precio);
        ctm.addjal(b);
        model.setRowCount(0);
        for(int i = 0; i <ctm.tamañojal();i++){
            Object[] filajal={
                ctm.obtenerjal(i).getNombre(),
                ctm.obtenerjal(i).getDescripcion(),
                ctm.obtenerjal(i).getPrecio(),
                
                
            };
            
            model.addRow(filajal);
            limpiar();
            JOptionPane.showMessageDialog(null, "Se agrego en la Sucursal JALAPA");
        
        }
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        
        }
    }
    public void mostrartablaprogreso(){
        boolean verificar;
        String sucursal=COMBOSUCURSALES.getSelectedItem().toString();
        
        String nombre = TXTNAME.getText();
        String descripcion = AREADESCRIP.getText();
        String precio =TXTPRECIO.getText();
        verificar= TXTNAME.getText().equals("")|| AREADESCRIP.getText().equals("")|| TXTPRECIO.getText().equals("");
        if(!verificar){
        tab c = new tab(nombre, descripcion, precio);
        ctm.addpro(c);
        model.setRowCount(0);
        for(int i = 0; i <ctm.tamañopro();i++){
            Object[] filapro={
                
                ctm.obtenerpro(i).getNombre(),
                ctm.obtenerpro(i).getDescripcion(),
                ctm.obtenerpro(i).getPrecio(),
                
                
            };
           
            model.addRow(filapro);
            JOptionPane.showMessageDialog(null, "Se agrego en la Sucursal EL PROGRESO");
           
            
            limpiar();
        
        }
      
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    
    public void general(){
       
     String sucursal=COMBOSUCURSALES.getSelectedItem().toString();
      
        if(sucursal=="GUATEMALA"){
            mostrartablaguatemala();
             
        
        
        }else if(sucursal=="JALAPA"){
            mostrartablajalapa();
              
    }else if(sucursal=="EL PROGRESO"){
        mostrartablaprogreso();
         
    
    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        COMBOSUCURSALES = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXTPRECIO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AREADESCRIP = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabadmon = new javax.swing.JTable();
        ORDENAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("ADMINISTRACION ");

        jLabel2.setText("SUCURSAL:");

        jLabel3.setText("PIZZAS");

        jLabel4.setText("NOMBRE");

        jLabel5.setText("PRECIO Q. ");

        TXTPRECIO.setText(" ");
        TXTPRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPRECIOActionPerformed(evt);
            }
        });

        jLabel6.setText("DESCRIPCION");

        AREADESCRIP.setColumns(20);
        AREADESCRIP.setRows(5);
        jScrollPane1.setViewportView(AREADESCRIP);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabadmon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabadmon);

        ORDENAR.setText("ORDENAR");
        ORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(COMBOSUCURSALES, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ORDENAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(COMBOSUCURSALES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TXTPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(ORDENAR)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTPRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPRECIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPRECIOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        general();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        s.setVisible(true);
        
       
    }//GEN-LAST:event_ORDENARActionPerformed

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
            java.util.logging.Logger.getLogger(administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREADESCRIP;
    private javax.swing.JComboBox<String> COMBOSUCURSALES;
    private javax.swing.JButton ORDENAR;
    private javax.swing.JTextField TXTNAME;
    private javax.swing.JTextField TXTPRECIO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabadmon;
    // End of variables declaration//GEN-END:variables
}
