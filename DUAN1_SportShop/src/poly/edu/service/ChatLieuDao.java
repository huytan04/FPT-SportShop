/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import poly.edu.Model.ChatLieu;
import poly.edu.uitility.DBcontext;

/**
 *
 * @author Admin
 */
public class ChatLieuDao extends EduSysDAO<ChatLieu, String> {

    private Integer insert;
    private Integer update;
    private Integer delete;

    @Override
    public void insert(ChatLieu entity) {
        insert = 0;
        String sql = """
                    INSERT INTO ChatLieu
                                          ( TrangThai, TenChatLieu, create_at, create_by, update_at, update_by, deleted)
                    VALUES    (?,?,?,?,?,?,?)
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setObject(1, entity.getTrangThai());
            ps.setObject(2, entity.getTenChatLieu());
            ps.setObject(3, entity.getCreateAt());
            ps.setObject(4, entity.getCreateBy());
            ps.setObject(5, entity.getUpdateAt());
            ps.setObject(6, entity.getUpdateBy());
            ps.setObject(7, entity.isDeleted());
            insert = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ChatLieu entity) {
        update = 0;
        String sql = """
                    UPDATE    ChatLieu
                    SET             TrangThai =?, TenChatLieu =?, create_at =?, create_by =?, update_at =?, update_by =?, deleted =?
                    WHERE ID = ?
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(8, entity.getId());
            ps.setObject(1, entity.getTrangThai());
            ps.setObject(2, entity.getTenChatLieu());
            ps.setObject(3, entity.getCreateAt());
            ps.setObject(4, entity.getCreateBy());
            ps.setObject(5, entity.getUpdateAt());
            ps.setObject(6, entity.getUpdateBy());
            ps.setObject(7, entity.isDeleted());
            update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String key) {
        delete = 0;
        String sql = """
                    UPDATE ChatLieu SET  TrangThai = 1 WHERE ID = ?
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, key);

            delete = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<ChatLieu> selectAll() {
        ArrayList<ChatLieu> listCD = new ArrayList<>();
        String sql = """
                    select * from ChatLieu
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String tenChatLieu = rs.getString("TenChatLieu");
                String trangThai = rs.getString("TrangThai");
                Date createAt = rs.getDate("CreateAt");
                int createBy = rs.getInt("CreateBy");
                Date updateAt = rs.getDate("UpdateAt");
                int updateBy = rs.getInt("UpdateBy");
                boolean deleted = rs.getBoolean("is_deleted");

                ChatLieu chatLieu = new ChatLieu(id, tenChatLieu, trangThai, createAt, createBy, updateAt, updateBy, deleted);
                listCD.add(chatLieu);
            }
            return listCD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChatLieu selectById(String key) {
        ChatLieu cl =null;
        String sql = "SELECT * FROM ChatLieu WHERE ID = ?";
    try (Connection cn = DBcontext.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql)) {
        ps.setString(1, key);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("ID");
            String tenChatLieu = rs.getString("TenChatLieu");
            String trangThai = rs.getString("TrangThai");
            Date createAt = rs.getDate("CreateAt");
            int createBy = rs.getInt("CreateBy");
            Date updateAt = rs.getDate("UpdateAt");
            int updateBy = rs.getInt("UpdateBy");
            boolean deleted = rs.getBoolean("is_deleted");

            cl = new ChatLieu(id, tenChatLieu, trangThai, createAt, createBy, updateAt, updateBy, deleted);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cl;
    }

    @Override
    protected ArrayList<ChatLieu> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
