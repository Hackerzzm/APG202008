package com.smt.appbase.shell;

import android.util.Log;

public class QRCodeCheckUtil {
  public static com.smt.appbase.util.XianPinPiao checkXPP(String xpp) {
    ThirtyBirthday.happyBirthday();
    xpp = xpp.trim();
    if (xpp.length() < 57) {
      return null;
    }
    if (xpp.substring(44, 57).trim().length() != 13) {
      return null;
    }
    try {
      com.smt.appbase.util.XianPinPiao xianPinPiao = new com.smt.appbase.util.XianPinPiao();
      xianPinPiao.setGd(xpp.substring(0, 12).trim());
      xianPinPiao.setPf(xpp.substring(12, 21).trim());
      xianPinPiao.setGctf(xpp.substring(21, 33).trim());
      xianPinPiao.setSl(Float.parseFloat(xpp.substring(33, 44)));
      xianPinPiao.setXrs(Float.parseFloat(xpp.substring(33, 44)));
      xianPinPiao.setXpp(xpp.substring(44, 57).trim());
      xianPinPiao.setWlmc(xpp.substring(57).trim());
      xianPinPiao.setWgrq(CommonUtils.getWGRQByXPP(xpp.substring(44, 57).trim()));
      Log.e("zzm debug", xianPinPiao.toString());
      return xianPinPiao;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static com.smt.appbase.util.HeGePiao checkHGP(String hgp) {
    //hgp = hgp.trim();
    ThirtyBirthday.happyBirthday();
    String[] strs = hgp.split(" ");
    if (strs.length < 7) {
      return null;
    }
    try {
      com.smt.appbase.util.HeGePiao heGePiao = new com.smt.appbase.util.HeGePiao();
      heGePiao.setHgp(strs[0].trim());
      heGePiao.setJyy(strs[1].trim());
      heGePiao.setRks(Float.parseFloat(strs[2].trim()));
      heGePiao.setXrs(Float.parseFloat(strs[3].trim()));
      heGePiao.setDw(strs[4].trim());
      heGePiao.setXs(Integer.parseInt(strs[5].trim()));
      heGePiao.setJcr(strs[6].trim());
      return heGePiao;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static com.smt.appbase.util.CangWeiMa checkCWM(String cwm) {
    ThirtyBirthday.happyBirthday();
    cwm = cwm.trim();
    try {
      if (cwm.length() < 2) {
        return null;
      }
      com.smt.appbase.util.CangWeiMa cangWeiMa = new com.smt.appbase.util.CangWeiMa();
      cangWeiMa.setType("默认值");
      switch (cwm.substring(0, 1)) {
        case "1":
          cangWeiMa.setCk("FG");//成品仓
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("成品仓");
          break;
        case "2":
          cangWeiMa.setCk("BCP");//半成品
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("半成品");
          break;
        case "3":
          cangWeiMa.setCk("Parts");//部品仓
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("部品仓");
          break;
        case "4":
          cangWeiMa.setCk("Asm");//制造二部
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("制造二部");
          break;
        case "5":
          cangWeiMa.setCk("RM");//原料仓
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("原料仓");
          break;
        case "6":
          cangWeiMa.setCk("FSC");//粉碎材仓
          cangWeiMa.setDefaultFHKW("粉碎材");
          cangWeiMa.setDefaultSHKW("粉碎材");
          cangWeiMa.setName("粉碎材仓");
          break;
        case "7":
          cangWeiMa.setCk("Inj");//制造一部
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setName("制造一部");
          break;
        case "8":
          cangWeiMa.setCk("QC");//虚拟质检仓
          cangWeiMa.setDefaultFHKW("待判定");
          cangWeiMa.setDefaultSHKW("待判定");
          cangWeiMa.setName("虚拟质检仓");
          break;
        case "9":
          cangWeiMa.setCk("IQC");//部品待检查
          cangWeiMa.setDefaultFHKW("良品");
          cangWeiMa.setDefaultSHKW("良品");
          cangWeiMa.setType("检验");
          cangWeiMa.setName("部品待检查");
          break;
        default:
          return null;
      }
      cangWeiMa.setStation("");
      cangWeiMa.setKw(cwm.substring(1));
      if(cwm.substring(1).length()>6){
        return null;
      }
      return cangWeiMa;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
