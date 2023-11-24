/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.beans.Statement;
import java.util.ArrayList;
import poly.edu.Model.SanPhamChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import javax.annotation.processing.Generated;
import poly.edu.Model.ChatLieu;
import poly.edu.Model.DeGiay;
import poly.edu.Model.HangGiay;
import poly.edu.Model.MauSac;
import poly.edu.Model.SanPham;
import poly.edu.Model.Size;
import poly.edu.uitility.DBcontext;

/**
 *
 * @author Admin
 */
public class SanPhamChiTietDao extends EduSysDAO<SanPhamChiTiet, String> {

    private Integer insert;
    private Integer update;
    private Integer delete;

    @Override
    public void insert(SanPhamChiTiet entity) {
        insert = 0;
//        Connection cn = null;
//        PreparedStatement ps = null;
//        try {
//            cn = DBcontext.getConnection();
//            cn.setAutoCommit(false);
//
//            String sqlDG = """
//                    INSERT INTO DeGiay
//                                          (Ten, TrangThai, create_at, create_by, update_at, update_by,deleted)
//                    VALUES    (?,'Active',GETDATE(),'NV001',GETDATE(),'NV001',0)
//                    """;
//            PreparedStatement psDG = cn.prepareStatement(sqlDG, PreparedStatement.RETURN_GENERATED_KEYS);
//            psDG.setObject(1, entity.getDeGiay().getTen());
//            int dg = psDG.executeUpdate();
//
//            String sqlCL = """
//                    INSERT INTO ChatLieu
//                                          ( TrangThai, TenChatLieu, create_at, create_by, update_at, update_by, deleted)
//                    VALUES    ('Active',?,GETDATE(),'NV001',GETDATE(),'NV001',0)
//                    """;
//            PreparedStatement psCL = cn.prepareStatement(sqlCL, PreparedStatement.RETURN_GENERATED_KEYS);
//            psCL.setObject(1, entity.getChatLieu().getTenChatLieu());
//            int cl = psCL.executeUpdate();
//            String sqlSize = """
//                    INSERT INTO Size
//                                                             (Size, TrangThai, create_at, create_by, update_at, update_by, deleted)
//                                        VALUES    (?,'Active',GETDATE(),'NV001',GETDATE(),'NV001',0)
//                    """;
//            PreparedStatement psSize = cn.prepareStatement(sqlSize, PreparedStatement.RETURN_GENERATED_KEYS);
//            psSize.setObject(1, entity.getSize().getSize());
//            int size = psSize.executeUpdate();
//            //
//            String sqlHang = """
//                    INSERT INTO Hang
//                                          (Ten, TrangThai, create_at, create_by, update_at, update_by, deleted)
//                    VALUES    (?,'Active',GETDATE(),'NV001',GETDATE(),'NV001',0)
//                    """;
//            PreparedStatement psHang = cn.prepareStatement(sqlHang, PreparedStatement.RETURN_GENERATED_KEYS);
//            psHang.setObject(1, entity.getHang().getTen());
//            int hang = psHang.executeUpdate();
//            //
//            String sqlMS = """
//                   INSERT INTO MauSac
//                                          (MaMau, TenMau, TrangThai, create_at, create_by, update_at, update_by, deleted)
//                    VALUES    ('NOT',?,'Active',GETDATE(),'NV001',GETDATE(),'NV001',0)
//                    """;
//            PreparedStatement psMS = cn.prepareStatement(sqlMS, PreparedStatement.RETURN_GENERATED_KEYS);
//            psMS.setObject(1, entity.getMauSac().getTenMau());
//            int ms = psMS.executeUpdate();
//            //
//            Random random = new Random();
//            int IntMaSP = random.nextInt(100000); // Số ngẫu nhiên từ 0 đến 99999
//            String maSP = "SP" + IntMaSP;
//            String sqlSP = """
//                    INSERT INTO SanPham
//                                          (Ten, TrangThai, create_at, create_by, update_at, update_by, deleted, MaSP)
//                    VALUES    (?,'Active',GETDATE(),'NV001',GETDATE(),'NV001',0,? );
//                    """;
//            PreparedStatement psSP = cn.prepareStatement(sqlSP, PreparedStatement.RETURN_GENERATED_KEYS);
//            psSP.setObject(1, entity.getSp().getTen());
//            psSP.setObject(2, entity.getSp().getMaSP());
//            int sp = psSP.executeUpdate();
//            //
//            if (dg > 0 && cl > 0 && ms > 0 && hang > 0  && size > 0) {
//                ResultSet rsCL = psCL.getGeneratedKeys();
//                ResultSet rsDG = psDG.getGeneratedKeys();
//                ResultSet rsHang = psHang.getGeneratedKeys();
//                ResultSet rsMS = psMS.getGeneratedKeys();
//                ResultSet rsSP = psSP.getGeneratedKeys();
//                ResultSet rsSize = psSize.getGeneratedKeys();
//                if (rsCL.next() && rsDG.next() && rsHang.next() && rsSP.next()  && rsMS.next() && rsSize.next()) {
//                    int idHang = rsHang.getInt(1);
//                    int idDG = rsDG.getInt(1);
//                    int idCL = rsCL.getInt(1);
//                    int idSP = rsSP.getInt(1);
//                    int idMS = rsMS.getInt(1);
//                    int idSize = rsSize.getInt(1);
//                    Random random1 = new Random();
//                    int Id = random1.nextInt(100000);
//                    String maCTSP = "CTSP" + IntMaSP;
//                    String sql = "INSERT INTO SanPhamChiTiet\n"
//                            + "                      (ID_SanPham, ID_MauSac, ID_Size, ID_Hang, ID_ChatLieu, ID_DeGiay, MoTa, Gia, SoLuongTon, TrangThai, create_at, create_by, update_at, update_by, deleted, MaSPCT) "
//                            + "VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, 'Active', GETDATE(), 'NV001', GETDATE(), 'NV001', 0, ?)";
//                    ps = cn.prepareStatement(sql);
//                    ps.setObject(1, idSP);
//                    ps.setObject(2, idMS);
//                    ps.setObject(3, idSize);
//                    ps.setObject(4, idHang);
//                    ps.setObject(5, idCL);
//                    ps.setObject(6, idDG);
//                    ps.setObject(7, entity.getMoTa());
//                    ps.setObject(8, entity.getGia());
//                    ps.setObject(9, entity.getSoLuongTon());
//                    ps.setObject(10, maCTSP);
//
//                    int insert = ps.executeUpdate();
//
//                }
//
//            }
//            cn.commit();
//        } catch (Exception e) {
//            if (cn != null) {
//                try {
//                    cn.rollback();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//            e.printStackTrace();
//        } finally {
//            // Close prepared statements and connection
//            if (ps != null) {
//                try {
//                    ps.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (cn != null) {
//                try {
//                    cn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        String sql = """
                        INSERT INTO SanPhamChiTiet
                                              (ID_SanPham, ID_MauSac, ID_Size, ID_Hang, ID_ChatLieu, ID_DeGiay, MoTa, Gia, SoLuongTon, TrangThai, create_at, create_by, update_at, update_by, deleted, MaSPCT)
                        VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, 'Active', GETDATE(), 'NV001', GETDATE(), 'NV001', 0, ?)
                        """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setObject(1, entity.getSp().getId());
            ps.setObject(2, entity.getMauSac().getId());
            ps.setObject(3, entity.getSize().getId());
            ps.setObject(4, entity.getHang().getId());
            ps.setObject(5, entity.getChatLieu().getId());
            ps.setObject(6, entity.getDeGiay().getId());
            ps.setObject(7, entity.getMoTa());
            ps.setObject(8, entity.getGia());
            ps.setObject(9, entity.getSoLuongTon());
            ps.setObject(10, entity.getMaCTSP());
            insert = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(SanPhamChiTiet entity) {
//        Connection cn = null;
//        PreparedStatement ps = null;
//        try {
//            cn = DBcontext.getConnection();
//            cn.setAutoCommit(false);
//            String sql = """
//                         UPDATE    SanPhamChiTiet
//                         SET             ID_SanPham =?, ID_MauSac =?, ID_Size =?, ID_Hang =?, ID_ChatLieu =?, ID_DeGiay =?, MoTa =?, Gia =?, SoLuongTon =?, TrangThai ='Active', create_at = GETDATE(), create_by ='NV001', update_at =GETDATE(), update_by ='NV001'
//                         WHERE ID = ?
//                         """;
//            ps = cn.prepareStatement(sql);
//            ps.setObject(7, entity.getMoTa());
//            ps.setObject(8, entity.getGia());
//            ps.setObject(9, entity.getSoLuongTon());
//            ps.setObject(10, entity.getId());
//            ps.setObject(5, entity.getChatLieu().getId());
//            ps.setObject(6, entity.getDeGiay().getId());
//            ps.setObject(4, entity.getHang().getId());
//            ps.setObject(2, entity.getMauSac().getId());
//            ps.setObject(1, entity.getSp().getId());
//            ps.setObject(3, entity.getSize().getId());
//            int insert = ps.executeUpdate();
//            if (insert > 0) {
//
//                String sqlDG = """
//                    UPDATE    DeGiay
//                                        SET             Ten =?
//                                        WHERE ID = ?
//                    """;
//                PreparedStatement psDG = cn.prepareStatement(sqlDG);
//                psDG.setObject(1, entity.getDeGiay().getTen());
//                psDG.setObject(2, entity.getDeGiay().getId());
//                int dg = psDG.executeUpdate();
//
//                String sqlCL = """
//                    UPDATE    ChatLieu
//                                        SET             TenChatLieu =?
//                                        WHERE ID = ?
//                    """;
//                PreparedStatement psCL = cn.prepareStatement(sqlCL);
//                psCL.setObject(1, entity.getChatLieu().getTenChatLieu());
//                psCL.setObject(2, entity.getChatLieu().getId());
//                int cl = psCL.executeUpdate();
//                String sqlSize = """
//                     UPDATE    Size
//                                        SET             Size =?
//                                        WHERE ID = ?
//                    """;
//                PreparedStatement psSize = cn.prepareStatement(sqlSize);
//                psSize.setObject(1, entity.getSize().getSize());
//                psSize.setObject(2, entity.getSize().getId());
//                int size = psSize.executeUpdate();
//                //
//                String sqlHang = """
//                     UPDATE    Hang
//                                        SET             Ten =?
//                                        WHERE ID = ?
//                    """;
//                PreparedStatement psHang = cn.prepareStatement(sqlHang);
//                psHang.setObject(1, entity.getHang().getTen());
//                psHang.setObject(2, entity.getHang().getId());
//                int hang = psHang.executeUpdate();
//                //
//                String sqlMS = """
//                   UPDATE    MauSac
//                                       SET             TenMau =?
//                                       WHERE ID = ?
//                    """;
//                PreparedStatement psMS = cn.prepareStatement(sqlMS);
//                psMS.setObject(1, entity.getMauSac().getTenMau());
//                psMS.setObject(2, entity.getMauSac().getId());
//                int ms = psMS.executeUpdate();
//                //
//                Random random = new Random();
//                int IntMaSP = random.nextInt(100000);
//                String maSP = "SP" + IntMaSP;
//                String sqlSP = """
//                    UPDATE    SanPham
//                                        SET             Ten =?
//                                         WHERE ID =?
//                    """;
//                PreparedStatement psSP = cn.prepareStatement(sqlSP);
//                psSP.setObject(1, entity.getSp().getTen());
//                psSP.setObject(2, entity.getSp().getId());
//                int sp = psSP.executeUpdate();
//            }
//            if (dg > 0 && cl > 0 && ms > 0 && hang > 0 && sp > 0 && size > 0) {
//                ResultSet rsCL = psCL.getGeneratedKeys();
//                ResultSet rsDG = psDG.getGeneratedKeys();
//                ResultSet rsHang = psHang.getGeneratedKeys();
//                ResultSet rsMS = psMS.getGeneratedKeys();
//                ResultSet rsSP = psSP.getGeneratedKeys();
//                ResultSet rsSize = psSize.getGeneratedKeys();
//                if (rsCL.next() && rsDG.next() && rsHang.next() && rsSP.next() && rsMS.next() && rsSize.next()) {
//                    int idHang = rsHang.getInt(1);
//                    int idDG = rsDG.getInt(1);
//                    int idCL = rsCL.getInt(1);
//                    int idSP = rsSP.getInt(1);
//                    int idMS = rsMS.getInt(1);
//                    int idSize = rsSize.getInt(1);
//                    Random random1 = new Random();
//                    int Id = random.nextInt(100000);
//                    String maCTSP = "CTSP" + IntMaSP;
//                    String sql = """
//                         UPDATE    SanPhamChiTiet
//                         SET             ID_SanPham =?, ID_MauSac =?, ID_Size =?, ID_Hang =?, ID_ChatLieu =?, ID_DeGiay =?, MoTa =?, Gia =?, SoLuongTon =?, TrangThai ='Active', create_at = GETDATE(), create_by ='NV001', update_at =GETDATE(), update_by ='NV001'
//                         WHERE ID = ?
//                         """;
//                    ps = cn.prepareStatement(sql);
//                    ps.setObject(1, idSP);
//                    ps.setObject(2, idMS);
//                    ps.setObject(3, idSize);
//                    ps.setObject(4, idHang);
//                    ps.setObject(5, idCL);
//                    ps.setObject(6, idDG);
//                    ps.setObject(7, entity.getMoTa());
//                    ps.setObject(8, entity.getGia());
//                    ps.setObject(9, entity.getSoLuongTon());
//                    ps.setObject(10, maCTSP);
//
//                    int insert = ps.executeUpdate();
//
//                }

////            }
//            cn.commit();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // Rollback nếu có lỗi
//            try {
//                if (cn != null) {
//                    cn.rollback();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        } finally {
//            // Giải phóng tài nguyên
//            try {
//                if (ps != null) {
//                    ps.close();
//                }
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        update = 0;
        String sql = """
                        UPDATE    SanPhamChiTiet
                        SET             ID_MauSac =?, ID_Size =?, ID_Hang =?, ID_ChatLieu =?,
                     ID_DeGiay =?, MoTa =?, Gia =?, SoLuongTon =?
                        WHERE MaSPCT = ?
                        """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setObject(1, entity.getMauSac().getId());
            ps.setObject(2, entity.getSize().getId());
            ps.setObject(3, entity.getHang().getId());
            ps.setObject(4, entity.getChatLieu().getId());
            ps.setObject(5, entity.getDeGiay().getId());
            ps.setObject(6, entity.getMoTa());
            ps.setObject(7, entity.getGia());
            ps.setObject(8, entity.getSoLuongTon());
            ps.setObject(9, entity.getMaCTSP());
            update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String key) {
        delete = 0;
        String sql = """
                    UPDATE    SanPhamChiTiet
                                        SET             deleted =1
                                         WHERE MaSPCT LIKE ?
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, key);

            delete = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void khoiPhuc(String key) {
        delete = 0;
        String sql = """
                    UPDATE    SanPhamChiTiet
                    SET             deleted =0
                     WHERE MaSPCT LIKE ?
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, key);

            delete = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<SanPhamChiTiet> selectAll() {
        ArrayList<SanPhamChiTiet> listSPCT = new ArrayList<>();
        String sql = """
                    select spct.ID, spct.MaSPCT, spct.ID_SanPham, sp.Ten, spct.ID_MauSac,
                    	ms.TenMau,spct.ID_Size, s.Size, spct.ID_Hang, h.Ten, spct.ID_ChatLieu ,cl.TenChatLieu,spct.ID_DeGiay , dg.Ten,spct.SoLuongTon,spct.MoTa
                     ,spct.Gia,spct.TrangThai,spct.deleted,spct.create_at,spct.update_at
                    from SanPhamChiTiet spct join SanPham sp ON sp.ID = spct.ID_SanPham
                     join MauSac ms on ms.ID = spct.ID_MauSac
                     join Size s on s.ID = spct.ID_Size
                     join Hang h on h.ID = spct.ID_Hang
                     join ChatLieu cl on cl.ID = spct.ID_ChatLieu
                     join DeGiay dg on dg.ID = spct.ID_DeGiay                                  
                         ORDER BY create_at DESC
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String maCTSP = rs.getString(2);
                int idSP = rs.getInt(3);
                String tenSP = rs.getString(4);
                int idms = rs.getInt(5);
                String tenMS = rs.getString(6);
                int idSize = rs.getInt(7);
                int Tensize = rs.getInt(8);
                int idHang = rs.getInt(9);
                String tenHang = rs.getString(10);
                int idCL = rs.getInt(11);
                String tenCL = rs.getString(12);
                int idDG = rs.getInt(13);
                String tenDe = rs.getString(14);
                int gia = rs.getInt("Gia");
                String mota = rs.getString("MoTa");
                int soLuongTon = rs.getInt("SoLuongTon");
                String trangThai = rs.getString(18);
                boolean deleted = rs.getBoolean(19);
                Date createAt = rs.getDate(20);
                Date updateAt = rs.getDate(21);

                SanPham sp = new SanPham();
                sp.setTen(tenSP);
//                    sp.setMaSP(maSP);
                MauSac ms = new MauSac();
                ms.setId(idms);
                ms.setTenMau(tenMS);
                Size size = new Size();
                size.setId(idSize);
                size.setSize(Tensize);
                HangGiay hg = new HangGiay();
                hg.setId(idHang);
                hg.setTen(tenHang);
                ChatLieu cl = new ChatLieu();
                cl.setId(idCL);
                cl.setTenChatLieu(tenCL);
                DeGiay dg = new DeGiay();
                dg.setId(idDG);
                dg.setTen(tenDe);
                SanPhamChiTiet spct = new SanPhamChiTiet(id, sp, ms, size, hg, cl, dg, maCTSP, gia, mota, soLuongTon, trangThai, createAt, updateAt, deleted);
//                SanPhamChiTiet spct = new SanPhamChiTiet(sp, ms, size, hg, cl, dg, maCTSP, gia, mota, soLuongTon);
                listSPCT.add(spct);
            }
            return listSPCT;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<SanPhamChiTiet> selectById(String key) {
        ArrayList<SanPhamChiTiet> listSPCT = new ArrayList<>();
        String sql = """
                    select spct.ID, spct.MaSPCT, spct.ID_SanPham, sp.Ten, spct.ID_MauSac,
                    	ms.TenMau,spct.ID_Size, s.Size, spct.ID_Hang, h.Ten, spct.ID_ChatLieu ,cl.TenChatLieu,spct.ID_DeGiay , dg.Ten,spct.SoLuongTon,spct.MoTa
                     ,spct.Gia,spct.TrangThai,spct.deleted,spct.create_at,spct.update_at
                    from SanPhamChiTiet spct join SanPham sp ON sp.ID = spct.ID_SanPham
                     join MauSac ms on ms.ID = spct.ID_MauSac
                     join Size s on s.ID = spct.ID_Size
                     join Hang h on h.ID = spct.ID_Hang
                     join ChatLieu cl on cl.ID = spct.ID_ChatLieu
                     join DeGiay dg on dg.ID = spct.ID_DeGiay
                                    WHERE sp.MaSP LIKE ?
                         ORDER BY create_at DESC
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setObject(1, key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String maCTSP = rs.getString(2);
                int idSP = rs.getInt(3);
                String tenSP = rs.getString(4);
                int idms = rs.getInt(5);
                String tenMS = rs.getString(6);
                int idSize = rs.getInt(7);
                int Tensize = rs.getInt(8);
                int idHang = rs.getInt(9);
                String tenHang = rs.getString(10);
                int idCL = rs.getInt(11);
                String tenCL = rs.getString(12);
                int idDG = rs.getInt(13);
                String tenDe = rs.getString(14);
                int gia = rs.getInt("Gia");
                String mota = rs.getString("MoTa");
                int soLuongTon = rs.getInt("SoLuongTon");
                String trangThai = rs.getString(18);
                boolean deleted = rs.getBoolean(19);
                Date createAt = rs.getDate(20);
                Date updateAt = rs.getDate(21);

                SanPham sp = new SanPham();
                sp.setTen(tenSP);
//                    sp.setMaSP(maSP);
                MauSac ms = new MauSac();
                ms.setId(idms);
                ms.setTenMau(tenMS);
                Size size = new Size();
                size.setId(idSize);
                size.setSize(Tensize);
                HangGiay hg = new HangGiay();
                hg.setId(idHang);
                hg.setTen(tenHang);
                ChatLieu cl = new ChatLieu();
                cl.setId(idCL);
                cl.setTenChatLieu(tenCL);
                DeGiay dg = new DeGiay();
                dg.setId(idDG);
                dg.setTen(tenDe);
                SanPhamChiTiet spct = new SanPhamChiTiet(id, sp, ms, size, hg, cl, dg, maCTSP, gia, mota, soLuongTon, trangThai, createAt, updateAt, deleted);
//                SanPhamChiTiet spct = new SanPhamChiTiet(sp, ms, size, hg, cl, dg, maCTSP, gia, mota, soLuongTon);
                listSPCT.add(spct);

            }

            return listSPCT;

        } catch (Exception e) {
            System.out.println("catch " + key);
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected ArrayList<SanPhamChiTiet> selectBySQL(String sql, Object... args) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
