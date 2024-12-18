/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import Utils.DBMange;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Saif Eldin
 */
public class ProductScreen extends javax.swing.JFrame {

    /**
     * Creates new form ProductScreen
     */
    String id,name,price,departmentid;
    public ProductScreen() {
        initComponents();
        // to make screen in center
        this.setLocationRelativeTo(null); 
    }

    public void insertdata(){
     
        id = proid.getText();
        name = proname.getName();
        price = proprice.getName();
        departmentid = prodepartmentt.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorfulBackGround1 = new Utils.ColorfulBackGround();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        proid = new javax.swing.JTextField();
        proname = new javax.swing.JTextField();
        proprice = new javax.swing.JTextField();
        prodepartmentt = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product Id");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Product Department");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Product Price");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Product Name");

        proid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proid.setPreferredSize(new java.awt.Dimension(70, 31));

        proname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proname.setPreferredSize(new java.awt.Dimension(70, 31));

        proprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proprice.setPreferredSize(new java.awt.Dimension(70, 31));

        prodepartmentt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodepartmentt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prodepartmentt.setPreferredSize(new java.awt.Dimension(70, 31));

        view.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        view.setText("View Product");

        update.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update.setText("Update Product");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delete.setText("Delete Product");

        insert.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        insert.setText("Add Product");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product_icon.png"))); // NOI18N
        jLabel15.setText(" Manage Your Products");

        javax.swing.GroupLayout colorfulBackGround1Layout = new javax.swing.GroupLayout(colorfulBackGround1);
        colorfulBackGround1.setLayout(colorfulBackGround1Layout);
        colorfulBackGround1Layout.setHorizontalGroup(
            colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(proid, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                                .addComponent(prodepartmentt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(update))
                                        .addGap(52, 52, 52))
                                    .addComponent(insert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(proname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(proprice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        colorfulBackGround1Layout.setVerticalGroup(
            colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel15)
                .addGap(50, 50, 50)
                .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodepartmentt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                                .addGroup(colorfulBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(delete))
                                .addGap(18, 18, 18)
                                .addComponent(proname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(colorfulBackGround1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(proprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorfulBackGround1Layout.createSequentialGroup()
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(view)
                        .addGap(38, 38, 38)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(colorfulBackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(colorfulBackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        insertdata();
        DBMange db = new DBMange();
        String msg = db.runInsUpDel("update products set proname= '"+ name +"' ,proprice='"+ price +"' ,prodepid='"+departmentid +"' where proid= '"+ id +"' ");
        if(msg.equals("OK")){
           ImageIcon icon = new ImageIcon(getClass().getResource("/icons/checkicon.png"));
            JOptionPane.showMessageDialog(rootPane, "your product is updated","Updated"
                    ,JOptionPane.INFORMATION_MESSAGE,icon);
        }else{
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_updateMouseClicked

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        insertdata();
        DBMange db = new DBMange();
        String msg = db.runInsUpDel("insert into products values ( '"+ id +"' ,'"+ name +"' ,'"+ price +"' ,'"+departmentid +"' )");
        if(msg.equals("OK")){
           ImageIcon icon = new ImageIcon(getClass().getResource("/icons/checkicon.png"));
            JOptionPane.showMessageDialog(rootPane, "your product is Inserted","Updated"
                    ,JOptionPane.INFORMATION_MESSAGE,icon); 
        }else{
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_insertMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utils.ColorfulBackGround colorfulBackGround1;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JTextField prodepartmentt;
    private javax.swing.JTextField proid;
    private javax.swing.JTextField proname;
    private javax.swing.JTextField proprice;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
