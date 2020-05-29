package com.softpos.main.program;

import com.softpos.main.controller.PPrint;
import com.softpos.main.model.POSConfigSetup;
import com.softpos.main.utils.PUtility;
import com.softpos.main.model.CreditPaymentRec;
import com.softpos.main.model.TranRecord;
import com.softpos.main.model.Value;
import com.softpos.main.model.PublicVar;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import database.MySQLConnect;
import java.sql.Statement;
import util.MSG;

public class CopyBill extends javax.swing.JDialog {

    Date date = new Date();
    TranRecord[] MyArray;
    int ArraySize;
    PPrint prn = new PPrint();
    CreditPaymentRec[] CreditArray;
    POSConfigSetup CONFIG;

    public CopyBill(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PublicVar.SmpCouponArray = null;
        CONFIG = POSConfigSetup.Bean();
        /**
         * * OPEN CONNECTION **
         */
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "select * from billno "
                    + "where b_macno='" + Value.MACNO + "'";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.last();
            if (rec.getRow() == 0) {
            } else {
                do {
                    txtBillNo.setText(rec.getString("b_refno"));
                } while (rec.next());
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        } finally {
            mysql.close();
        }

        txtCopy.setText(Integer.toString(CONFIG.getP_BillCopy()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCopy = new javax.swing.JFormattedTextField();
        bntOK = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("พิมพ์สำเนาใบเสร็จรับเงิน");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("กรุณาป้อนเลขที่บิล และจำนวน Copy ที่ต้องการ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("เลขที่บิล (Receipt No)");

        txtBillNo.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });
        txtBillNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBillNoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("จำนวน Copy");

        txtCopy.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCopy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCopy.setFont(new java.awt.Font("Norasi", 1, 14)); // NOI18N
        txtCopy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCopyKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bntOK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntOK.setText("F5-ตกลง (OK)");
        bntOK.setFocusable(false);
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });

        bntExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntExit.setText("ESC-ออก (Exit)");
        bntExit.setFocusable(false);
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntOK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(527, 182));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtBillNoActionPerformed

private void txtBillNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillNoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtCopy.requestFocus();
    }
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    }
    if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }

}//GEN-LAST:event_txtBillNoKeyPressed

private void txtCopyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCopyKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        bntExitClick();
    } else if (evt.getKeyCode() == KeyEvent.VK_F5) {
        bntOKClick();
    }
}//GEN-LAST:event_txtCopyKeyPressed

    private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
        bntOKClick();
    }//GEN-LAST:event_bntOKActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        bntExitClick();
    }//GEN-LAST:event_bntExitActionPerformed

    private void actionPrint() {
        String BillNo = txtBillNo.getText();
        /**
         * * OPEN CONNECTION **
         */
        MySQLConnect mysql = new MySQLConnect();
        mysql.open();
        try {
            Statement stmt = mysql.getConnection().createStatement();
            String SqlQuery = "select * from billno "
                    + "where (b_macno='" + Value.MACNO + "') "
                    + "and (b_refno='" + BillNo + "')";
            ResultSet rec = stmt.executeQuery(SqlQuery);
            rec.first();
            if (rec.getRow() == 0) {
                MSG.ERR(this, "ไม่พบใบเสร็จรับเงินเลขที่ " + txtBillNo.getText() + "  ในฐานข้อมูล...");
                txtBillNo.selectAll();
                txtBillNo.requestFocus();
            } else {
                processCopyBill();
            }
            rec.close();
            stmt.close();
        } catch (SQLException e) {
            MSG.ERR(e.getMessage());
            
        } finally {
            mysql.close();
        }
    }

    private void bntOKClick() {
        actionPrint();
    }

    private void processCopyBill() {
        int CopyPrn = Integer.parseInt(txtCopy.getText());
        String BillNo = txtBillNo.getText();
        //Load Data From BillNo
        int billcopy = 0;
        /**
         * * OPEN CONNECTION **
         */
            MySQLConnect mysql = new MySQLConnect();
            mysql.open();
            try {
                Statement stmt = mysql.getConnection().createStatement();
                String SqlQuery = "select * from billno "
                        + "where (b_macno='" + Value.MACNO + "') "
                        + "and (b_refno='" + BillNo + "')";
                ResultSet rec = stmt.executeQuery(SqlQuery);
                rec.first();
                if (rec.getRow() == 0) {
                    PUtility.ShowMsg("ไม่พบใบเสร็จรับเงินเลขที่ " + txtBillNo.getText() + "  ในฐานข้อมูล...");
                    this.dispose();
                } else {
                    PublicVar.TableRec_RefNo = rec.getString("b_refno");
                    PublicVar.TableRec_OnDate = rec.getDate("b_ondate");
                    PublicVar.TableRec_OnTime = rec.getString("b_ontime");
                    PublicVar.TableRec_TCode = rec.getString("b_table");
                    PublicVar.TableRec_MacNo = rec.getString("b_macno");
                    PublicVar.TableRec_Cashier = rec.getString("b_cashier");
                    PublicVar.TableRec_TLogInTime = "";
                    PublicVar.TableRec_TCurTime = "";
                    PublicVar.TableRec_TLoginDate = date;
                    PublicVar.TableRec_TOnAct = "";
                    PublicVar.TableRec_TCustomer = rec.getInt("b_cust");
                    PublicVar.TableRec_ETD = rec.getString("b_etd");
                    PublicVar.TableRec_TAmount = rec.getDouble("b_total");
                    PublicVar.TableRec_Food = rec.getDouble("b_food");
                    PublicVar.TableRec_Drink = rec.getDouble("b_drink");
                    PublicVar.TableRec_Product = rec.getDouble("b_product");
                    PublicVar.TableRec_Service = rec.getDouble("b_service");
                    PublicVar.TableRec_ServiceAmt = rec.getDouble("b_serviceamt");
                    PublicVar.TableRec_FastDisc = rec.getString("b_fastdisc");
                    PublicVar.TableRec_FastDiscAmt = rec.getDouble("b_fastdiscamt");
                    PublicVar.TableRec_EmpDisc = rec.getString("b_empdisc");
                    PublicVar.TableRec_EmpDiscAmt = rec.getDouble("b_empdiscamt");
                    PublicVar.TableRec_TrainDisc = rec.getString("b_traindisc");
                    PublicVar.TableRec_TrainDiscAmt = rec.getDouble("b_traindiscamt");
                    PublicVar.TableRec_MemDisc = rec.getString("b_memdisc");
                    PublicVar.TableRec_MemDiscAmt = rec.getDouble("b_memdiscamt");
                    PublicVar.TableRec_SubDisc = rec.getString("b_subdisc");
                    PublicVar.TableRec_SubDiscAmt = rec.getDouble("b_subdiscamt");
                    PublicVar.TableRec_DiscBath = rec.getDouble("b_subdiscbath");
                    PublicVar.TableRec_ProDiscAmt = rec.getDouble("b_prodiscamt");
                    PublicVar.TableRec_SpaDiscAmt = rec.getDouble("b_spadiscamt");
                    PublicVar.TableRec_CuponDiscAmt = rec.getDouble("b_cupondiscamt");
                    PublicVar.TableRec_ItemDiscAmt = rec.getDouble("b_itemdiscamt");
                    PublicVar.TableRec_MemCode = rec.getString("b_memcode");
                    PublicVar.TableRec_MemName = rec.getString("b_memname");
                    PublicVar.TableRec_MemBegin = null;
                    PublicVar.TableRec_MemEnd = null;
                    PublicVar.TableRec_MemBrid = null;
                    PublicVar.TableRec_MemCurAmt = rec.getDouble("b_sumscore");
                    PublicVar.TableRec_Score = rec.getDouble("b_memcursum");
                    PublicVar.TableRec_SumScoreal = rec.getDouble("b_sumscore");
                    PublicVar.TableRec_NetTotal = rec.getDouble("b_nettotal");
                    PublicVar.TableRec_NetFood = rec.getDouble("b_netfood");
                    PublicVar.TableRec_NetDrink = rec.getDouble("b_netdrink");
                    PublicVar.TableRec_NetProduct = rec.getDouble("b_netproduct");
                    PublicVar.TableRec_NetVat = rec.getDouble("b_netvat");
                    PublicVar.TableRec_NetNonVat = rec.getDouble("b_netnonvat");
                    PublicVar.TableRec_Vat = rec.getDouble("b_vat");
                    PublicVar.TableRec_ArCode = rec.getString("b_accrcode");
                    PublicVar.TableRec_AccrCr = rec.getInt("b_accrcr");
                    PublicVar.TableRec_ArPayment = rec.getDouble("b_accramt");
                    PublicVar.TableRec_PayAmt = rec.getDouble("b_payamt");
                    PublicVar.TableRec_Ton = rec.getDouble("b_ton");
                    PublicVar.TableRec_Earnest = rec.getDouble("b_earnest");
                    PublicVar.TableRec_Gift_Voucher = rec.getDouble("b_giftvoucher");
                    PublicVar.TableRec_Cash = rec.getDouble("b_cash");
                    PublicVar.TableRec_Cr_Bank = rec.getString("b_crbank");   //For SMP
                    PublicVar.TableRec_Cr_CardAmt = rec.getDouble("b_crcardamt");
                    PublicVar.TableRec_Cr_CurPoint = rec.getInt("b_crcurpoint");
                    PublicVar.TableRec_Cr_SumPoint = rec.getInt("b_crsumpoint");
                    PublicVar.TableRec_Cr_Name1 = "";
                    PublicVar.TableRec_Cr_Charge = rec.getDouble("b_crcharge1");
                    PublicVar.TableRec_Cr_ChargeAmt = rec.getDouble("b_crchargeamt1");
                    PublicVar.TableRec_Cr_Redule = 0.00;
                    PublicVar.TableRec2_Cr_Code1 = rec.getString("b_crcode1");
                    PublicVar.TableRec_Cr_CardNo1 = rec.getString("b_cardno1");
                    PublicVar.TableRec_Cr_App_Code1 = rec.getString("b_appcode1");
                    PublicVar.TableRec_Cr_Amount1 = rec.getDouble("b_cramt1");
                    PublicVar.TableRec_PrintTotal = 0.00;
                    PublicVar.TableRec_PrnCnt = 0;
                    PublicVar.TableRec_BillCopy = 0;
                    PublicVar.TableRec_PrnTime1 = "";
                    PublicVar.TableRec_PrnTime2 = "";
                    PublicVar.TableRec_BranCode = rec.getString("b_bran");
                    PublicVar.TableRec_BranName = rec.getString("b_branname");
                    PublicVar.TableRec_BranTel = rec.getString("b_tel");
                    PublicVar.TableRec_BranTime = rec.getString("b_rectime");
                    billcopy = rec.getInt("b_billcopy");
                }
                rec.close();
                stmt.close();
            } catch (SQLException e) {
                MSG.ERR(e.getMessage());
                
            }

            //Load Data From T_Sale
            try {
                Statement stmt = mysql.getConnection().createStatement();
                String LoadBalance = "select * from t_sale "
                        + "where (macno='" + Value.MACNO + "') "
                        + "and (r_refno='" + BillNo + "')";
                ResultSet rec = stmt.executeQuery(LoadBalance);
                PublicVar.P_ItemCount = 0;
                MyArray = null;
                MyArray = new TranRecord[1];
                rec.first();
                if (rec.getRow() == 0) {
                } else {
                    do {
                        PublicVar.P_ItemCount++;
                        TranRecord TranRec = new TranRecord();
                        TranRec.R_Index = rec.getString("r_index");
                        TranRec.R_Date = rec.getDate("r_date");
                        TranRec.R_Table = rec.getString("r_table");
                        TranRec.R_Time = rec.getString("r_time");
                        TranRec.Macno = rec.getString("macno");
                        TranRec.Cashier = rec.getString("cashier");
                        TranRec.R_Emp = rec.getString("r_emp");
                        TranRec.R_Set = rec.getString("r_set");
                        TranRec.R_Stock = rec.getString("r_stock");
                        TranRec.R_PluCode = rec.getString("r_plucode");
                        TranRec.R_PName = rec.getString("r_pname");
                        TranRec.R_Unit = rec.getString("r_unit");
                        TranRec.R_Group = rec.getString("r_group");
                        TranRec.R_Status = rec.getString("r_status");
                        TranRec.R_Normal = rec.getString("r_normal");
                        TranRec.R_Discount = rec.getString("r_discount");
                        TranRec.R_Service = rec.getString("r_service");
                        TranRec.R_Vat = rec.getString("r_vat");
                        TranRec.R_Type = rec.getString("r_type");
                        TranRec.R_ETD = rec.getString("r_etd");
                        TranRec.R_Quan = rec.getDouble("r_quan");
                        TranRec.R_Price = rec.getDouble("r_price");
                        TranRec.R_Total = rec.getDouble("r_total");
                        TranRec.R_PrType = rec.getString("r_prtype");
                        TranRec.R_PrCode = rec.getString("r_prcode");
                        TranRec.R_PrDisc = rec.getDouble("r_prdisc");
                        TranRec.R_PrBath = rec.getDouble("r_prbath");
                        TranRec.R_PrAmt = rec.getDouble("r_pramt");
                        TranRec.R_PrQuan = rec.getDouble("r_prquan");
                        TranRec.R_Redule = rec.getDouble("r_redule");
                        TranRec.R_KIC = rec.getString("r_kic");
                        TranRec.R_KicPrint = rec.getString("r_kicprint");
                        TranRec.R_Void = rec.getString("r_void");
                        TranRec.R_VoidUser = rec.getString("r_voiduser");
                        TranRec.R_VoidTime = rec.getString("r_voidtime");
                        TranRec.R_DiscBath = rec.getDouble("r_discbath");
                        if (PublicVar.P_ItemCount > 1) {
                            MyArray = PUtility.addArray(MyArray);
                        }
                        ArraySize = MyArray.length;
                        MyArray[ArraySize - 1] = TranRec;
                    } while (rec.next());
                }
                rec.close();
                stmt.close();

            } catch (SQLException e) {
                MSG.ERR(e.getMessage());
                
            }

            if (CONFIG.getP_BillCopyOne().equals("Y") & (billcopy > 0)) {
                PUtility.ShowMsg("บิลเลขที่ " + BillNo + "  ได้มีการพิมพ์สำเนาไปแล้ว...ไม่สามารถพิมพ์ได้อีก");
                txtBillNo.requestFocus();
            } else {
                if (CopyPrn > CONFIG.getP_BillCopy()) {
                    CopyPrn = CONFIG.getP_BillCopy();
                    txtCopy.setText(Integer.toString(CopyPrn));
                }
                for (int i = 1; i <= CopyPrn; i++) {
                    prn.PrintBillCopy(MyArray, BillNo, i, CreditArray);
                }
                try {
                    Statement stmt = mysql.getConnection().createStatement();
                    String SqlQuery = "update billno set "
                            + "b_billcopy=b_billcopy+1 "
                            + "where (b_refno='" + BillNo + "') "
                            + "and (b_macno='" + Value.MACNO + "')";
                    stmt.executeUpdate(SqlQuery);
                    stmt.close();
                } catch (SQLException e) {
                    MSG.ERR(e.getMessage());
                    
                }

                this.dispose();
            }

            mysql.close();
    }

    private void bntExitClick() {
        this.dispose();
    }

    public static void main(String args[]) {
        new MySQLConnect();

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CopyBill dialog = new CopyBill(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JFormattedTextField txtCopy;
    // End of variables declaration//GEN-END:variables
}
