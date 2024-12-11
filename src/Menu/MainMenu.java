package Menu;


import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import screens.Departmet;
import screens.OrderScreen;
import screens.ProductScreen;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Saif Eldin
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    
    public MainMenu() {
        initComponents();
        setBackground(Color.decode("#1CB5E0"));
        menuList1.addItem(new MenuModel("  Products",new ImageIcon(getClass().getResource("/icons/product_icon.png"))));
        menuList1.addItem(new MenuModel(" Department",new ImageIcon(getClass().getResource("/icons/department.png"))));
        menuList1.addItem(new MenuModel(" Customers",new ImageIcon(getClass().getResource("/icons/coustmer.png"))));
        menuList1.addItem(new MenuModel("  Orders",new ImageIcon(getClass().getResource("/icons/order.png"))));
        
        menuList1.addListSelectionListener((e) -> {
            if(!e.getValueIsAdjusting()){
                MenuModel m =(MenuModel)menuList1.getSelectedValue();
                click(m.label);
            
            }
        });
         }
    
    public void click(String nameofscreen){
        switch (nameofscreen) {
            case "  Products":
                ProductScreen p =new ProductScreen();
                p.setVisible(true);
                break;
            case " Department":
                Departmet d =new Departmet();
                d.setVisible(true);
                break;
            case "  Orders":
                OrderScreen o =new OrderScreen();
                o.setVisible(true);
                break;    
            default:
                System.out.println("Some thing is wrong" +nameofscreen);;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuList1 = new Menu.MenuList<>();
        jLabel1 = new javax.swing.JLabel();

        menuList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                menuList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(menuList1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home DashBoard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_menuList1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_menuList1ValueChanged

    
    

    


       
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Menu.MenuList<String> menuList1;
    // End of variables declaration//GEN-END:variables
}