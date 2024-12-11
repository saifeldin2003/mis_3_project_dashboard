
package views;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableActionCellEditor extends DefaultCellEditor{

    TableActionEvent event;
    public TableActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event=event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        ButtonContainer ab = new ButtonContainer();
        ab.initevent(event, row);
        ab.setBackground(table.getSelectionBackground());
    return ab;
    }
    
    

 
    
    
}
