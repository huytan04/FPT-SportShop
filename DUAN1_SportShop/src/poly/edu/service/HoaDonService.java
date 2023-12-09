/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.Model.HoaDon;
import poly.edu.uitility.DBcontext;

/**
 *
 * @author Admin
 */
public class HoaDonService {

    //private ArrayList<HoaDon> list = new ArrayList<>();

    public ArrayList<HoaDon> getAllHoaDon() {
        
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = """
                   select* from HoaDon join NhanVien on HoaDon.ID_NhanVien = NhanVien.id where HoaDon.deleted =0
                     """;
        Connection cn = (Connection) DBcontext.getConnection();
        try {
            //tao Statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //thi hanh Statement => dung Resultset nhan kq
            ResultSet rs = pstm.executeQuery();
            //xu ly kq => do du lieu vao lst
            while (rs.next()) {
                HoaDon h = new HoaDon();
                //h.setMaHoaDon(rs.getString("maHoaDon"));
//                n.setTrangThai(rs.getString("tenTrangThai"));  
                h.setMaHoaDon(rs.getString("maHD"));
                h.setTenKH(rs.getString("TenKH"));
                h.setNgayTao(rs.getDate("create_at"));
                h.setNgayThanhToan(rs.getDate("ngayNhan"));
                h.setNgayXacNhan(rs.getDate("ngayXacNhan"));
                h.setTongTien(rs.getDouble("tongTien"));
                h.setHinhThucThanhToan(rs.getString("HinhThucThanhToan"));
                h.setTrangThai(rs.getString("trangThai"));
                h.setMaNV(rs.getString("MaNV"));
                h.setNguoiTao(rs.getString("create_by"));
//                h.setKichCo(rs.getInt("size"));
//                h.setThuongHieu(rs.getString("Ten"));
//                h.setMaSP(rs.getString("MaSPCT"));
                lst.add(h);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return lst;

      
    }
    public ArrayList<HoaDon> HoaDonChiTiet(String MaHD) {
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = """
                     SELECT *
                     FROM HoaDon
                     JOIN KhachHang ON HoaDon.ID_KhachHang = KhachHang.ID 
                     JOIN HoaDonChiTiet ON HoaDon.ID = HoaDonChiTiet.ID_HoaDon
                     JOIN SanPhamChiTiet ON HoaDonChiTiet.ID_SanPhamChiTiet = SanPhamChiTiet.ID
                     JOIN SanPham ON SanPhamChiTiet.ID_SanPham = SanPham.ID
                     join NhanVien on HoaDon.ID_NhanVien = NhanVien.ID
                     where MaHD = ?
                     """;

        try ( Connection cn = DBcontext.getConnection();  PreparedStatement pstm = cn.prepareStatement(sql)) {

            pstm.setString(1, MaHD);

            try ( ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    HoaDon hoaDon = new HoaDon();
                    hoaDon.setMaHoaDon(rs.getString("maHD"));
                    hoaDon.setMaNV(rs.getString("maNV"));
                   // hoaDon.setNgayGiaoDich(rs.getDate("NgayGiaoDich"));
                    hoaDon.setTongTien(rs.getDouble("tongTien"));
                    hoaDon.setTrangThai(rs.getString("trangThai"));
                    hoaDon.setTenSP(rs.getString("Ten"));
                    hoaDon.setSoLuong(rs.getInt("soLuong"));
                    hoaDon.setNgayXacNhan(rs.getDate("ngayXacNhan"));
                    hoaDon.setTenNV(rs.getString("tenNV"));
                    lst.add(hoaDon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
         public Integer updateHoaDon(String maHD) {
        Integer row = null;
        String sql = """
                        update HoaDon
                        set deleted = 1
                        where MaHD =?
                     """;
        Connection cn = DBcontext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, maHD);
            

            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
         public ArrayList<HoaDon> getAllSanPham() {
        
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = """
                   select * from HoaDon join NhanVien on HoaDon.ID_NhanVien = NhanVien.ID
                                      					join HoaDonChiTiet on HoaDon.ID = HoaDonChiTiet.ID_HoaDon
                                      					join SanPhamChiTiet on HoaDonChiTiet.ID_SanPhamChiTiet = SanPhamChiTiet.ID
                                      					join Hang on SanPhamChiTiet.ID_Hang = Hang.ID
                                      					join Size on SanPhamChiTiet.ID_Size = SanPhamChiTiet.ID_Size where HoaDon.deleted=0
                     """;
        Connection cn = (Connection) DBcontext.getConnection();
        try {
            //tao Statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //thi hanh Statement => dung Resultset nhan kq
            ResultSet rs = pstm.executeQuery();
            //xu ly kq => do du lieu vao lst
            while (rs.next()) {
                HoaDon h = new HoaDon();  
                h.setMaHoaDon(rs.getString("maHD"));
                h.setTenKH(rs.getString("TenKH"));
                h.setNgayTao(rs.getDate("create_at"));
                h.setNgayThanhToan(rs.getDate("ngayNhan"));
                h.setNgayXacNhan(rs.getDate("ngayXacNhan"));
                h.setTongTien(rs.getDouble("tongTien"));
                h.setHinhThucThanhToan(rs.getString("HinhThucThanhToan"));
                h.setTrangThai(rs.getString("trangThai"));
                h.setMaNV(rs.getString("MaNV"));
                h.setNguoiTao(rs.getString("create_by"));
                h.setKichCo(rs.getInt("size"));
                h.setThuongHieu(rs.getString("Ten"));
                h.setMaSP(rs.getString("MaSPCT"));
                lst.add(h);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return lst;

         }
         public ArrayList<HoaDon> getToanSanPham(String MaHD) {
        
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = """
                   select * from HoaDon
                                            join HoaDonChiTiet on HoaDon.ID = HoaDonChiTiet.ID_HoaDon
                                            join SanPhamChiTiet on HoaDonChiTiet.ID_SanPhamChiTiet = SanPhamChiTiet.ID
                                            join Hang on SanPhamChiTiet.ID_Hang = Hang.ID
                                            join Size on SanPhamChiTiet.ID_Size = Size.ID and HoaDon.maHD = ?
                     """;
        Connection cn = (Connection) DBcontext.getConnection();
        try {
            //tao Statement
            
            PreparedStatement pstm = cn.prepareStatement(sql);
            //thi hanh Statement => dung Resultset nhan kq
            pstm.setString(1, MaHD);
            ResultSet rs = pstm.executeQuery();
            //xu ly kq => do du lieu vao lst
            while (rs.next()) {
                HoaDon h = new HoaDon();  
                h.setMaHoaDon(rs.getString("MaHD"));
                h.setTenKH(rs.getString("TenKH"));
                h.setNgayTao(rs.getDate("create_at"));
                h.setNgayThanhToan(rs.getDate("ngayNhan"));
                h.setNgayXacNhan(rs.getDate("ngayXacNhan"));
                h.setTongTien(rs.getDouble("tongTien"));
                h.setHinhThucThanhToan(rs.getString("HinhThucThanhToan"));
                h.setTrangThai(rs.getString("trangThai"));
               // h.setMaNV(rs.getString("MaNV"));
                h.setNguoiTao(rs.getString("create_by"));
                h.setKichCo(rs.getInt("size"));
                h.setThuongHieu(rs.getString("Ten"));
                h.setMaSP(rs.getString("MaSPCT"));
                h.setSoLuong(rs.getInt("soLuong"));
                lst.add(h);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return lst;

         }
           public Integer updateSanPham(String maHD) {
        Integer row = null;
        String sql = """
                        UPDATE HoaDon
                        JOIN HoaDonChiTiet ON HoaDon.ID = HoaDonChiTiet.ID_HoaDon
                        JOIN SanPhamChiTiet ON HoaDonChiTiet.ID_SanPhamChiTiet = SanPhamChiTiet.ID
                        JOIN Hang ON SanPhamChiTiet.ID_Hang = Hang.ID
                        JOIN Size ON SanPhamChiTiet.ID_Size = Size.ID
                        JOIN KhachHang ON HoaDon.ID_KhachHang = KhachHang.id
                        JOIN DiaChi ON KhachHang.ID = DiaChi.ID_KhachHang
                        SET KhachHang.SDT = ?, DiaChi.diachi = ? 
                        where MaHD =?
                     """;
        Connection cn = DBcontext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, maHD);
            

            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
//    public Integer insertHoaDon() {
//        Integer row = null;
//        String sql = """
//                        INSERT INTO HoaDon
//                                              (ID_KhachHang, ID_NhanVien, TenKH, sdt, tongTien, trangThai, diaChi, ngayShip, ngayNhan, ngayXacNhan, ngayMuonNhan, soTienGiam, PhiShip, HinhThucThanhToan, TrangThaiThanhT, create_at, create_by, 
//                                              update_at, update_by, deleted, MaHD, NgayGiaoDich)
//                        VALUES    (?,?,,,,,,,,,,,,,,,,,,,,)
//                     """;
//        Connection cn = DBcontext.getConnection();
//        try {
//            PreparedStatement pstm = cn.prepareStatement(sql);
//            pstm.setString(1, );
//            
//
//            
//            row = pstm.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(HoaDonService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return row;
//    }
}

