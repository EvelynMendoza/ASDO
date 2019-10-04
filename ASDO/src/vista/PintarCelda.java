/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author octavio
 */
public class PintarCelda extends JTable{
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnaIndex){
        Component component=super.prepareRenderer(renderer, rowIndex, columnaIndex);
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);
        if((String.class.equals(this.getColumnClass(columnaIndex))) && (getValueAt(rowIndex, columnaIndex)!=null)){
          String status=getValueAt(rowIndex, columnaIndex).toString();
          if(status.equals("Pendiente")){
              component.setBackground(Color.RED);
              component.setForeground(Color.BLACK);
              
          }
        }
        
        return component;
        
    }
}
