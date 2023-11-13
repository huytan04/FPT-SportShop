/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poly.edu.Model.entity.HoaDon;
import poly.edu.uitility.DBcontext;

/**
 *
 * @author Admin
 */
public class HoaDonService {

    private ArrayList<HoaDon> list = new ArrayList<>();

    public ArrayList<HoaDon> getAllTrangThai() {
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = "select * from HOADON";
        //tao ket noi
        //Connection cn = (Connection) DBcontext.getConnection();
        Connection cn = (Connection) DBcontext.getConnection();
        try {
            //tao Statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //thi hanh Statement => dung Resultset nhan kq
            ResultSet rs = pstm.executeQuery();
            //xu ly kq => do du lieu vao lst
            while (rs.next()) {
                HoaDon n = new HoaDon();
                n.setMaHoaDon(rs.getString("maHoaDon"));
                n.setTrangThai(rs.getString("tenTrangThai"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return lst;
    }

    public ArrayList<HoaDon> getAllHoaDon() {
        ArrayList<HoaDon> lst = new ArrayList<>();
        String sql = """
                     SELECT [ID],
                           [TenKH]
                           ,[tongTien]
                           ,[trangThai]
                           ,[ngayNhan]
                           ,[ngayXacNhan] 
                           ,[HinhThucThanhToan]
                           ,[create_at] 
                       FROM [dbo].[HoaDon]
                     
                     GO
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
//                n.setMaHoaDon(rs.getString("maHoaDon"));
//                n.setTrangThai(rs.getString("tenTrangThai"));  
                h.setMaHoaDon(rs.getString("ID"));
                h.setTenKH(rs.getString("TenKH"));
                h.setNgayTao(rs.getDate("create_at"));
                h.setNgayThanhToan(rs.getDate("ngayNhan"));
                h.setNgayXacNhan(rs.getDate("ngayXacNhan"));
                h.setTongTien(rs.getDouble("tongTien"));
                h.setHinhThucThanhToan(rs.getString("HinhThucThanhToan"));
                h.setTrangThai(rs.getString("trangThai"));

                lst.add(h);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return lst;
    }
}
