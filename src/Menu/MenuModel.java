
package Menu;

import javax.swing.Icon;

public class MenuModel {
    String label;
    Icon icon;

    public MenuModel(String label, Icon icon) {
        this.label = label;
        this.icon = icon;
    }

    public MenuModel() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    
}
