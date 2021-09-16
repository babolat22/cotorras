
package VistasUniversidad;

import ModeloUniversidad.*;

/**
 *
 * @KAISERKEY
 * 
 */
public class VistaBuscarBorrarCursada extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaBuscarBorrarCursada
     */
    public VistaBuscarBorrarCursada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TBCodigo = new javax.swing.JTextField();
        BTBuscar = new javax.swing.JButton();
        BTMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCursadas = new javax.swing.JTable();
        BTBorrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Buscar Cursadas");

        jLabel2.setText("Codigo Cursada");

        BTBuscar.setText("Buscar");
        BTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBuscarActionPerformed(evt);
            }
        });

        BTMostrarTodo.setText("Mostrar Todo");
        BTMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMostrarTodoActionPerformed(evt);
            }
        });

        TCursadas.setAutoCreateRowSorter(true);
        TCursadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Cursada", "Codigo Materia", "Codigo Alumno", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TCursadas);

        BTBorrar.setText("Borrar");
        BTBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(BTBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTMostrarTodo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(BTBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTBuscar)
                    .addComponent(BTMostrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTBorrar)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBuscarActionPerformed
        int id_cursada = Integer.parseInt(TBCodigo.getText());
        
        Conexion con = new Conexion();
        con.crearConexion();
        con.getConexion();
        
        Cursada c = new Cursada();
        c.setIDCursada(id_cursada);
        AlumnoData ad = new AlumnoData(con);
        MateriaData md = new MateriaData(con);
        
        CursadaData cd = new CursadaData(con);
        cd.buscarCursadas(c, md, ad);
        mostrarResultados(c);
        
        
    }//GEN-LAST:event_BTBuscarActionPerformed

    private void BTMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMostrarTodoActionPerformed
        Conexion con = new Conexion();
        con.crearConexion();
        con.getConexion();
        
        CursadaData cd = new CursadaData(con);
        cd.listarCursadasBD();
        mostrarTodo(cd);
    }//GEN-LAST:event_BTMostrarTodoActionPerformed

    private void BTBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBorrarActionPerformed
        Conexion con = new Conexion();
        con.crearConexion();
        con.getConexion();
        Cursada c = new Cursada();
        c.setIDCursada(Integer.parseInt(TBCodigo.getText()));
        AlumnoData ad = new AlumnoData(con);
        MateriaData md = new MateriaData(con);
        CursadaData cd = new CursadaData(con);
        cd.buscarCursadas(c, md, ad);
        cd.borrarCursada(c);
    }//GEN-LAST:event_BTBorrarActionPerformed

    public void mostrarResultados(Cursada cursada){
        
        TCursadas.setAutoCreateRowSorter(true);
        TCursadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {cursada.getIDCursada(), cursada.getMateria().getIDMateria(), cursada.getAlumno().getIDAlumno(), cursada.getNota()},
            },
            new String [] {
                "Codigo Cursada", "Codigo Materia", "Codigo Alumno", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    
    public void mostrarTodo(CursadaData cd){
        TBCodigo.setText("");
        String matrisCursadasBD[][] = new String[cd.getCursadasBD().size()][4];
        
        for(int i = 0; i < cd.getCursadasBD().size(); i++){
            
            matrisCursadasBD[i][0] = String.valueOf(cd.getCursadasBD().get(i).getIDCursada());
            matrisCursadasBD[i][1] = String.valueOf(cd.getCursadasBD().get(i).getMateria().getIDMateria());
            matrisCursadasBD[i][2] = String.valueOf(cd.getCursadasBD().get(i).getAlumno().getIDAlumno());
            matrisCursadasBD[i][3] = String.valueOf(cd.getCursadasBD().get(i).getNota());
            
        }
        
        TCursadas.setAutoCreateRowSorter(true);
        TCursadas.setModel(new javax.swing.table.DefaultTableModel(
            matrisCursadasBD,
            new String [] {
                "Codigo Cursada", "Codigo Materia", "Codigo Alumno", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBorrar;
    private javax.swing.JButton BTBuscar;
    private javax.swing.JButton BTMostrarTodo;
    private javax.swing.JTextField TBCodigo;
    private javax.swing.JTable TCursadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
