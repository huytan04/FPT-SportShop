package poly.edu.View;


import org.jdesktop.animation.timing.Animator;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import poly.edu.Model.modelMenu;

import javax.swing.Timer;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import poly.edu.Panels.DonHangForm;
import poly.edu.Panels.KhachHangForm;

import poly.edu.Panels.Menu;
import poly.edu.Panels.NhanVienForm;
import poly.edu.Panels.SanPhamForm;
import poly.edu.Panels.TaiKhoanForm;
import poly.edu.Panels.ThongKeForm;
import poly.edu.Panels.VoucherForm;
import poly.edu.event.EventMenuSelected;
import raven.crazypanel.MigLayoutConstraints;

public class Main extends javax.swing.JFrame {

    private Menu menu = new Menu();
    private JPanel main = new JPanel();
    private MigLayout layout;
    private Animator animator;
    private boolean menuShow;
    private Timer timer;
    
    public Main() {
        initComponents();
        init();
    }

    private void init() {

        layout = new MigLayout("fill", "0[]10[]0", "0[fill]0");
        body.setLayout(layout);
        main.setOpaque(false);
        main.setLayout(new BorderLayout());
        menu.addEventLogout(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDangXuat();
                }
        });
        menu.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    animator.start();

                }
            }
        });
        menu.setEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if(index ==0){
                    showForm(new TaiKhoanForm());
                }else if(index==1){
                    showForm(new TaiKhoanForm());
                }
                else if(index ==2){
                    showForm(new SanPhamForm());
                }else if(index==3){
                    showForm(new NhanVienForm());
                }else if(index==4){
                    showForm(new KhachHangForm());
                }else if(index==5){
                    showForm(new ThongKeForm());
                }else if(index==6){
                    showForm(new DonHangForm());
                }else if(index==7){
                    showForm(new VoucherForm());
                }
                }
        });
        menu.addMenu(new modelMenu("Bán hàng", new ImageIcon(getClass().getResource("/icon/banhang.png"))));
        menu.addMenu(new modelMenu("Tài Khoản", new ImageIcon(getClass().getResource("/icon/MaleUser.png"))));
        menu.addMenu(new modelMenu("Sản Phẩm", new ImageIcon(getClass().getResource("/icon/Sneaker1.png"))));
        menu.addMenu(new modelMenu("Nhân Viên", new ImageIcon(getClass().getResource("/icon/Agent.png"))));
        menu.addMenu(new modelMenu("Khách hàng", new ImageIcon(getClass().getResource("/icon/khachhang.png"))));
        menu.addMenu(new modelMenu("Thống Kê", new ImageIcon(getClass().getResource("/icon/thongke.png"))));
        menu.addMenu(new modelMenu("Đơn Hàng", new ImageIcon(getClass().getResource("/icon/Order.png"))));
        menu.addMenu(new modelMenu("Voucher", new ImageIcon(getClass().getResource("/icon/Voucher.png"))));
        
        body.add(menu, "w 50!");
        body.add(main, "w 100%");
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menuShow) {
                    width = 50 + (150 * (1f - fraction));
                    menu.setAlpha( 1f - fraction);
                } else {
                    width = 50 + (150 * fraction);
                    menu.setAlpha(fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!");
                body.revalidate();
            }   

            @Override
            public void end() {
                menuShow =!menuShow;
            }
            
        };

        animator = new Animator(400, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
//        showForm(new TaiKhoanForm());


    }
    private void showForm(Component com){
        main.removeAll();
        main.add(com);
        main.repaint();
        main.revalidate();
    }
   void openDangXuat() {
    // Auth.clear(); // Assuming this is not relevant for the current functionality
    Login loginDialog = new Login(this, true);
    
    // Set a window listener to perform actions when the Login window is closed
    loginDialog.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            // This code will be executed when the Login window is closed
            // You can add any additional actions needed here
            // For example, you might want to show the main window or perform other tasks
            setVisible(true); // Show the main window
        }
    });

    loginDialog.setVisible(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();

        setUndecorated(true);

        body.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1208, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}
