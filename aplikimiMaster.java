
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class aplikimiMaster extends javax.swing.JFrame {

    /**
     * Creates new form aplikimiMaster
     */
    public aplikimiMaster() {
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

        Titulli = new javax.swing.JLabel();
        txtEmri = new javax.swing.JTextField();
        APLIKO = new javax.swing.JButton();
        gabim = new javax.swing.JLabel();
        emri = new javax.swing.JLabel();
        teDhenatpersonale = new javax.swing.JLabel();
        mbiemri = new javax.swing.JLabel();
        txtMbiemri = new javax.swing.JTextField();
        txtMosha = new javax.swing.JTextField();
        mosha = new javax.swing.JLabel();
        txtKomuna = new javax.swing.JTextField();
        komuna = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPassword1 = new javax.swing.JPasswordField();
        jPassword2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        institucioni = new javax.swing.JLabel();
        fakulteti = new javax.swing.JLabel();
        NotaMesatare = new javax.swing.JLabel();
        txtInstitucioni = new javax.swing.JTextField();
        txtFakulteti = new javax.swing.JTextField();
        txtNotaMesatare = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSpecializimi = new javax.swing.JTextField();
        profilizimi = new javax.swing.JLabel();
        lokacioni = new javax.swing.JLabel();
        txtLokacioni = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        emailgabim = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(1280, 600));
        getContentPane().setLayout(null);

        Titulli.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        Titulli.setText("Aplikimi per Studime Master");
        getContentPane().add(Titulli);
        Titulli.setBounds(390, 20, 450, 50);

        txtEmri.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtEmri);
        txtEmri.setBounds(150, 150, 190, 32);

        APLIKO.setBackground(new java.awt.Color(102, 255, 102));
        APLIKO.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        APLIKO.setForeground(new java.awt.Color(0, 0, 0));
        APLIKO.setText("APLIKO");
        APLIKO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APLIKOActionPerformed(evt);
            }
        });
        getContentPane().add(APLIKO);
        APLIKO.setBounds(1097, 470, 120, 50);

        gabim.setBackground(new java.awt.Color(153, 0, 0));
        gabim.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        gabim.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(gabim);
        gabim.setBounds(430, 490, 440, 40);

        emri.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        emri.setText("Emri:");
        getContentPane().add(emri);
        emri.setBounds(100, 150, 50, 30);

        teDhenatpersonale.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        teDhenatpersonale.setText("Te dhenat personale");
        getContentPane().add(teDhenatpersonale);
        teDhenatpersonale.setBounds(60, 90, 310, 35);

        mbiemri.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        mbiemri.setText("Mbiemri:");
        getContentPane().add(mbiemri);
        mbiemri.setBounds(80, 201, 64, 30);

        txtMbiemri.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtMbiemri);
        txtMbiemri.setBounds(150, 200, 190, 30);

        txtMosha.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        txtMosha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtMosha);
        txtMosha.setBounds(150, 250, 60, 30);

        mosha.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        mosha.setText("Mosha:");
        getContentPane().add(mosha);
        mosha.setBounds(90, 251, 53, 30);

        txtKomuna.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtKomuna);
        txtKomuna.setBounds(150, 300, 190, 30);

        komuna.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        komuna.setText("Komuna:");
        getContentPane().add(komuna);
        komuna.setBounds(80, 301, 65, 30);

        email.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        email.setText("E-mail:");
        getContentPane().add(email);
        email.setBounds(90, 350, 53, 30);

        password.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        password.setText("Password:");
        getContentPane().add(password);
        password.setBounds(70, 401, 77, 30);

        confirmpassword.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        confirmpassword.setText("Confirm password:");
        getContentPane().add(confirmpassword);
        confirmpassword.setBounds(10, 451, 137, 30);

        txtEmail.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(150, 350, 190, 30);

        jPassword1.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(jPassword1);
        jPassword1.setBounds(150, 400, 190, 30);

        jPassword2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword2);
        jPassword2.setBounds(150, 450, 190, 30);

        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel1.setText("Te dhenat e Studimit Bachelor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 90, 440, 42);

        institucioni.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        institucioni.setText("Institucioni:");
        getContentPane().add(institucioni);
        institucioni.setBounds(430, 151, 90, 30);

        fakulteti.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        fakulteti.setText("Fakulteti:");
        getContentPane().add(fakulteti);
        fakulteti.setBounds(440, 201, 77, 30);

        NotaMesatare.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        NotaMesatare.setText("Nota Mesatare:");
        getContentPane().add(NotaMesatare);
        NotaMesatare.setBounds(400, 250, 120, 30);

        txtInstitucioni.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtInstitucioni);
        txtInstitucioni.setBounds(530, 150, 140, 30);

        txtFakulteti.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtFakulteti);
        txtFakulteti.setBounds(530, 200, 140, 30);

        txtNotaMesatare.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtNotaMesatare);
        txtNotaMesatare.setBounds(530, 250, 60, 30);

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel2.setText("Te dhenat per aplikim");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(880, 90, 320, 40);

        txtSpecializimi.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtSpecializimi);
        txtSpecializimi.setBounds(1010, 200, 150, 30);

        profilizimi.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        profilizimi.setText("Profilizimi/Specializimi:");
        getContentPane().add(profilizimi);
        profilizimi.setBounds(820, 200, 180, 30);

        lokacioni.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lokacioni.setText("Lokacioni:");
        getContentPane().add(lokacioni);
        lokacioni.setBounds(920, 250, 80, 30);

        txtLokacioni.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtLokacioni);
        txtLokacioni.setBounds(1010, 250, 150, 30);

        CLEAR.setBackground(new java.awt.Color(204, 0, 0));
        CLEAR.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        CLEAR.setForeground(new java.awt.Color(0, 0, 0));
        CLEAR.setText("ANULO");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR);
        CLEAR.setBounds(947, 470, 120, 50);
        getContentPane().add(emailgabim);
        emailgabim.setBounds(156, 389, 160, 20);

        studentID.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        studentID.setText("Student ID:");
        getContentPane().add(studentID);
        studentID.setBounds(918, 151, 90, 30);

        txtID.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        getContentPane().add(txtID);
        txtID.setBounds(1010, 150, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APLIKOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APLIKOActionPerformed
      String emri = txtEmri.getText();
      String mbiemri = txtMbiemri.getText();
      String mosha = txtMosha.getText();
      String komuna = txtKomuna.getText();
      String email = txtEmail.getText();
      char[] password = jPassword1.getPassword();
      char [] confirm = jPassword2.getPassword();
      String institucioni = txtInstitucioni.getText();
      String fakulteti = txtFakulteti.getText();
      String notamesatare = txtNotaMesatare.getText();
      String profilizimi = txtSpecializimi.getText();
      String lokacioni = txtLokacioni.getText();
      String ID = txtID.getText();
      
      int gjatesia = emri.length();
      int gjatesia2 = mbiemri.length();
      int passi = password.length;
      int passi2 = password.length;
      if(emri.equals("")||mbiemri.equals("")||mosha.equals("")||komuna.equals("")||email.equals("")||confirm.equals("")||password.equals("")||
              institucioni.equals("")||fakulteti.equals("")||notamesatare.equals("")||profilizimi.equals("")
              ||lokacioni.equals("")||ID.equals("")){
          gabim.setText("Njera prej fushave eshte e pa plotesuar.");  
      }
      else if(gjatesia >=1 && gjatesia <=2 || gjatesia2 >=1 && gjatesia2 <=2){
            gabim.setText("Emri dhe Mbiemri duhet te permbaje me shume se dy karaktere");
          }
      else if(Integer.parseInt(mosha) <18){
          gabim.setText("Mosha duhet te jete mbi 18 vjeq");
      }
      else if(!email.endsWith(".com")&&!email.endsWith(".info")||!email.contains("@")){
          gabim.setText("E-mail nuk eshte valid");
      }
      else if(!Arrays.equals(password, confirm)){
            gabim.setText("Passwordat nuk jane identik");
      }
     else if(passi < 8 && passi2 < 8){
            gabim.setText("Passwordi duhet te permbaje me shume se 8 karaktere"); 
      }
     else if(Double.parseDouble(notamesatare) < 8.0 ){
         gabim.setText("Na vjen keq.  Nota mesatare duhet te jete mbi 8.0");
     }
      else {
       gabim.setText(null);
       txtEmri.setText(null);
       txtMbiemri.setText(null);
       txtMosha.setText(null);
       txtKomuna.setText(null);
       txtEmail.setText(null);
       jPassword1.setText(null);
       jPassword2.setText(null);
       txtInstitucioni.setText(null);
       txtFakulteti.setText(null);
       txtNotaMesatare.setText(null);
       txtSpecializimi.setText(null);
       txtLokacioni.setText(null);
       gabim.setText(null);
       txtID.setText(null);
          JOptionPane.showMessageDialog(null,"APLIKIMI U KRYE ME SUKSES");
      }
    }//GEN-LAST:event_APLIKOActionPerformed

    private void jPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword2ActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
       txtEmri.setText(null);
       txtMbiemri.setText(null);
       txtMosha.setText(null);
       txtKomuna.setText(null);
       txtEmail.setText(null);
       jPassword1.setText(null);
       jPassword2.setText(null);
       txtInstitucioni.setText(null);
       txtFakulteti.setText(null);
       txtNotaMesatare.setText(null);
       txtSpecializimi.setText(null);
       txtLokacioni.setText(null);
       gabim.setText(null);
       txtID.setText(null);
    }//GEN-LAST:event_CLEARActionPerformed

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
            java.util.logging.Logger.getLogger(aplikimiMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikimiMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikimiMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikimiMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikimiMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APLIKO;
    private javax.swing.JButton CLEAR;
    private javax.swing.JLabel NotaMesatare;
    private javax.swing.JLabel Titulli;
    private javax.swing.JLabel confirmpassword;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailgabim;
    private javax.swing.JLabel emri;
    private javax.swing.JLabel fakulteti;
    private javax.swing.JLabel gabim;
    private javax.swing.JLabel institucioni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JPasswordField jPassword2;
    private javax.swing.JLabel komuna;
    private javax.swing.JLabel lokacioni;
    private javax.swing.JLabel mbiemri;
    private javax.swing.JLabel mosha;
    private javax.swing.JLabel password;
    private javax.swing.JLabel profilizimi;
    private javax.swing.JLabel studentID;
    private javax.swing.JLabel teDhenatpersonale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmri;
    private javax.swing.JTextField txtFakulteti;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInstitucioni;
    private javax.swing.JTextField txtKomuna;
    private javax.swing.JTextField txtLokacioni;
    private javax.swing.JTextField txtMbiemri;
    private javax.swing.JTextField txtMosha;
    private javax.swing.JTextField txtNotaMesatare;
    private javax.swing.JTextField txtSpecializimi;
    // End of variables declaration//GEN-END:variables
}
