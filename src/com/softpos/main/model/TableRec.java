package com.softpos.main.model;

import java.sql.Time;
import java.util.Date;

public class TableRec {
    //TTableRec = Record   {Table Record .......}
    String Table_RefNo = "";
    Date Table_OnDate;
    String Table_OnTime = "";
    String Table_MacNo = "";
    String Table_Cashier = "";
    String Table_ETD = "";
    String Table_TCode = "";
    String Table_TLogInTime = "";
    String Table_TCurTime = "";
    Date Table_TLoginDate;
    String Table_TOnAct = "";
    int Table_TItem = 0;
    int Table_TCustomer = 0;
    Double Table_TAmount = 0.00;
    Double Table_Food = 0.00;
    Double Table_Drink = 0.00;
    Double Table_Product = 0.00;
    Double Table_Service = 0.00;
    Double Table_ServiceAmt = 0.00;
    String Table_FastDisc = "";
    Double Table_FastDiscAmt = 0.00;
    String Table_EmpDisc = "";
    Double Table_EmpDiscAmt = 0.00;
    String Table_TrainDisc = "";
    Double Table_TrainDiscAmt = 0.00;
    String Table_MemDisc = "";
    Double Table_MemDiscAmt = 0.00;
    String Table_SubDisc = "";
    Double Table_SubDiscAmt = 0.00;
    Double Table_DiscBath = 0.00;
    Double Table_ProDiscAmt = 0.00;
    Double Table_SpaDiscAmt = 0.00;
    Double Table_CuponDiscAmt = 0.00;
    Double Table_ItemDiscAmt = 0.00;
    String Table_MemCode = "";
    String Table_MemName = "";
    Date Table_MemBegin;
    Date Table_MemEnd;
    Date Table_MemBrid;
    Double Table_MemCurAmt = 0.00;
    Double Table_Score = 0.00;
    Double Table_SumScoreal = 0.00;
    String Table_MemLastDate = "";
    Double Table_NetTotal = 0.00;
    Double Table_NetFood = 0.00;
    Double Table_NetDrink = 0.00;
    Double Table_NetProduct = 0.00;
    Double Table_NetVat = 0.00;
    Double Table_NetNonVat = 0.00;
    Double Table_Vat = 0.00;
    String Table_ArCode = "";
    int Table_AccrCr = 0;
    Double Table_ArPayment = 0.00;
    Double Table_PayAmt = 0.00;
    Double Table_Ton = 0.00;
    Double Table_Earnest = 0.00;
    Double Table_Gift_Voucher = 0.00;
    Double Table_Cash = 0.00;
    String Table_Cr_Bank = "";   //For SMP
    Double Table_Cr_CardAmt = 0.00;
    int Table_Cr_CurPoint = 0;
    int Table_Cr_SumPoint = 0;
    Double Table_Cr_PurseAmt = 0.00;
    Double Table_Cr_CouponAmt = 0.00;
    Double Table_Cr_TotCoupon = 0.00;
    String Table_Cr_Code1 = "";
    String Table_Cr_Name1 = "";
    Double Table_Cr_Charge = 0.00;
    Double Table_Cr_ChargeAmt = 0.00;
    Double Table_Cr_Redule = 0.00;
    String Table_Cr_CardNo1 = "";
    String Table_Cr_App_Code1 = "";
    Double Table_Cr_Amount1 = 0.00;
    Double Table_PrintTotal = 0.00;
    int Table_PrnCnt = 0;
    int Table_BillCopy = 0;
    String Table_PrnTime1 = "";
    String Table_PrnTime2 = "";
    String Table_BranCode = "";
    String Table_BranName = "";
    String Table_BranTel = "";
    String Table_BranTime = "";
    String Table_BranchDate = "";
    String Table_ChkBill = "";
    Time Table_ChkBillTime;  //Please Check Data Type
    String Table_MemBarcode ="N" ;
    String Table_PrintChkBill="N";
    String Table_BarcodeLost="N" ;
    String Table_BarcodeLostUser="" ;
    String Table_BarcodeLostUserName="" ;
    String Table_BarcodeLostTime="" ;
    String Table_EmpCode = "" ;
    String Table_EmpName = "" ;
    double ChargePriceDown = 0.0 ;
    String ChargeCode = "" ;
    String ChargeName = "" ;
    int ChargeType = 0 ;
    String ChargeRemark = "" ;
    String ChargeGroup = "" ;
    Date ChargeBeginDate ;
    Date ChargeExpDate ;
    String ChargeDocNo= "" ;
    
}