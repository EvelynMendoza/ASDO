/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author octavio
 */
public class PintarCelda extends DefaultTableCellRenderer {

//    private int columna;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, selected, focused, row, column);

        if (value instanceof String) {
            String valor = String.valueOf(value);
//            cell.setBackground(Color.white);
//            cell.setForeground(Color.BLUE);
//            if (column == 3) {
                if (valor.equals("PENDIENTE")) {
                    cell.setBackground(Color.WHITE);
                    cell.setForeground(Color.RED);
                }
//                }else{
//                    cell.setBackground(Color.white);
//                    cell.setForeground(Color.BLUE);
//                }
//            }
        }
        return cell;
    }
}