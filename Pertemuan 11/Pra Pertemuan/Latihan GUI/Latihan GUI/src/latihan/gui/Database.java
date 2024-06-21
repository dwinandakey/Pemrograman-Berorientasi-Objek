/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dwinanda
 */
public class Database implements Serializable {

    public static Database instance;

    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "pbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO mahasiswa (nim, nama, jenis_kelamin, umur, alamat, provinsi, hobi) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi());
            pstmt.setString(7, String.join(",", mahasiswa.getHobi()));
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public List<Mahasiswa> getListMahasiswa() throws SQLException {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));

                mahasiswa.setJenisKelamin(rs.getString("jenis_kelamin"));
                mahasiswa.setUmur(rs.getInt("umur"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                mahasiswa.setProvinsi(rs.getString("provinsi"));
                mahasiswa.setHobi(new ArrayList<>(Arrays.asList(rs.getString("hobi").split(","))));

                mahasiswaList.add(mahasiswa);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return mahasiswaList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:" + DB_TYPE + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME, DB_USER, DB_PASS
        );
    }

    public boolean deleteMahasiswa(String nim) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM mahasiswa WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Mahasiswa getMahasiswa(String nim) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM mahasiswa WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setJenisKelamin(rs.getString("jenis_kelamin"));
                mahasiswa.setUmur(rs.getInt("umur"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                mahasiswa.setProvinsi(rs.getString("provinsi"));
                mahasiswa.setHobi(new ArrayList<>(Arrays.asList(rs.getString("hobi").split(","))));
                return mahasiswa;
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public boolean isNimExist(String nim) throws SQLException {
        String query = "SELECT COUNT(*) FROM mahasiswa WHERE nim = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nim);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    public void updateMahasiswa(String originalNim, Mahasiswa mahasiswa) throws SQLException {
        Connection conn = getConnection();
        try {
            // Check if the new NIM already exists
            if (!originalNim.equals(mahasiswa.getNim()) && isNimExist(mahasiswa.getNim())) {
                throw new SQLException("NIM baru sudah ada dalam database.");
            }

            String sql = "UPDATE mahasiswa SET nim=?, nama=?, jenis_kelamin=?, umur=?, alamat=?, provinsi=?, hobi=? WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi());
            pstmt.setString(7, String.join(",", mahasiswa.getHobi()));
            pstmt.setString(8, originalNim);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
