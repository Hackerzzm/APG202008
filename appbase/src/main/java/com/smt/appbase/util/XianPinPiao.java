package com.smt.appbase.util;

import com.smt.appbase.shell.CommonUtils;

public class XianPinPiao {
  /*private String gdh;//"工单号"="工单"
  private String wlbm;//"物料编码"-"品番"
  private String gctf;//"工程图番"
  private String xrs;//"箱入数"="sl"
  private String lsh;//"流水号"-"xpp"
  private String wlmc;//"物料名称"*/

  protected String gd;//"工单号"="工单"
  protected String pf;//"物料编码"-"品番"
  protected String gctf;//"工程图番"
  protected float sl;//"箱入数"="sl"
  protected String xpp;//"流水号"-"xpp"
  protected String wlmc;//"物料名称
  protected float xrs;//"箱入数
  protected String wgrq;//完工日期

  public XianPinPiao() {
  }

  public XianPinPiao(String gd, String pf, String gctf, float sl, String xpp, String wlmc,
      float xrs) {
    this.gd = gd;
    this.pf = pf;
    this.gctf = gctf;
    this.sl = sl;
    this.xpp = xpp;
    this.wlmc = wlmc;
    this.xrs = xrs;
    this.wgrq = CommonUtils.getWGRQByXPP(xpp);
  }

  public String getWgrq() {
    return wgrq;
  }

  public void setWgrq(String wgrq) {
    this.wgrq = wgrq;
  }

  @Override public String toString() {
    return "XianPinPiao{" +
        "gd='" + gd + '\'' +
        ", pf='" + pf + '\'' +
        ", gctf='" + gctf + '\'' +
        ", sl=" + sl +
        ", xpp='" + xpp + '\'' +
        ", wlmc='" + wlmc + '\'' +
        ", xrs=" + xrs +
        ", wgrq='" + wgrq + '\'' +
        '}';
  }

  public String getGd() {
    return gd;
  }

  public void setGd(String gd) {
    this.gd = gd;
  }

  public String getPf() {
    return pf;
  }

  public void setPf(String pf) {
    this.pf = pf;
  }

  public String getGctf() {
    return gctf;
  }

  public void setGctf(String gctf) {
    this.gctf = gctf;
  }

  public float getSl() {
    return sl;
  }

  public void setSl(float sl) {
    this.sl = sl;
  }

  public float getXrs() {
    return xrs;
  }

  public void setXrs(float xrs) {
    this.xrs = xrs;
  }

  public String getXpp() {
    return xpp;
  }

  public void setXpp(String xpp) {
    this.xpp = xpp;
  }

  public String getWlmc() {
    return wlmc;
  }

  public void setWlmc(String wlmc) {
    this.wlmc = wlmc;
  }
}
