package parkir;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import parkir.conek;
import java.util.Date;
import java.text.SimpleDateFormat;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;



public class Kmasuk extends javax.swing.JFrame {
    public Kmasuk() {
       initComponents();
       Date now = new Date();
        SimpleDateFormat frm = new SimpleDateFormat("hh:mm:ss");
        String tgl = frm.format(now);
        jTextField2.setText(tgl);
       tampil();
       tampiljenis();
       jTextField5.setText("A");
       kuota();
       lahan();
       lahan1(1,0);
        jTextField2.setEnabled(false);
       jTextField3.setEnabled(false);
       jTextField4.setEnabled(false);
       jTextField5.setEnabled(false);
    }
  public Connection conn;
   public java.sql.Statement cn;
   public Menu form;
   
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkir","root","");
            cn=conn.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
            System.out.println(e.getMessage());
        }
    }
public void tampil(){
    try{
      Statement statement= (Statement) conek.GetConnection().createStatement();
      ResultSet res=statement.executeQuery("select * from tblpetugas");
       while(res.next())
      {
          jTextField3.setText(res.getString("idpetugas"));
         
      }
    } catch (Exception e){
          JOptionPane.showMessageDialog(rootPane, "Salah");
      } 
}
public void tampiljenis(){
    try{
      Statement statement= (Statement) conek.GetConnection().createStatement();
      ResultSet res=statement.executeQuery("select * from tbljnskendaraan");
       while(res.next())
      {
          jComboBox1.addItem(res.getString("kodejenis"));
         
      }
    } catch (Exception e){
          JOptionPane.showMessageDialog(rootPane, "Salah");
      } 
}
public void kuota(){
     try{
      Statement statement= (Statement) conek.GetConnection().createStatement();
      ResultSet res=statement.executeQuery("select * from kuota");
       while(res.next())
      {
          jTextField4.setText(res.getString("kouta"));
      }
    } catch (Exception e){
          JOptionPane.showMessageDialog(rootPane, "Salah");
      } 
}


public void BersihData(){
        jTextField1.setText("");
        
        }
        public void SetEditOff(){
        jTextField1.setEnabled(false);
        }
        public void SetEditOn(){
        jTextField1.setEnabled(true);
        }
    public void lahan1(int c, int d){
        d= 1;
        c= Integer.parseInt(jTextField4.getText())-d;
            try {
              Statement statement= (Statement) conek.GetConnection().createStatement();
              statement.executeUpdate("update kuota set kouta='"+c+"'where id='"+jTextField5.getText()+"'");
              statement.close();
            }
            catch(Exception t){
                 JOptionPane.showMessageDialog(null, "gagal disimpan");
            }
            BersihData();
    }
    public void lahan(){
        int c= Integer.parseInt(jTextField4.getText())+1;
      try {
              Statement statement= (Statement) conek.GetConnection().createStatement();
              statement.executeUpdate("update kuota set kouta='"+c+"'where id='"+jTextField5.getText()+"'");
              statement.close();
            }
            catch(Exception t){
                 JOptionPane.showMessageDialog(null, "gagal disimpan");
            }
            BersihData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kendaraan Masuk");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("No. Plat Polisi :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Jam Masuk :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Jenis Kendaraan :");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ID Petugas             :");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Lokasi                     :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Sisa Tempat Parkir :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jTextField4))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton5.setText("Print Karcis");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Menu().show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BersihData();
        jTextField1.requestFocus();
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String KJ=jTextField1.getText();
        String J=jTextField2.getText();
        String T=jTextField3.getText();
        int kuota= Integer.parseInt(jTextField4.getText());
        String IDP=jComboBox1.getSelectedItem().toString();
        //if(kuota<0){
        //JOptionPane.showMessageDialog(null, "Kouta Parkir Sudah Habis");
        //}
        {       
        if ((KJ.isEmpty()) | (J.isEmpty()) |(T.isEmpty()))
            {JOptionPane.showMessageDialog(null,"data tidak boleh kosong, silahkan dilengkapi");
            jTextField1.requestFocus();
        }else {
            try {
              Statement statement= (Statement) conek.GetConnection().createStatement();
              statement.executeUpdate("insert into km set nplat='"+jTextField1.getText()+"', "
              + "jmask='"+jTextField2.getText()+"', idpetugas='"+jTextField3.getText()+"', "
              + "kodejenis='"+IDP+"'");
              statement.close();
              lahan1(1, 0);
              JOptionPane.showMessageDialog(null, "berhasil disimpan");
            }
            catch(Exception t){
                 JOptionPane.showMessageDialog(null, "gagal disimpan");
            }
            BersihData();
            
            kuota();
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String KJ=jTextField1.getText();
        String J=jTextField2.getText();
        String T=jTextField3.getText();
        if ((KJ.isEmpty()) | (J.isEmpty()) |(T.isEmpty()))
            {JOptionPane.showMessageDialog(null,"data tidak boleh kosong, silahkan dilengkapi");
            jTextField1.requestFocus();
            }
        else{ 
            try {
              Statement statement= (Statement) conek.GetConnection().createStatement();
              statement.executeUpdate("DELETE from km where nplat=('"+jTextField1.getText()+"');");
              lahan();
              JOptionPane.showMessageDialog(null, "berhasil dihapus");
                jTextField1.setText("");
                jTextField1.requestFocus();
            }
            catch(Exception t){
                 JOptionPane.showMessageDialog(null, "gagal dihapus");
            }
        }
         kuota();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
       try {
            koneksi();   
           JasperDesign JasDes = JRXmlLoader.load("C:\\Users\\Ihsan-450\\Documents\\NetBeansProjects\\Parkir\\src\\parkir\\karcis.jrxml");
           HashMap param = new HashMap();
           param.put("plat", this.jTextField1.getText() );
           JasperReport JasRep = JasperCompileManager.compileReport(JasDes);
           JasperPrint jasPri = JasperFillManager.fillReport(JasRep, param, conn);
           JRViewer jv = new JRViewer(jasPri);
           JFrame jf = new JFrame();
           jf.getContentPane().add(jv);
           jf.validate();
           jf.setVisible(true);
           jf.setSize(new Dimension (800, 600));
           jf.setLocation(300, 100);
           jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_jButton5MouseClicked
public void runReportDefault(String sourcefilename, HashMap hash) {
        koneksi();
        try {
            InputStream report;
            report = getClass().getResourceAsStream(sourcefilename);
            JasperPrint jprint = JasperFillManager.fillReport(report, hash, conn);
            koneksi();
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
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
            java.util.logging.Logger.getLogger(Kmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kmasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kmasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
