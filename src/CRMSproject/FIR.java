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
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj
 */
public class FIR extends javax.swing.JFrame {
private Connection con;
    ResultSet rs;
    Statement s;
    /**
     * Creates new form FIR
     */
    public FIR() {
        initComponents();
         String date=String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1)+"-"+String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
         jTextField4.setText(date);
            jTextField4.setEditable(false);
            //String time=String.valueOf(Calendar.getInstance().get(Calendar.))
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        addbutton2 = new javax.swing.JButton();
        savebutton2 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criminal Record Management System");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FIR ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 138, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 96, 120, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(47, 130, 120, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date Lodged");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 162, 120, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Time Lodged");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 195, 120, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Incident Place");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(47, 226, 120, 26);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Incident Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(47, 258, 120, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Incident Time");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(47, 289, 120, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Details");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(47, 320, 120, 24);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(196, 63, 168, 27);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(196, 96, 168, 28);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(196, 130, 168, 26);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(196, 162, 168, 27);

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(196, 195, 168, 25);

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(196, 226, 168, 26);

        jTextField7.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(196, 258, 168, 25);

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(196, 289, 168, 25);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(196, 320, 166, 87);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("FIR Records");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(156, 0, 265, 45);

        addbutton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbutton2.setText("Add");
        addbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(addbutton2);
        addbutton2.setBounds(140, 490, 100, 30);

        savebutton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savebutton2.setText("Show all");
        savebutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton2);
        savebutton2.setBounds(280, 490, 100, 30);

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setText("Back");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(460, 180, 70, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/satyameva_jayte.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 0, 100, 140);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 490, 80, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRMSproject/ComputerDesktopWallpapersCollection708_108.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 560, 560);

        setSize(new java.awt.Dimension(576, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savebutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebutton2ActionPerformed
        // TODO add your handling code here:
        Retrive_FIR p=new Retrive_FIR();
        p.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_savebutton2ActionPerformed

    private void addbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton2ActionPerformed
        // TODO add your handling code here:
        
         
        try
        {
           
            String x =jTextField1.getText();
            String x1 =jTextField2.getText();
            String x2=jTextField3.getText();
            
            String x3 =jTextField4.getText();
            String x4 =jTextField5.getText();
            String x5 =jTextField6.getText();
            String x6 =jTextField7.getText();
            String x7 =jTextField8.getText();
            String x8=jTextArea1.getText();
            
            
            if(x.length()==0 || x1.length()==0 || x2.length()==0 || x3.length()== 0 || x4.length()==0 || x5.length()==0 || x6.length()==0 || x7.length()==0 || x8.length()==0)
           {
               JOptionPane.showMessageDialog(null,"INCOMPLETE ENTRY!!","ERROR!!",0);
           }
            else
           {
            
            String query ="insert into fir(fir_id,petitioner_name,petitioner_nic,date_lodged,time_lodged,incident_place,incident_date,incident_time,details) values ('"+x+"','"+x1+"','"+x2+"','"+x3+"','"+x4+"','"+x5+"','"+x6+"','"+x7+"','"+x8+"')";
           s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println(query);
            s=con.createStatement();
            s.execute(query);
            jTextField1.setText("");
            int mc= JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(null, "Database Saved!!", "Message", mc);
           } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
           //System.out.println("ERROR!!");
        }
        
    }//GEN-LAST:event_addbutton2ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        Index p=new Index();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String x=jTextField1.getText();
        Retrive_FIR obj = new Retrive_FIR(Integer.parseInt(jTextField1.getText()));
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIR().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton next;
    private javax.swing.JButton savebutton2;
    // End of variables declaration//GEN-END:variables
}
