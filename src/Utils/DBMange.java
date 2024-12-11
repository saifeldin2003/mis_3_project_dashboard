package Utils;

import java.sql.*;

public class DBMange {

    private Connection conn;
    private Statement stm;

    void conn_DB() {

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@SAIF-G5:1521:XE", "system", "manager");
            stm = conn.createStatement();
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }


    public String runInsUpDel(String s) {
        try {
            conn_DB();
            stm.executeUpdate(s);
            return "OK";
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public ResultSet runSelect(String s) {
        try {
            conn_DB();
            return stm.executeQuery(s);
        } catch (SQLException ex) {
            return null;
        }
    }
}