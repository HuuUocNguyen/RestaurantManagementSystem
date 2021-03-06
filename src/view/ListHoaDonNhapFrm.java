/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.HoaDonNhapNguyenLieu;
import model.NhaCungCap;

/**
 *
 * @author Hazard
 */
public class ListHoaDonNhapFrm extends javax.swing.JFrame {

    /**
     * Creates new form ListNguyenLieuFrm
     */
    static private ArrayList<NhaCungCap> list1;
    static private ArrayList<HoaDonNhapNguyenLieu> list2;

    public ListHoaDonNhapFrm(ArrayList<NhaCungCap> list1, ArrayList<HoaDonNhapNguyenLieu> list2) {
        this.list1 = list1;
        this.list2 = list2;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListHoaDonNhapTable = new javax.swing.JTable();
        note = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListHoaDonNhapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày nhập", "Tổng số mặt hàng nhập", "Tổng số tiền"
            }
        ));
        ListHoaDonNhapTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListHoaDonNhapTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ListHoaDonNhapTable);

        note.setText("*Click vào 1 dòng để xem chi tiết nhà cung cấp");

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(note))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnQuayLai)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuayLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(note))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        new ListHoaDonNhapFrm(list1, list2).setVisible(false);
        ListNhaCungCapFrm listNhaCungCapFrm = null;
        try {
            listNhaCungCapFrm = new ListNhaCungCapFrm(list1, list2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        listNhaCungCapFrm.show();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void ListHoaDonNhapTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListHoaDonNhapTableAncestorAdded
        // TODO add your handling code here:
        ArrayList<HoaDonNhapNguyenLieu> listHoaDonNhapNguyenLieu = null;
        listHoaDonNhapNguyenLieu = this.list2;
        DefaultTableModel defaultTableModel = (DefaultTableModel) ListHoaDonNhapTable.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < listHoaDonNhapNguyenLieu.size(); i++) {
            row[1] = listHoaDonNhapNguyenLieu.get(i).getTongTien();
            defaultTableModel.addRow(row);
        }
    }//GEN-LAST:event_ListHoaDonNhapTableAncestorAdded

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
            java.util.logging.Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonNhapFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListHoaDonNhapFrm(list1, list2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListHoaDonNhapTable;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel note;
    // End of variables declaration//GEN-END:variables
}
