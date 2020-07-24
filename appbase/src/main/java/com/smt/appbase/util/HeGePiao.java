package com.smt.appbase.util;

public class HeGePiao {
  protected String hgp;//合格票编号
  protected String jyy;//检验员
  protected float rks;//入库数
  protected int xs;//箱数
  protected String dw;//单位
  protected float xrs;//箱入数
  protected String jcr;//检查日

  public HeGePiao(String hgp, String jyy, float rks, int xs, String dw, float xrs, String jcr) {
    this.hgp = hgp;
    this.jyy = jyy;
    this.rks = rks;
    this.xs = xs;
    this.dw = dw;
    this.xrs = xrs;
    this.jcr = jcr;
  }

  public HeGePiao() {
  }

  public String getHgp() {
    return hgp;
  }

  public void setHgp(String hgp) {
    this.hgp = hgp;
  }

  public String getJyy() {
    return jyy;
  }

  public void setJyy(String jyy) {
    this.jyy = jyy;
  }

  public int getXs() {
    return xs;
  }

  public void setXs(int xs) {
    this.xs = xs;
  }

  public String getDw() {
    return dw;
  }

  public void setDw(String dw) {
    this.dw = dw;
  }

  public float getRks() {
    return rks;
  }

  public void setRks(float rks) {
    this.rks = rks;
  }

  public float getXrs() {
    return xrs;
  }

  public void setXrs(float xrs) {
    this.xrs = xrs;
  }

  public String getJcr() {
    return jcr;
  }

  public void setJcr(String jcr) {
    this.jcr = jcr;
  }
}
