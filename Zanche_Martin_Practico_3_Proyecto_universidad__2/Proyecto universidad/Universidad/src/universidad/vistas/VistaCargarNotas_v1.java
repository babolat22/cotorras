/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

import universidad.*;
import universidad.vistas.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.AlumnoData;
import modelo.Conexion;
import modelo.Cursada;
import modelo.CursadaData;
import modelo.Materia;
import modelo.MateriaData;
import modelo.ModeloCeldasEditables;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Martin
 */
public class VistaCargarNotas_v1 extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo;
 private ArrayList<Cursada> listaCursada;
 private ArrayList<Materia> listaMateria;
 private CursadaData cd;
 private MateriaData md;
 private Conexion con;
 private AlumnoData ad;
 private ArrayList <Alumno> listaAlumno;
 private ArrayList<Cursada> listCurUpdate=new ArrayList<>();;
 private ArrayList<Double> listNotas=new ArrayList<>();
 private int i=0;
 private ModeloCeldasEditables modelo1;
 
    /**
     * Creates new form VistaCargarNotas
     */
    public VistaCargarNotas_v1() {
        initComponents();
         AutoCompleteDecorator.decorate(cbAlumnos);
        
        con =new Conexion();
        //modelo= new DefaultTableModel();
        modelo1= new ModeloCeldasEditables();
       
        cd= new CursadaData(con);
        listaCursada=(ArrayList)cd.obtenerCursadas();
        
        md=new MateriaData(con);
        listaMateria=(ArrayList<Materia>)md.obtenerMaterias();
        
        ad= new AlumnoData(con);
        listaAlumno=(ArrayList<Alumno>)ad.obtenerAlumnos();
           
       borrarFilasTabla();        
       cargarAlumnos();
       armarCabaceraTabla();
       cargarDatos();
      
    }
   
  
         private void cargarAlumnos(){
        for (Alumno item:listaAlumno)
        cbAlumnos.addItem(item);
       }
   
    public void armarCabaceraTabla(){
    ArrayList<Object> columns= new ArrayList<>();
    columns.add("ID cursada");
    columns.add("Nombre");
    columns.add("Nota");
    columns.add("Periodo");
    columns.add("Responsable");
    for (Object it:columns)
    {
        modelo1.addColumn(it);
    }
    tblMaterias.setModel(modelo1);
    }
    
    public void borrarFilasTabla(){
     int a=modelo1.getRowCount()-1 ;
      for (int i=a;i>=0;i--){
     modelo1.removeRow(i);
     }
    }
    
    
    
    private void cargarDatos(){
     borrarFilasTabla();
     Alumno alu=(Alumno)cbAlumnos.getSelectedItem();
     
    for (Cursada a:listaCursada){
      if(a.getAlumno().getId()==alu.getId()){
       modelo1.addRow(new Object[]{a.getId(),a.getMateria().getNombre(),a.getNota(),a.getMateria().getPeriodo(),a.getMateria().getResponsable()});
      }
     }
    
    //Funcion para tomar los datos de la celda Nota para que al modificar los datos de la celda se carguen en los arraylist 
    // con los datos de la nota y la cursada a la que corresponde
    modelo1.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
            if (e.getType()== TableModelEvent.UPDATE &&  e.getColumn()==2){
             int columna= e.getColumn();
             int fila=(e.getFirstRow());
             Cursada cur;
               if (columna == 2){
                   //listNotas= Double.parseDouble((String) tblMaterias.getValueAt(fila, columna));
                   double nota= Double.parseDouble((String) tblMaterias.getValueAt(fila, columna));
                   listNotas.add(nota);//guardo la nota en el array para despues actualizar con el boton guardar
                  
                
                cur= cd.buscarCursadaXId((int)tblMaterias.getValueAt(fila, 0));
                listCurUpdate.add(cur);//guardo la cursada en el array para despues actualizar con el boton guardar
                   System.out.println("" + fila);
                   System.out.println("" +(int)tblMaterias.getValueAt(fila, 0) + "" + cur.getAlumno().getNombre());
              //  cd.actualizarNotaCursada(cur,nota);
              //i++;
               }
            }
         }
     });
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCargarNota = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        lblAlumnos = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblCargarNota.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblCargarNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargarNota.setText("Cargar notas");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        lblAlumnos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAlumnos.setText("Alumnos");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnGuardar)
                .addGap(80, 80, 80)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lblCargarNota))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCargarNota)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlumnos))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       int largo=listCurUpdate.size();
       if(largo>0){
       for (int j=0;j<largo;j++){
       cd.actualizarNotaCursada(listCurUpdate.get(j), listNotas.get(j));
       }
        JOptionPane.showMessageDialog(null, "Se actualizaron notas", "Info", JOptionPane.WARNING_MESSAGE); 
       // borrarFilasTabla();
        modelo1.fireTableDataChanged();//refresca la vista de la tabla
       // i=0;
       listCurUpdate.clear();
       listNotas.clear();
       listaCursada.clear();
       listaCursada=(ArrayList)cd.obtenerCursadas();
       borrarFilasTabla();
       cargarDatos();
       } else JOptionPane.showMessageDialog(null, "No se modifico ninguna nota", "Info", JOptionPane.WARNING_MESSAGE); 
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
        modelo1.fireTableDataChanged();
        borrarFilasTabla();
        cargarDatos();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //VistaCargarNotas;
        JOptionPane.showMessageDialog(null, "No se modifico ninguna nota", "Info", JOptionPane.WARNING_MESSAGE);
        modelo1.fireTableDataChanged();
        listCurUpdate.clear();
       listNotas.clear();
        borrarFilasTabla();
        cargarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlumnos;
    private javax.swing.JLabel lblCargarNota;
    private javax.swing.JTable tblMaterias;
    // End of variables declaration//GEN-END:variables
}
