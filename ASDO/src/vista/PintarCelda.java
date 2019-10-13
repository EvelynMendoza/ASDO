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

    private int columna;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, selected, focused, row, column);

        if (value instanceof String) {
            String valor = String.valueOf(value);
            cell.setBackground(Color.green);
                    cell.setForeground(Color.BLACK);
            if (column == 3) {
                if (valor.equals("PENDIENTE")) {
                    cell.setBackground(Color.red);
                    cell.setForeground(Color.WHITE);
                }else{
                    cell.setBackground(Color.green);
                    cell.setForeground(Color.BLACK);
                }
            }
        }
        return cell;
    }
}