package com.smt.appbase.util;

public class QRCodeCheckUtil extends com.smt.appbase.shell.QRCodeCheckUtil {
  public static XianPinPiao checkXPP(String xpp){
    return com.smt.appbase.shell.QRCodeCheckUtil.checkXPP(xpp);
  }

  public static HeGePiao checkHGP(String hgp){
    return com.smt.appbase.shell.QRCodeCheckUtil.checkHGP(hgp);
  }

  public static CangWeiMa checkCWM(String cwm){
    return com.smt.appbase.shell.QRCodeCheckUtil.checkCWM(cwm);
  }
}
