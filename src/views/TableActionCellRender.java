package views;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import views.ButtonContainer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saif Eldin
 */
public class TableActionCellRender extends DefaultTableCellRenderer{

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        ButtonContainer buttonContainer = new ButtonContainer();
        if(isSelected == false && row %2==0){
            buttonContainer.setBackground(Color.white);
        }else{
           buttonContainer.setBackground(comp.getBackground());
        }
        return buttonContainer;
    }
    
    
}
