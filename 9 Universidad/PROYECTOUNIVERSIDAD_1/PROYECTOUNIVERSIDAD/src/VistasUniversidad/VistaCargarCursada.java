
package VistasUniversidad;

import ModeloUniversidad.*;

/**
 *
 * @kaiserkey
 * 
 */
public class VistaCargarCursada extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCargarCursada
     */
    public VistaCargarCursada() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TBCodigoAlumno = new javax.swing.JTextField();
        TBCodigoMateria = new javax.swing.JTextField();
        TBNota = new javax.swing.JTextField();
        BTGuardar = new javax.swing.JButton();
        BTLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Formulario Cursadas");

        jLabel2.setText("Codigo de Alumno:");

        jLabel3.setText("Codigo de Materia:");

        jLabel4.setText("Nota:");

        BTGuardar.setText("Guardar");
        BTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarActionPerformed(evt);
            }
        });

        BTLimpiar.setText("LimpiarTB");
        BTLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TBCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TBCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TBNota)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BTLimpiar)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TBCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TBCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TBNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTGuardar)
                    .addComponent(BTLimpiar))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarActionPerformed
        int id_alumno;
        int id_materia;
        int nota;
        
        id_alumno= Integer.parseInt(TBCodigoAlumno.getText());
        id_materia = Integer.parseInt(TBCodigoMateria.getText());
        nota = Integer.parseInt(TBNota.getText());
        
        Conexion con = new Conexion();
        con.crearConexion();
        con.getConexion();
        Alumno al = new Alumno();
        al.setID_Alumno(id_alumno);
        AlumnoData ad = new AlumnoData(con);
        ad.buscarAlumno(al);
        Materia m = new Materia();
        m.setIDMateria(id_materia);
        MateriaData md = new MateriaData(con);
        md.buscarMateria(m);
        Cursada c = new Cursada();
        c.setNota(nota);
        c.setAlumno(al);
        c.setMateria(m);
        CursadaData cd = new CursadaData(con);
        cd.guardarCursada(c);
    }//GEN-LAST:event_BTGuardarActionPerformed

    private void BTLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLimpiarActionPerformed
        TBCodigoAlumno.setText("");
        TBCodigoMateria.setText("");
        TBNota.setText("");
    }//GEN-LAST:event_BTLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTGuardar;
    private javax.swing.JButton BTLimpiar;
    private javax.swing.JTextField TBCodigoAlumno;
    private javax.swing.JTextField TBCodigoMateria;
    private javax.swing.JTextField TBNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
