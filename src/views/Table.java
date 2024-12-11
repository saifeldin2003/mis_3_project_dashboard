/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Utils.DBMange;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Saif Eldin
 */
public class Table extends javax.swing.JPanel {

    /**
     * Creates new form Table
     */
    public Table() {
        initComponents();
        GetOrders();
        
        
        
        setCellsAlignment(jTable1, SwingConstants.CENTER);
    }
    
    public void GetOrders() {
        try {
            DBMange db = new DBMange();
            ResultSet rs = db.runSelect("select * from orders");
            ResultSetMetaData rm = rs.getMetaData();
            DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
            jTable1.getTableHeader().setForeground(Color.WHITE);
            jTable1.getTableHeader().setBackground(Color.decode("#36D1DC"));
            jTable1.getTableHeader().setFont(new Font("segoe ui", Font.BOLD, 20));
tbl.setRowCount(0);            
//int x=0;
            while (rs.next()) {
                String id = String.valueOf(rs.getInt(1));
                String details = rs.getString(2);
                String date = rs.getString(3);
                String casee = rs.getString(4);
                String custid = String.valueOf(rs.getInt(5));
                String tdata[] = {id, details, date, casee, custid};
                tbl.addRow(tdata);
                
            }
        } catch (Exception e) {

        }

    }

public static void setCellsAlignment(JTable table, int alignment) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);
        TableActionCellRender t = new TableActionCellRender();
        t.setHorizontalAlignment(alignment);
        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(5).setCellRenderer(t);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Code", "Order Details", "Order Date", "Order Case", "Clients", "Action"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(465, 80));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 =  (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
