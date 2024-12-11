package Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import javax.swing.Icon;
import screens.ProductScreen;



public class MenuItem extends javax.swing.JPanel {

    boolean selected;
    int generalIndex;

    public void setGeneralIndex(int generalIndex) {
        this.generalIndex = generalIndex;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public MenuItem() {
        initComponents();
        setOpaque(true);
        setBackground(Color.decode("#1CB5E0"));
        Itemname.setForeground(Color.WHITE);
        
           
    }
 public void clicked(boolean selected,int index) {
        if(selected&&index==generalIndex){
            switch (Itemname.getText()) {
                case "products":
                    ProductScreen p = new ProductScreen();
                    p.setVisible(true);
                    break;
                    default:
                        System.out.println(Itemname.getText());
                
            }
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setItem(Object object) {
        
        if (object instanceof MenuModel) {
            MenuModel menu = (MenuModel) object;
            Itemname.setIcon(menu.getIcon());
            Itemname.setText(menu.getLabel());
        }else{
        Itemname.setText("some thing is wrong  "+object);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Itemname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(102, 0, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Itemname.setBackground(new java.awt.Color(255, 255, 255));
        Itemname.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Itemname.setForeground(new java.awt.Color(153, 153, 255));
        Itemname.setText("jLabel2");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Itemname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

     
@Override
    protected void paintChildren(Graphics g) {
        
         Graphics2D g2 =  (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        if(selected){
             GradientPaint gr = new GradientPaint(0, 0, Color.WHITE,0, getHeight(), Color.WHITE);
                g2.setPaint(gr);
            g2.fillRect(0, 0, 6, getHeight());
        }
        
        super.paintChildren(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Itemname;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

  
}
