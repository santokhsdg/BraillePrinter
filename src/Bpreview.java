
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;





public class Bpreview extends javax.swing.JFrame {
   
    int size,Change=0;
    String passedfont,pathname="/home/pi/Desktop/Braille Document/Scripts",datascript;
     PrintingEngine ce=new PrintingEngine();
    
  // Size :Characters in line
    // Change: View in Braille Convertor

   
    public Bpreview() {
        initComponents();
        Change=0;
        TAP1.setFont(new Font((String)Bword1.jComboBox1.getSelectedItem(),Font.PLAIN,Integer.parseInt(Bword1.choice2.getSelectedItem())));
        passedfont=((String)Bword1.jComboBox1.getSelectedItem());
        //TAP1.setEditable(false);
        this.setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("braille.png")) );
    }

    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFP2 = new javax.swing.JTextField();
        TAP2 = new javax.swing.JScrollPane();
        TAP3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAP4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAP1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        TFP1 = new javax.swing.JTextField();
        LP2 = new javax.swing.JLabel();
        LP3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();

        TFP2.setText("jTextField2");
        TFP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFP2ActionPerformed(evt);
            }
        });

        TAP3.setColumns(20);
        TAP3.setRows(5);
        TAP2.setViewportView(TAP3);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TAP4.setColumns(20);
        TAP4.setRows(5);
        jScrollPane2.setViewportView(TAP4);

        jLabel2.setText("jLabel2");

        setTitle("Braille Preview (SK.nif)");
        setMinimumSize(new java.awt.Dimension(800, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Print Preview");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 0, 420, 50);

        TAP1.setColumns(20);
        TAP1.setRows(5);
        jScrollPane1.setViewportView(TAP1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(35, 91, 430, 439);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 340, 80, 30);
        getContentPane().add(TFP1);
        TFP1.setBounds(27, 421, 10, 0);

        LP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LP2.setText("jLabel2");
        getContentPane().add(LP2);
        LP2.setBounds(40, 60, 220, 20);

        LP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LP3.setText("jLabel3");
        getContentPane().add(LP3);
        LP3.setBounds(370, 60, 90, 17);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 42, 810, 0);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(370, 40, 0, 0);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 52, 827, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 548, 827, 3);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 340, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Printer Control & Settings");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 100, 310, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Paper In/Out");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 160, 90, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Load Paper");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 210, 90, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Move Paper Out");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 270, 130, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Status:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 160, 130, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Roll In");
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 210, 90, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Roll Out");
        getContentPane().add(jButton2);
        jButton2.setBounds(640, 270, 90, 31);

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jToggleButton1.setText("View in Braille");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(470, 340, 154, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 92, 820, 10);

        jButton6.setText("Load Language");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(560, 60, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);        
        TAP1.setText("");        
        size=Integer.parseInt(TFP1.getText());
        Bword1.TFW1.setText(""+size);
        this.setVisible(false);
         
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TFP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFP2ActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_TFP2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
             
        
        
        
        
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // print string
        String print;
        print=TAP4.getText();
       TAP1.setText(print);
              
        //JOptionPane.showMessageDialog(this,print);
        //OutputControl6Pin OP= new OutputControl6Pin();
       try{
         // ce.PrintPin1(print);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,"Printing Error:"+e);
                   
                   
       }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        if(Change%2==0)
        {
            TAP1.setFont(new Font ("Braille Normal",Font.PLAIN,Integer.parseInt(Bword1.choice2.getSelectedItem())));
            jToggleButton1.setText("Native View");
        }
        else{
            TAP1.setFont(new Font((String)Bword1.jComboBox1.getSelectedItem(),Font.PLAIN,Integer.parseInt(Bword1.choice2.getSelectedItem())));
            jToggleButton1.setText("View in Braille");
        }
        Change++;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        FileHandling fd= new FileHandling();
        
        datascript=fd.FileOpen(pathname);
        
        ce.Extract(datascript);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Bpreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bpreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bpreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bpreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bpreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LP2;
    public static javax.swing.JLabel LP3;
    public static javax.swing.JTextArea TAP1;
    public static javax.swing.JScrollPane TAP2;
    public static javax.swing.JTextArea TAP3;
    public static javax.swing.JTextArea TAP4;
    public static javax.swing.JTextField TFP1;
    public static javax.swing.JTextField TFP2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
