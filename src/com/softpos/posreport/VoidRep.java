package com.softpos.posreport;

import com.softpos.main.model.POSConfigSetup;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.softpos.database.util.MySQLConnect;
import java.sql.Statement;
import com.softpos.main.model.POSHWSetup;
import com.softpos.main.controller.PPrint;
import com.softpos.main.utils.PUtility;
import com.softpos.main.model.PublicVar;
import com.softpos.main.utils.ThaiUtil;
import com.softpos.main.model.Value;
import com.softpos.main.controller.PrintDriver;
import com.softpos.main.utils.KeyBoardDialog;
import com.softpos.main.utils.MSG;

public class VoidRep extends javax.swing.JDialog {

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
    private POSConfigSetup CONFIG;

    public VoidRep(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtMacNo1.setText("001");
        txtMacNo2.setText("999");
        txtCashNo1.setText("0000");
        txtCashNo2.setText("9999");
        POSHW = POSHWSetup.Bean(Value.getMacno());
        CONFIG = POSConfigSetup.Bean();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMacNo1 = new javax.swing.JTextField();
        txtMacNo2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCashNo1 = new javax.swing.JTextField();
        txtCashNo2 = new javax.swing.JTextField();
        bntExit = new javax.swing.JButton();
        bntOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานการทำรายการ Void (Void Report)");
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray, 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("หมายเลขเครื่อง");

        txtMacNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMacNo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMacNo1MouseClicked(evt);
            }
        });
        txtMacNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMacNo1KeyPressed(evt);
            }
        });

        txtMacNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMacNo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMacNo2MouseClicked(evt);
            }
        });
        txtMacNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMacNo2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("รหัสพนักงาน");

        txtCashNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashNo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCashNo1MouseClicked(evt);
            }
        });
        txtCashNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashNo1KeyPressed(evt);
            }
        });

        txtCashNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashNo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCashNo2MouseClicked(evt);
            }
        });
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
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMacNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMacNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCashNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCashNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
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

        bntExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntExit.setText("ESC- ออก");
        bntExit.setFocusable(false);
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        bntOK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntOK.setText("F5- พิมพ์");
        bntOK.setFocusable(false);
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
    bntOKClick();
}//GEN-LAST:event_bntOKActionPerformed

private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
    bntExitClick();
}//GEN-LAST:event_bntExitActionPerformed

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

    private void txtMacNo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMacNo1MouseClicked
        if (evt.getClickCount() == 2) {
            KeyBoardDialog.get(txtMacNo1);
        }
    }//GEN-LAST:event_txtMacNo1MouseClicked

    private void txtMacNo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMacNo2MouseClicked
        if (evt.getClickCount() == 2) {
            KeyBoardDialog.get(txtMacNo2);
        }
    }//GEN-LAST:event_txtMacNo2MouseClicked

    private void txtCashNo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCashNo1MouseClicked
        if (evt.getClickCount() == 2) {
            KeyBoardDialog.get(txtCashNo1);
        }
    }//GEN-LAST:event_txtCashNo1MouseClicked

    private void txtCashNo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCashNo2MouseClicked
        if (evt.getClickCount() == 2) {
            KeyBoardDialog.get(txtCashNo2);
        }
    }//GEN-LAST:event_txtCashNo2MouseClicked

    public void bntOKClick() {
        String MacNo1 = txtMacNo1.getText();
        String MacNo2 = txtMacNo2.getText();
        String CashNo1 = txtCashNo1.getText();
        String CashNo2 = txtCashNo2.getText();
        if (Value.printdriver) {
            PrintVoidDriver(MacNo1, MacNo2, CashNo1, CashNo2);
        } else {
            if (!Value.getComPort().equals("NONE")) {
                if (prn.OpenPrint(Value.getComPort())) {
                    prn.InitPrinter();
                    prn.print(POSHW.getHeading1());
                    prn.print(POSHW.getHeading2());
                    prn.print(POSHW.getHeading3());
                    prn.print(POSHW.getHeading4());
                    prn.print("REG ID :" + Value.MACNO);
                    prn.print("         รายงานการทำรายการ Void");
                    prn.print("              (Void Report)");
                    prn.print("หมายเลขเครื่อง :" + MacNo1 + " ..." + MacNo2);
                    prn.print("รหัสพนักงาน    :" + CashNo1 + " ..." + CashNo2);
                    prn.print(" ");
                    prn.print(DatefmtThai.format(date) + " " + "Cashier:" + PublicVar._User + " Mac:" + Value.MACNO);
                    prn.print("----------------------------------------");
                    prn.print("Mac Cashier Table Time  User-Void T_Void");
                    prn.print("    Ref-No  PLU-Code       Qty    Amount");
                    prn.print("----------------------------------------");

                    int SumVoid = 0;
                    Double SumAmount = 0.0;
                    MySQLConnect mysql = new MySQLConnect();
                    mysql.open();
                    try {
                        Statement stmt = mysql.getConnection().createStatement();
                        String SqlQuery = "select *from t_sale "
                                + "where (macno>='" + MacNo1 + "') and (macno<='" + MacNo2 + "') "
                                + "and (cashier>='" + CashNo1 + "') and (cashier<='" + CashNo2 + "') "
                                + "and (r_void='V') "
                                + "and r_date=curdate() "
                                + "order by macno,cashier,r_time";
                        ResultSet rec = stmt.executeQuery(SqlQuery);
                        rec.first();
                        if (rec.getRow() == 0) {
                        } else {
                            do {
                                prn.print(rec.getString("macno") + " " + PUtility.DataFullR(rec.getString("cashier"), 6) + " " + PUtility.DataFullR(rec.getString("r_table"), 5) + " " + PUtility.DataFullR(rec.getString("r_time"), 6) + "  " + PUtility.DataFullR(rec.getString("r_voiduser"), 10) + " " + PUtility.DataFullR(rec.getString("r_voidtime"), 6));
                                prn.print("     " + PUtility.DataFullR(rec.getString("r_pname"), 35));
                                prn.print("     " + rec.getString("r_refno") + " " + PUtility.DataFull(rec.getString("r_plucode"), 13) + " " + PUtility.DataFull(IntFmt.format(rec.getDouble("r_quan")), 4) + " " + PUtility.DataFull(DecFmt.format(rec.getDouble("r_total")), 8));
                                SumVoid++;
                                SumAmount = SumAmount + rec.getDouble("r_total");
                            } while (rec.next());
                        }
                        rec.close();
                        stmt.close();
                    } catch (SQLException e) {
                        MSG.ERR(e.getMessage());
                    } finally {
                        mysql.close();
                    }
                    prn.print("----------------------------------------");
                    prn.print("จำนวน Void :" + PUtility.DataFull(IntFmt.format(SumVoid), 5) + "  จำนวนเงิน :" + PUtility.DataFull(DecFmt.format(SumAmount), 11));
                    prn.print("----------------------------------------");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print("----------------------------------------");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");
                    prn.print(" ");

                    prn.CutPaper();
                    prn.closePrint();
                }
            }
        }

        txtMacNo1.requestFocus();
    }

    public void PrintVoidDriver(String MacNo1, String MacNo2, String CashNo1, String CashNo2) {
        String t = "";
        POSHW = POSHWSetup.Bean(Value.getMacno());
        if (POSHW.getHeading1().trim().length() >= 18) {
            String[] strs = POSHW.getHeading1().trim().replace(" ", Space).split("_");
            for (String data : strs) {
                t += "colspan=3 align=center><font face=Angsana New size=1>" + data + "_";
            }
        } else {
            t += "colspan=3 align=center><font face=Angsana New size=1>" + POSHW.getHeading1().trim().replace(" ", "&nbsp; ") + "_";
        }
        if (POSHW.getHeading2().length() >= 18) {
            String[] strs = POSHW.getHeading2().trim().replace(" ", Space).split("_");
            for (String data : strs) {
                t += "colspan=3 align=center><font face=Angsana New size=1>" + data + "_";
            }
        } else {
            t += "colspan=3 align=center><font face=Angsana New size=1>" + POSHW.getHeading2().trim().replace(" ", "&nbsp; ") + "_";
        }
        t += "colspan=3 align=center><font face=Angsana New size=1>" + (POSHW.getHeading3().trim()) + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + (POSHW.getHeading4()).trim() + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + "REG.ID :" + Space + (POSHW.getTerminal()) + "_";
        t += ("colspan=3 align=center><font face=Angsana New size=1>_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("รายงานการทำรายการ Void" + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("(Daily..Void Report)" + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("_");
        t += "colspan=3 align=left><font face=Angsana New size=1>" + "Print Date" + Space + (DatefmtThai.format(date)) + "_";
        t += "colspan=3 align=left><font face=Angsana New size=1>" + "Cashier:" + PublicVar._User + Space + "Mac:" + Value.MACNO + "_";
        t += "align=left><font face=Angsana New size=1>" + ("หมายเลขเครื่อง :" + "</td><td colspan=2 align=left><font face=Angsana New size=1>" + MacNo1 + " ..." + MacNo2) + "_";
        t += "align=left><font face=Angsana New size=1>" + ("รหัสพนักงาน    :" + "</td><td colspan=2 align=left><font face=Angsana New size=1>" + CashNo1 + " ..." + CashNo2) + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("----------------------------------------" + "_");
        t += "colspan=3 align=left><font face=Angsana New size=1>" + ("Mac" + Space + "Cashier" + Space + "Table") + "_";
        t += "colspan=3 align=left><font face=Angsana New size=1>" + "Time" + Space + "User Void" + "_";
        t += "colspan=2 align=left><font face=Angsana New size=1>" + ("Ref-No" + TAB + "PLU-Code" + TAB + "</td><td align=left><font face=Angsana New size=1>" + Space + "Qty" + TAB + "Amount" + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("----------------------------------------" + "_");

        int SumVoid = 0;
        Double SumAmount = 0.0;
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "select *from t_sale "
                    + "where (macno>='" + MacNo1 + "') and (macno<='" + MacNo2 + "') "
                    + "and (cashier>='" + CashNo1 + "') and (cashier<='" + CashNo2 + "') "
                    + "and (r_void='V') "
                    //                    + "and r_date=curdate() "
                    + "order by macno,cashier,r_time";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
            } else {
                do {
                    t += "conspan=3 align=left><font face=Angsana New size=1>" + rec.getString("macno") + Space + rec.getString("cashier") + Space + rec.getString("r_table") + "_";
                    t += "conspan=3 align=left><font face=Angsana New size=1>" + rec.getString("r_time") + Space + rec.getString("r_voiduser") + Space + rec.getString("r_voidtime") + "_";
                    t += "colspan=3 align=left><font face=Angsana New size=1>" + (ThaiUtil.ASCII2Unicode(rec.getString("r_pname"))) + "_";
                    t += "align=left><font face=Angsana New size=1>" + (TAB + rec.getString("r_refno") + Space + PUtility.DataFullSpace(rec.getString("r_plucode"), 13) + "</td><td colspan=2 align=left><font face=Angsana New size=1>" + PUtility.DataFullSpace(IntFmt.format(rec.getDouble("r_quan")), 4) + Space + PUtility.DataFullSpace(DecFmt.format(rec.getDouble("r_total")), 8)) + "_";
                    SumVoid++;
                    SumAmount = SumAmount + rec.getDouble("r_total");
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
        } finally {
            mysql.close();
        }
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("----------------------------------------" + "_");
        t += "colspan=3 align=left><font face=Angsana New size=1>" + ("จำนวน Void :" + IntFmt.format(SumVoid) + TAB + "จำนวนเงิน :" + TAB + DecFmt.format(SumAmount) + "_");
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("----------------------------------------") + "_";
        t += "colspan=3 align=center><font face=Angsana New size=1>" + ("_");
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
        txtMacNo1.requestFocus();
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
                VoidRep dialog = new VoidRep(new javax.swing.JFrame(), true);
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
