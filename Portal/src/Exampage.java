
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Exampage extends javax.swing.JFrame {
    
    int TotQue = 6;
    String[][] QueSet;
    String[] Ans = new String[TotQue];
    
    int i = 0;

      public Exampage() {
        initComponents();
       for(int j=0; j<TotQue; j++)
       {
           Ans[j] = " ";
           
       }
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/kartik","root","");
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from questionset");
           
             while(rs.next())
                {
                         QueSet[i][0] = rs.getString(1);
                         QueSet[i][1] = rs.getString(2);
                         QueSet[i][2] = rs.getString(3);
                         QueSet[i][3] = rs.getString(4);
                         QueSet[i][4] = rs.getString(5);
                         QueSet[i][5] = rs.getString(6);
                         QueSet[i][6] = rs.getString(7);
                         
                         i++;
                 }
             
                 i=0;
                 lblque.setText(QueSet[i][0]);
                 txtquestion.setText(QueSet[i][1]);
                 rbdoption1.setText(QueSet[i][2]);
                 rbdoption2.setText(QueSet[i][3]);
                 rbdoption3.setText(QueSet[i][4]);
                 rbdoption4.setText(QueSet[i][5]);             
            }
             
             catch(Exception e)
             {
                 System.out.println(e);
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

        options = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtquestion = new javax.swing.JTextArea();
        rbdoption1 = new javax.swing.JRadioButton();
        rbdoption2 = new javax.swing.JRadioButton();
        rbdoption3 = new javax.swing.JRadioButton();
        rbdoption4 = new javax.swing.JRadioButton();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        lblwelcome = new javax.swing.JLabel();
        lbllogintime = new javax.swing.JLabel();
        lblcounterclock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 560));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        lblque.setText("Que no. ");
        jPanel1.add(lblque);
        lblque.setBounds(7, 7, 46, 16);

        txtquestion.setColumns(20);
        txtquestion.setRows(5);
        jScrollPane1.setViewportView(txtquestion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(59, 7, 726, 142);

        options.add(rbdoption1);
        rbdoption1.setText("option 1");
        rbdoption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdoption1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbdoption1);
        rbdoption1.setBounds(59, 208, 70, 18);

        options.add(rbdoption2);
        rbdoption2.setText("option 2");
        rbdoption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdoption2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbdoption2);
        rbdoption2.setBounds(59, 244, 66, 18);

        options.add(rbdoption3);
        rbdoption3.setText("option 3");
        rbdoption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdoption3ActionPerformed(evt);
            }
        });
        jPanel1.add(rbdoption3);
        rbdoption3.setBounds(59, 280, 66, 18);

        options.add(rbdoption4);
        rbdoption4.setText("option 4");
        rbdoption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdoption4ActionPerformed(evt);
            }
        });
        jPanel1.add(rbdoption4);
        rbdoption4.setBounds(59, 316, 66, 18);

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(70, 368, 120, 40);

        btnnext.setBackground(new java.awt.Color(102, 255, 102));
        btnnext.setForeground(new java.awt.Color(51, 0, 51));
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext);
        btnnext.setBounds(680, 368, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 100, 820, 450);

        lblwelcome.setText("Welcome,User");
        getContentPane().add(lblwelcome);
        lblwelcome.setBounds(20, 10, 110, 16);

        lbllogintime.setText("Login time");
        getContentPane().add(lbllogintime);
        lbllogintime.setBounds(300, 10, 90, 16);

        lblcounterclock.setText("Counter clock");
        getContentPane().add(lblcounterclock);
        lblcounterclock.setBounds(570, 10, 110, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbdoption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdoption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdoption1ActionPerformed

    private void rbdoption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdoption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdoption2ActionPerformed

    private void rbdoption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdoption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdoption3ActionPerformed

    private void rbdoption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdoption4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdoption4ActionPerformed
           
    private void loadoptions()
    {
        if(Ans[i].equals(""))
        {
            rbdextra.setSelected(true);
        }
        else
        {
            if(Ans[i].equals(rbdoption1.getText()))
                    {
                        rbdoption1.setSelected(true);
                    }
            else if(Ans[i].equals(rbdoption2.getText()))
                    {
                        rbdoption2.setSelected(true); 
                    }
            else if(Ans[i].equals(rbdoption3.getText()))
                    {
                        rbdoption3.setSelected(true); 
                    }
            else if(Ans[i].equals(rbdoption4.getText()))
                    {
                        rbdoption4.setSelected(true); 
                    }
        }
    }
    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(i< TotQue-10)
        {
            i++;
                    
            lblque.setText(QueSet[i][0]);
            txtquestion.setText(QueSet[i][1]);
            rbdoption1.setText(QueSet[i][2]);
            rbdoption2.setText(QueSet[i][3]);
            rbdoption3.setText(QueSet[i][4]);
            rbdoption4.setText(QueSet[i][5]);
            
        }
        loadoptions();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        if(i>0)
        {
            i--;
            
             lblque.setText(QueSet[i][0]);
            txtquestion.setText(QueSet[i][1]);
            rbdoption1.setText(QueSet[i][2]);
            rbdoption2.setText(QueSet[i][3]);
            rbdoption3.setText(QueSet[i][4]);
            rbdoption4.setText(QueSet[i][5]);

            
        }
        loadoptions();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Exampage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exampage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exampage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exampage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exampage().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcounterclock;
    private javax.swing.JLabel lbllogintime;
    private javax.swing.JLabel lblque;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.ButtonGroup options;
    private javax.swing.JRadioButton rbdoption1;
    private javax.swing.JRadioButton rbdoption2;
    private javax.swing.JRadioButton rbdoption3;
    private javax.swing.JRadioButton rbdoption4;
    private javax.swing.JTextArea txtquestion;
    // End of variables declaration//GEN-END:variables

   

    
}
