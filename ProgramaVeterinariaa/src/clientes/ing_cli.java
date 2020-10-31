/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author Franck
 
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ing_cli extends javax.swing.JFrame {
    
  conectar con = new conectar();
  Connection cn = con.conexion();
        
        
   DefaultTableModel model ;
    public ing_cli() {
        initComponents();
        limpiar ();
        bloquear();
        cargar();
    }
    void cargar (){
    String [] titulos = {"cod_cli","nom_cli","direc_cli","tel_cli","nomMascota","Observaciones"};// PARA LOS TITULOS TABLA
    String [] registros = new String [6];//VECTOR PARA CAMBIAR LOS REGISTROS
    
    String sql = "SELECT * FROM clientes";
    
    
    model = new DefaultTableModel (null,titulos); // AGREGAR LOS TITULOS
   conectar cc = new conectar ();// EN CC SE ALMACENA LA CONEXION
   Connection cn = cc.conexion();
   
   
  // Statement st;
       try {
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           //st = cn.createStatement();
           
           while (rs.next()){  
           registros [0] = rs.getString("cod_cli");
           registros [1] = rs.getString("nom_cli");
           registros [2] = rs.getString("direc_cli");
           registros [3] = rs.getString("tel_cli");
           registros [4] = rs.getString("nomMascota");
           registros [5] = rs.getString("Observaciones");// nombre de las tablas en la bd
           
           model.addRow(registros);
           }
           t_datos.setModel(model);
           
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
       }
   
    }

    void limpiar (){
    //cod_cli.setText("");
    nom_cli.setText("");
    direc_cli.setText("");
    cel_cli.setText("");
    nom_mascota.setText("");
    observaciones.setText("");  /// para limpiar las cajas
    buscar.setText("");
    
    
    
                
    }
    void bloquear (){
     //cod_cli.setEnabled(false);
    nom_cli.setEnabled(false);
    direc_cli.setEnabled(false);
    cel_cli.setEnabled(false);
    nom_mascota.setEnabled(false);
    observaciones.setEnabled(false);  /// para bloquear las cajas
   btn_nuevo.setEnabled(true);
   btn_guardar.setEnabled(false);
   btn_cancelar.setEnabled(false);
       
    }
    void des_bloquear (){
     //cod_cli.setEnabled(true);
    nom_cli.setEnabled(true);
    direc_cli.setEnabled(true);
    cel_cli.setEnabled(true);
    nom_mascota.setEnabled(true);
    observaciones.setEnabled(true);  /// para desbloquear las cajas
   btn_nuevo.setEnabled(false);
   btn_guardar.setEnabled(true);
   btn_cancelar.setEnabled(true);
      
  //  }
  //  public void eliminarDatos(){
   // try {
  //  int  filaSelecionada = t_datos.getSelectedRow();
  //  String Sql= "DELETE FROM usuarios WHERE Id =" + t_datos.getValueAt(filaSelecionada,0);
   //  Statement st = cc.createStatement();
     
    
  //  }
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nom_cli = new javax.swing.JTextField();
        direc_cli = new javax.swing.JTextField();
        cel_cli = new javax.swing.JTextField();
        nom_mascota = new javax.swing.JTextField();
        observaciones = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Cel");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setText("Nombre Mascota");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("Observaciones");

        nom_cli.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        nom_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_cliActionPerformed(evt);
            }
        });

        direc_cli.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        direc_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direc_cliActionPerformed(evt);
            }
        });

        cel_cli.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        cel_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel_cliActionPerformed(evt);
            }
        });
        cel_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cel_cliKeyTyped(evt);
            }
        });

        nom_mascota.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        nom_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_mascotaActionPerformed(evt);
            }
        });

        observaciones.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });

        btn_nuevo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_37110.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_stop_exit_1583.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signout_106525.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        t_datos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(t_datos);

        btn_actualizar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cloudrefresh_icon-icons.com_54403 (1).png"))); // NOI18N
        btn_actualizar.setText("Modificar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486564399-close_81512.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("VETERINARIA");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5d5cda59ca315dea67786b086b3eceb1.png"))); // NOI18N

        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/system_software_update_22485.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(488, 488, 488)
                                        .addComponent(btn_eliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btn_nuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(direc_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                                    .addComponent(cel_cli, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nom_mascota, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(observaciones)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(689, 689, 689)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(183, 183, 183))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(direc_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nom_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_cliActionPerformed
        // TODO add your handling code here:
nom_cli.transferFocus();
    }//GEN-LAST:event_nom_cliActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        
            des_bloquear ();
             nom_cli.requestFocus();
             
            


        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       
        bloquear();
        
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void direc_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direc_cliActionPerformed
direc_cli.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_direc_cliActionPerformed

    private void cel_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel_cliActionPerformed
        // TODO add your handling code here:
        cel_cli.transferFocus();
        
    }//GEN-LAST:event_cel_cliActionPerformed

    private void nom_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_mascotaActionPerformed
        // TODO add your handling code here:
        nom_mascota.transferFocus();
        
        
    }//GEN-LAST:event_nom_mascotaActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        // TODO add your handling code here:
        observaciones.transferFocus();//para pasar de una caja a otra 
    }//GEN-LAST:event_observacionesActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
conectar cc = new conectar ();
           Connection cn = cc.conexion();
            String nom,direc,cel,nomMascota,ob;
            String sql = "";
            nom = nom_cli.getText();
            direc = direc_cli.getText();
            cel = cel_cli.getText();
            nomMascota = nom_mascota.getText();
            ob = observaciones.getText();
            sql = "INSERT INTO clientes (nom_cli, direc_cli, tel_cli,nomMascota, Observaciones)VALUES (?,?,?,?,?)";
            try {
            
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString (1,nom);
                pst.setString (2,direc);
                pst.setString (3,cel);
                pst.setString (4,nomMascota);
                pst.setString (5,ob);
                int n =pst.executeUpdate();
                if (n>0){
                JOptionPane.showMessageDialog(null, "Registro Guardado con exito");
                bloquear();
                cargar();
                
                }
        } catch (SQLException ex) {
            Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
        }



      
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        des_bloquear ();
        
        int fila = t_datos.getSelectedRow();
        if (fila >0){
    buscar.setText(t_datos.getValueAt(fila,0).toString());
    nom_cli.setText(t_datos.getValueAt(fila,1).toString());
    direc_cli.setText(t_datos.getValueAt(fila,2).toString());
    cel_cli.setText(t_datos.getValueAt(fila,3).toString());
    nom_mascota.setText(t_datos.getValueAt(fila,4).toString());
    observaciones.setText(t_datos.getValueAt(fila,5).toString());
}
else {
JOptionPane.showMessageDialog(null, "Fila no selecionada");

}

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        // Connection cn = cc.conexion();
     //  des_bloquear ();
       
      int fila = t_datos.getSelectedRow();
      String valor = t_datos.getValueAt(fila,0).toString();
       if (fila  >=0){
           try {
               PreparedStatement pps = cn.prepareStatement("DELETE FROM clientes WHERE cod_cli ='"+valor+"'");
               pps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Dato eliminado");
               cargar();
           } catch (SQLException ex) {
               Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

      try {
          PreparedStatement pps = cn.prepareStatement("UPDATE clientes SET nom_cli ='"+nom_cli.getText()+"',direc_cli='"+direc_cli.getText()+"',tel_cli='"+cel_cli.getText()+"',nomMascota='"+nom_mascota.getText()+"',Observaciones='"+observaciones.getText()+"' WHERE cod_cli ='"+buscar.getText()+"'");
        
        
        //("UPDATE clientes SET nom_cli = '"+nom_cli.getText()+"',direc_cli='"+direc_cli.getText()+"',"
          //        + ", cel_cli = '"+cel_cli.getText()+"',nom_mascota = '"+nom_mascota.getText()+"',observaciones = '"+observaciones.getText()+"'WHERE cod_cli = '"+buscar.getText()+"'");
          pps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Datos Actualizados");
          limpiar ();
          cargar();
          
// TODO add your handling code here:
      } catch (SQLException ex) {
          Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void cel_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cel_cliKeyTyped
if (cel_cli.getText().length()>= 8){
evt.consume();
}


        // TODO add your handling code here:
    }//GEN-LAST:event_cel_cliKeyTyped

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
            java.util.logging.Logger.getLogger(ing_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ing_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ing_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ing_cli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ing_cli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField cel_cli;
    private javax.swing.JTextField direc_cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom_cli;
    private javax.swing.JTextField nom_mascota;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables
}
