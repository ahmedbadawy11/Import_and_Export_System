/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package import_and_export_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class Finish extends javax.swing.JPanel {

    /**
     * Creates new form Finish
     */
    public Finish() {
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

        jPanel1 = new javax.swing.JPanel();
        id_case = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Finish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        hour = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_case.setBackground(new java.awt.Color(0, 102, 204));
        id_case.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_case.setForeground(new java.awt.Color(255, 255, 255));
        id_case.setBorder(null);
        id_case.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(id_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 280, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 280, 10));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ID Case :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 20));

        id.setBackground(new java.awt.Color(0, 102, 204));
        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(null);
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 204, 153));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 10));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("ID Maneger  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        Finish.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        Finish.setForeground(new java.awt.Color(255, 153, 0));
        Finish.setText("Finish");
        Finish.setBorder(null);
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });
        jPanel1.add(Finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 280, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 20, -1, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 174, -1, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Date & Time assign :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 20));

        year.setBackground(new java.awt.Color(0, 102, 204));
        year.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setBorder(null);
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 40, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("/");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        month.setBackground(new java.awt.Color(0, 102, 204));
        month.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setBorder(null);
        month.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 20, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("/");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setText("Time:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, -1));

        day.setBackground(new java.awt.Color(0, 102, 204));
        day.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setBorder(null);
        day.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 30, 30));

        hour.setBackground(new java.awt.Color(0, 102, 204));
        hour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hour.setForeground(new java.awt.Color(255, 255, 255));
        hour.setBorder(null);
        hour.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 30, 30));

        min.setBackground(new java.awt.Color(0, 102, 204));
        min.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setBorder(null);
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 40, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 204, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 220, 10, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=Export_And_Import;user=admin;password=1111";
            Connection con= DriverManager.getConnection(connectionURL);
            //Statement stat=con.createStatement();
            String interstring="Select * from CASES_  where Id_Case=? and Id_manager=?";
            PreparedStatement pst=con.prepareStatement(interstring);
            pst.setInt(1,Integer.valueOf(id_case.getText()));
            pst.setInt(2,Integer.valueOf(id.getText()));
            
             ResultSet rs=pst.executeQuery();
           if(rs.next()){
               String inter="INSERT INTO Finish_( Id_finish) Values (?)";
            PreparedStatement pest=con.prepareStatement(inter);
            pest.setInt(1,Integer.valueOf(id_case.getText()));
            ResultSet res=pest.executeQuery();
            JOptionPane.showMessageDialog(null,"finish matched");
                
            }
           else{
             JOptionPane.showMessageDialog(null,"case not matched");

           }
            // JOptionPane.showMessageDialog(null,"Manager added");
            con.close();
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e.toString());

        }
    }//GEN-LAST:event_FinishActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finish;
    private javax.swing.JTextField day;
    private javax.swing.JTextField hour;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_case;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField min;
    private javax.swing.JTextField month;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
