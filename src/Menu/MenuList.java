
package Menu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import Menu.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;

public class MenuList<E extends Object> extends JList<Object> {
    
    DefaultListModel defaultListModel;
    public MenuList() {
    defaultListModel = new DefaultListModel();
    setBackground(Color.decode("#1CB5E0"));    
    setModel(defaultListModel);
        
        
    }

    @Override
    public ListCellRenderer<? super Object> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                MenuItem item = new MenuItem();
                MenuModel m = (MenuModel)value;
                item.setItem(value);
                if(isSelected){
                item.setBackground(Color.decode("#5bb2e5"));
                item.setOpaque(true);
                    //System.out.println(" "+m.label );
                }
                item.setSelected(isSelected);
                return item;
            }
        };
    }
   
    public void addItem(MenuModel item){
    defaultListModel.addElement(item);
    }
    
   
static class GradientCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            // إعداد التدرج اللوني
            Graphics g = getGraphics();
            if (g != null) {
                if (isSelected) {
                    // إذا كان العنصر محددًا، قم برسم التدرج مع خلفية مظللة
                    g.setColor(Color.WHITE);
                    g.fillRect(0, 0, getWidth(), getHeight());
                    GradientPaint gradient = new GradientPaint(0, 0, Color.CYAN, getWidth(), getHeight(), Color.BLUE);
                    ((Graphics2D) g).setPaint(gradient);
                    g.fillRect(0, 0, getWidth(), getHeight());
                } else {
                    // رسم التدرج في الخلايا الغير محددة
                    GradientPaint gradient = new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.YELLOW);
                    ((Graphics2D) g).setPaint(gradient);
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
            }

            return this;
        }
    }


    
    
}

  