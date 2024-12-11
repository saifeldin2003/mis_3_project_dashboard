/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import Utils.DBMange;
import java.sql.ResultSet;
import javax.swing.JLabel;

/**
 *
 * @author Saif Eldin
 */
public class FetchingData {
String SqlQuery;
    public FetchingData( String sqlquery ) {
        this.SqlQuery = sqlquery;
    }
    
    
    
    public int CountOfRows() {
        try {
            DBMange db = new DBMange();
            ResultSet rs = db.runSelect(SqlQuery);
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                System.out.println(rs.first());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  0;
        

    }
}
