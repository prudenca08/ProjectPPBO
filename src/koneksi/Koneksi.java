package koneksi;

import java.sql.*;
/**
 * MUH, SYAHRUL WAJHULLAH JASMAN 123170094
 * PRUDENCA AHMAD DAFFA 123190005
 */
public class Koneksi {
    private Connection koneksi;
    public Statement stm;
    String url = "jdbc:mysql://localhost/rental_mobil";
    
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil connect");
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal connect" + ex);
        }
        
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            stm = koneksi.createStatement();
            System.out.println("berhasil connect database");
        } catch (SQLException ex) {
            System.out.println("gagal connect database" + ex);
        }
        return koneksi;
    }
}
