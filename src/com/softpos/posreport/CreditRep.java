package com.softpos.posreport;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import database.MySQLConnect;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.softpos.main.program.POSHWSetup;
import com.softpos.main.program.PPrint;
import com.softpos.main.program.PUtility;
import com.softpos.main.model.PublicVar;
import com.softpos.main.model.Value;
import printReport.PrintDriver;
import util.MSG;

public class CreditRep extends javax.swing.JDialog {

    SimpleDateFormat DatefmtThai = new SimpleDateFormat("dd/MM/yyyy(HH:mm)", Locale.ENGLISH);
    SimpleDateFormat Datefmt = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    SimpleDateFormat ShowDatefmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    DecimalFormat DecFmt = new DecimalFormat("##,###,##0.00");
    DecimalFormat IntFmt = new DecimalFormat("##,###,##0");
    Date date = new Date();
    PPrint prn = new PPrint();
    private POSHWSetup POSHW;
    private String Space = " &nbsp; ";
    private String TAB = Space + Space + Space;

    public CreditRep(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtMacNo1.setText("001");
        txtMacNo2.setText("999");
        txtCashNo1.setText("0000");
        txtCashNo2.setText("9999");

        POSHW = POSHWSetup.Bean(Value.getMacno());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bntOK = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMacNo1 = new javax.swing.JTextField();
        txtMacNo2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCashNo1 = new javax.swing.JTextField();
        txtCashNo2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานการรับชำระด้วยบัตรเครดิต (Credit Report)");
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntOK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntOK.setText("F5- พิมพ์");
        bntOK.setFocusable(false);
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });

        bntExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntExit.setText("ESC- ออก");
        bntExit.setFocusable(false);
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray, 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("หมายเลขเครื่อง");

        txtMacNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMacNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMacNo1KeyPressed(evt);
            }
        });

        txtMacNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMacNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMacNo2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("รหัสพนักงาน");

        txtCashNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashNo1KeyPressed(evt);
            }
        });

        txtCashNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashNo2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMacNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMacNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCashNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCashNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMacNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMacNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCashNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCashNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void txtMacNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMacNo1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtMacNo2.requestFocus();

    }
}//GEN-LAST:event_txtMacNo1KeyPressed

private void txtMacNo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMacNo2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtCashNo1.requestFocus();
    }
}//GEN-LAST:event_txtMacNo2KeyPressed

private void txtCashNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashNo1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtCashNo2.requestFocus();
    }
}//GEN-LAST:event_txtCashNo1KeyPressed

private void txtCashNo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashNo2KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtMacNo1.requestFocus();
    }
}//GEN-LAST:event_txtCashNo2KeyPressed

private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
    bntOKClick();
}//GEN-LAST:event_bntOKActionPerformed

private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
    bntExitClick();
}//GEN-LAST:event_bntExitActionPerformed

    public void bntOKClick() {
        String MacNo1 = txtMacNo1.getText();
        String MacNo2 = txtMacNo2.getText();
        String CashNo1 = txtCashNo1.getText();
        String CashNo2 = txtCashNo2.getText();
        /**
         * * OPEN CONNECTION **
         */
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "delete from tempcredit where terminal='" + Value.MACNO + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        }

        try {
            try (Statement stmt = mysql.getConnection().createStatement()) {
                String SqlQuery = "select B_Refno,B_CrCode1,B_CardNo1,B_AppCode1,B_CrAmt1 "
                        + "from billno "
                        + "where (B_MacNo>='" + MacNo1 + "') "
                        + "and (B_MacNo<='" + MacNo2 + "') "
                        + "and (B_Cashier>='" + CashNo1 + "') "
                        + "and (B_Cashier<='" + CashNo2 + "') "
                        + "and (B_Void<>'V')and (B_CrAmt1<>'0') ";
//                        + "and B_OnDate=curdate() ";
                ResultSet rec = stmt.executeQuery(SqlQuery);
                rec.first();
                if (rec.getRow() == 0) {
                } else {
                    do {
                        String TRefno = rec.getString("B_Refno");
                        String TCrCode = rec.getString("B_CrCode1");
                        String TCrNo = rec.getString("B_CardNo1");
                        String TCrApp = rec.getString("B_AppCode1");
                        Double TCrAmt = rec.getDouble("B_CrAmt1");
                        InsertTemp(TRefno, TCrCode, TCrNo, TCrApp, TCrAmt);
                    } while (rec.next());
                }
                rec.close();
            }
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        }
        if (Value.printdriver) {
            PrintCreditDriver(MacNo1, MacNo1, CashNo1, CashNo2);
        } else {
            if (!Value.getComPort().equals("NONE")) {
                if (prn.OpenPrint(Value.getComPort())) {
                    prn.InitPrinter();
                    prn.print(POSHW.getHeading1());
                    prn.print(POSHW.getHeading2());
                    prn.print(POSHW.getHeading3());
                    prn.print(POSHW.getHeading4());
                    prn.print("REG ID :" + Value.MACNO);
                    prn.print("         รายงานการรับชำระด้วยบัตรเครดิต");
                    prn.print("               (Credit Report)");
                    prn.print("หมายเลขเครื่อง :" + MacNo1 + " ..." + MacNo2);
                    prn.print("รหัสพนักงาน    :" + CashNo1 + " ..." + CashNo2);
                    prn.print(" ");
                    prn.print(DatefmtThai.format(date) + " " + "Cashier:" + PublicVar._User + " Mac:" + Value.MACNO);
                    prn.print("----------------------------------------");
                    prn.print("ประเภทบัตร    ชื่อบัตรเครดิต");
                    prn.print("ลำดับ  หมายเลขบัตร     รหัสอนุมัติ    จำนวนเงิน");
                    prn.print("----------------------------------------");
                    int SumVoid = 0;
                    String TempCr = "";
                    int SumCard = 0;
                    Double SumCardAmt = 0.0;
                    int SumTotal = 0;
                    Double SumTotalAmt = 0.0;
                    try {
                        Statement stmt = mysql.getConnection().createStatement();
                        String SqlQuery = "select *from tempcredit where (terminal='" + Value.MACNO + "') order by crcode";
                        ResultSet rec = stmt.executeQuery(SqlQuery);
                        rec.first();
                        if (rec.getRow() == 0) {
                        } else {
                            prn.print(rec.getString("crcode") + "   " + PUtility.SeekCreditName(rec.getString("crcode")));
                            TempCr = rec.getString("crcode");
                            do {
                                if (!rec.getString("crcode").equals(TempCr)) {
                                    prn.print("       Total Slip " + PUtility.DataFull(IntFmt.format(SumCard), 6) + "    " + PUtility.DataFull(DecFmt.format(SumCardAmt), 11));
                                    prn.print("" + "----------------------------------------");
                                    SumCard = 0;
                                    SumCardAmt = 0.0;
                                    prn.print(rec.getString("crcode") + "   " + PUtility.SeekCreditName(rec.getString("crcode")));
                                    TempCr = rec.getString("crcode");
                                }
                                SumCard++;
                                SumCardAmt = SumCardAmt + rec.getDouble("cramt");
                                SumTotal++;
                                SumTotalAmt = SumTotalAmt + rec.getDouble("cramt");
                                String TempCrId = PUtility.Addzero(rec.getString("crid"), 16);
                                prn.print(PUtility.DataFull(IntFmt.format(SumCard), 5) + "  " + TempCrId.substring(12, 16) + " " + PUtility.DataFullR(rec.getString("crapp"), 6) + PUtility.DataFull(DecFmt.format(rec.getDouble("cramt")), 9));
                            } while (rec.next());
                        }
                        rec.close();
                        stmt.close();
                    } catch (SQLException e) {
                        MSG.ERR(e.getMessage());
                    }
                    if (SumCard > 0) {
                        prn.print("       Total Slip " + PUtility.DataFull(IntFmt.format(SumCard), 6) + "    " + PUtility.DataFull(DecFmt.format(SumCardAmt), 11));
                        prn.print("" + "----------------------------------------");
                    }
                    prn.print("----------------------------------------");
                    prn.print("Sum-Total Slip  " + PUtility.DataFull(IntFmt.format(SumTotal), 6) + "    " + PUtility.DataFull(DecFmt.format(SumTotalAmt), 13));
                    prn.print("----------------------------------------");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print("----------------------------------------");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.CutPaper();
                    prn.closePrint();
                }
            }
        }

        mysql.close();

        txtMacNo1.requestFocus();
    }

    public void PrintCreditDriver(String MacNo1, String MacNo2, String CashNo1, String CashNo2) {
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "delete from tempcredit where terminal='" + Value.MACNO + "'";
            stmt.executeUpdate(SqlQuery);
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        }

        try {
            try (Statement stmt = mysql.getConnection().createStatement()) {
                String SqlQuery = "select B_Refno,B_CrCode1,B_CardNo1,B_AppCode1,B_CrAmt1 "
                        + "from billno "
                        + "where (B_MacNo>='" + MacNo1 + "') "
                        + "and (B_MacNo<='" + MacNo2 + "') "
                        + "and (B_Cashier>='" + CashNo1 + "') "
                        + "and (B_Cashier<='" + CashNo2 + "') "
                        + "and (B_Void<>'V')and (B_CrAmt1<>'0') ";
//                        + "and B_OnDate=curdate() ";
                ResultSet rec = stmt.executeQuery(SqlQuery);
                rec.first();
                if (rec.getRow() == 0) {
                } else {
                    do {
                        String TRefno = rec.getString("B_Refno");
                        String TCrCode = rec.getString("B_CrCode1");
                        String TCrNo = rec.getString("B_CardNo1");
                        String TCrApp = rec.getString("B_AppCode1");
                        Double TCrAmt = rec.getDouble("B_CrAmt1");
                        InsertTemp(TRefno, TCrCode, TCrNo, TCrApp, TCrAmt);
                    } while (rec.next());
                }
                rec.close();
            }
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        }
        String t = "";
        if (POSHW.getHeading1().length() >= 18) {
            String[] strs = POSHW.getHeading1().trim().replace(" ", Space).split("_");
            for (String data : strs) {
                t += "colspan=3 align=center><font face=Angsana New size=1>" + data + "_";
            }
        } else {
            t += "colspan=3 align=center><font face=Angsana New size=1>" + POSHW.getHeading1().trim().replace(" ", "&nbsp; ") + "_";
        }
        if (POSHW.getHeading2().trim().length() >= 18) {
            String[] strs = POSHW.getHeading2().trim().replace(" ", Space).split("_");
            for (String data : strs) {
                t += "colspan=3 align=center><font face=Angsana New size=1>" + data + "_";
            }
        } else {
            t += "colspan=3 align=center><font face=Angsana New size=1>" + POSHW.getHeading2().trim().replace(" ", "&nbsp; ") + "_";
        }
        t += "colspan=3 align=center><font face=Angsana New size=1>" + (POSHW.getHeading3()).trim() + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + (POSHW.getHeading4()).trim() + "_";
        t += ("colspan=3 align=center><font face=Angsana New size=1>_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("รายงานการรับชำระด้วยบัตรเครดิต" + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("(Daily..Credit Report)" + "_");
        t += ("colspan=3 align=center><font face=Angsana New size=1>_");
        t += "align=left><font face=Angsana New size=1>" + ("หมายเลขเครื่อง :" + "</td><td colspan=2 align=left><font face=Angsana New size=1>" + MacNo1 + " ..." + MacNo2 + "_");
        t += "align=left><font face=Angsana New size=1>" + ("รหัสพนักงาน    :" + "</td><td colspan=2 align=left><font face=Angsana New size=1>" + CashNo1 + " ..." + CashNo2 + "_");
        t += "colspan=3 align=left><font face=Angsana New size=1>" + ("_");
        t += "colspan=3 align=left><font face=Angsana New size=1>" + "Print Date" + Space + (DatefmtThai.format(date) + Space + "Cashier:" + PublicVar._User + Space + " Mac:" + Value.MACNO + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("-----------------------------------------------------") + "_";
        t += "colspan=3 align=left><font face=Angsana New size=1>" + ("ประเภทบัตร" + Space + "ชื่อบัตรเครดิต") + "_";
        t += "colspan=2 align=left><font face=Angsana New size=1>" + ("ลำดับ" + TAB + "หมายเลขบัตร" + "</td><td align=right><font face=Angsana New size=1>" + "รหัสอนุมัติ" + TAB + "จำนวนเงิน") + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("-----------------------------------------------------") + "_";
        int SumVoid = 0;
        String TempCr = "";
        int SumCard = 0;
        Double SumCardAmt = 0.0;
        int SumTotal = 0;
        Double SumTotalAmt = 0.0;
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "select *from tempcredit where (terminal='" + Value.MACNO + "') order by crcode";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                t += "colspan=3 align=left><font face=Angsana New size=1>" + (rec.getString("crcode") + Space + PUtility.SeekCreditName(rec.getString("crcode"))) + "_";
                TempCr = rec.getString("crcode");
                do {
                    if (!rec.getString("crcode").equals(TempCr)) {
                        t += "colspan=3 align=left><font face=Angsana New size=1>" + TAB + ("Total Slip " + PUtility.DataFull(IntFmt.format(SumCard), 6) + TAB + PUtility.DataFull(DecFmt.format(SumCardAmt), 11)) + "_";
                        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("-----------------------------------------------------") + "_";
                        SumCard = 0;
                        SumCardAmt = 0.0;
                        t += "colspan=2 align=left><font face=Angsana New size=1>" + (rec.getString("crcode") + Space + PUtility.SeekCreditName(rec.getString("crcode"))) + "_";
                        TempCr = rec.getString("crcode");
                    }
                    SumCard++;
                    SumCardAmt = SumCardAmt + rec.getDouble("cramt");
                    SumTotal++;
                    SumTotalAmt = SumTotalAmt + rec.getDouble("cramt");
                    String TempCrId = PUtility.Addzero(rec.getString("crid"), 16);
                    t += "colspan=2 align=left><font face=Angsana New size=1>" + (PUtility.DataFull(IntFmt.format(SumCard), 5) + TAB + TempCrId.substring(12, 16) + "</td><td align=right><font face=Angsana New size=1>" + PUtility.DataFullR(rec.getString("crapp"), 6) + TAB + PUtility.DataFull(DecFmt.format(rec.getDouble("cramt")), 9)) + "_";
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
        }
        if (SumCard > 0) {
            t += "colspan=3 align=left><font face=Angsana New size=1>" + TAB + ("Total Slip " + Space + PUtility.DataFull(IntFmt.format(SumCard), 6) + TAB + PUtility.DataFull(DecFmt.format(SumCardAmt), 11)) + "_";
        }
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("-----------------------------------------------------") + "_";
        t += "colspan=2 align=left><font face=Angsana New size=1>" + ("Sum-Total Slip  " + Space + PUtility.DataFull(IntFmt.format(SumTotal), 6) + "</td><td align=right><font face=Angsana New size=1>" + PUtility.DataFull(DecFmt.format(SumTotalAmt), 13)) + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("-----------------------------------------------------" + "_");

        PrintDriver pd = new PrintDriver();
        String[] strs = t.split("_");

        for (String data1 : strs) {
            pd.addTextIFont(data1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        pd.printHTML();
    }

    public void InsertTemp(String TRefno, String TCrCode, String TCrId, String TCrApp, Double TCrAmt) {
        /**
         * * OPEN CONNECTION **
         */
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "insert into tempcredit (mac_no,s_date,terminal,ref_no,crcode,crid,crapp,cramt) "
                    + "values ('CASHIER1',curdate(),?,'" + TRefno + "',?,?,?,?)";
            PreparedStatement prm = mysql.getConnection().prepareStatement(SqlQuery);
            prm.setString(1, Value.MACNO);
            prm.setString(2, TCrCode);
            prm.setString(3, TCrId);
            prm.setString(4, TCrApp);
            prm.setDouble(5, TCrAmt);
            prm.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
        } finally {
            mysql.close();
        }
    }

    public void bntExitClick() {
        this.dispose();
    }

    public void inputfrombnt(String str) {
        if (txtMacNo1.hasFocus()) {
            String tempstr = "";
            tempstr = txtMacNo1.getText();
            tempstr = tempstr + str;
            txtMacNo1.setText(tempstr);
        }
        if (txtMacNo2.hasFocus()) {
            String tempstr = "";
            tempstr = txtMacNo2.getText();
            tempstr = tempstr + str;
            txtMacNo2.setText(tempstr);
        }
        if (txtCashNo1.hasFocus()) {
            String tempstr = "";
            tempstr = txtCashNo1.getText();
            tempstr = tempstr + str;
            txtCashNo1.setText(tempstr);
        }
        if (txtCashNo2.hasFocus()) {
            String tempstr = "";
            tempstr = txtMacNo2.getText();
            tempstr = tempstr + str;
            txtCashNo2.setText(tempstr);
        }

    }

    public void ProcessChkKey(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            bntExitClick();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            bntOKClick();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtMacNo1.hasFocus()) {
                txtMacNo2.requestFocus();
            }
            if (txtMacNo2.hasFocus()) {
                txtCashNo1.requestFocus();
            }
            if (txtCashNo1.hasFocus()) {
                txtCashNo2.requestFocus();
            }
            if (txtCashNo2.hasFocus()) {
                txtMacNo1.requestFocus();
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CreditRep dialog = new CreditRep(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExit;
    private javax.swing.JButton bntOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCashNo1;
    private javax.swing.JTextField txtCashNo2;
    private javax.swing.JTextField txtMacNo1;
    private javax.swing.JTextField txtMacNo2;
    // End of variables declaration//GEN-END:variables
}
