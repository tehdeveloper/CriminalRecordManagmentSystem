/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CRMSproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj
 */
public class OFFICER_UPDATE extends javax.swing.JFrame {
private Connection con;
    ResultSet rs;
    Statement s;
    /**
     * Creates new form OFFICER_UPDATE
     */
    public OFFICER_UPDATE() {
        initComponents();
        String user = "root";
    String password = "12345";
   String url = "jdbc:mysql://localhost/mydb?user="+user+"&password="+password;
    
         
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url);
            
        } catch (ClassNotFoundException | SQLException ex){
            //Logger.getLogger(CMTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                
            } 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editbutton1 = new javax.swing.JButton();
        deletebutton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criminal Record Management System");
        getContentPane().setLayout(null);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(168, 130, 230, 30);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(168, 190, 230, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DG", "ADG", "IG", "DIG", "SSP", "SP", "ASP", "DSP", "ASP" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 250, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Rank");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 250, 78, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Officer Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 190, 78, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 130, 78, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/satyameva_jayte.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(460, 30, 100, 140);

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("         Welcome to Criminal Record Management Syastem");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 560, 30);

        editbutton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbutton1.setText("Update");
        editbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton1);
        editbutton1.setBounds(170, 430, 100, 30);

        deletebutton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton1.setText("Delete");
        deletebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(deletebutton1);
        deletebutton1.setBounds(280, 430, 90, 30);

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setText("Back");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(440, 260, 65, 25);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/ComputerDesktopWallpapersCollection708_108.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 560, 560);

        setSize(new java.awt.Dimension(576, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void editbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbutton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String x = jTextField3.getText();
            String x1 = jTextField2.getText();
            String x2 = (String) jComboBox1.getSelectedItem();
           // String x3 = jTextField4.getText();
           // String x4 = jtextArea1.getText();
            String query="UPDATE investigation_officer SET name='"+x+"',rank='"+x2+"' where officer_id='"+x1+"';";
            s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Updated!!", "Message", mc);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_editbutton1ActionPerformed

    private void deletebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            //String x = jTextField3.getText();
            String x1 = jTextField2.getText();
           // String x2 = (String) jComboBox1.getSelectedItem();
           // String x3 = jTextField4.getText();
           // String x4 = jtextArea1.getText();
            String query="delete from investigation_officer where officer_id='"+x1+"';";
            s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Entry Deleted!!", "Message", mc);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_deletebutton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        FIR p=new FIR();
        p.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(OFFICER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OFFICER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OFFICER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OFFICER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OFFICER_UPDATE().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebutton1;
    private javax.swing.JButton editbutton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
