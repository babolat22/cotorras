/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ModeloCeldasEditables extends DefaultTableModel{
   

 public boolean isCellEditable (int row, int column)
    {
        // Aquí devolvemos true o false según queramos que una celda
        // identificada por fila,columna (row,column), sea o no editable
        if (column == 2 || column==5)
           return true;
        return false;
    }
 

   /** Primera columna Boolean, segunda Integer y el resto Object */
   public Class getColumnClass(int columna)
   {
      if (columna == 5) return Boolean.class;
     // if (columna == 1) return Integer.class;
      return Object.class;
   }

    
}
