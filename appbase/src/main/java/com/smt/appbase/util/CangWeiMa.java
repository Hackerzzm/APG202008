package com.smt.appbase.util;

public class CangWeiMa {
  protected String ck;//仓库
  protected String kw;//库位
  protected String name;//名称
  protected String type;//类型
  protected String station;//站点
  protected String defaultSHKW;//默认收货库位
  protected String defaultFHKW;//默认发货库位

  public CangWeiMa() {
  }

  public CangWeiMa(String ck, String kw, String name, String type, String station,
      String defaultSHKW, String defaultFHKW) {
    this.ck = ck;
    this.kw = kw;
    this.name = name;
    this.type = type;
    this.station = station;
    this.defaultSHKW = defaultSHKW;
    this.defaultFHKW = defaultFHKW;
  }

  @Override public String toString() {
    return "CangWeiMa{" +
        "ck='" + ck + '\'' +
        ", kw='" + kw + '\'' +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", station='" + station + '\'' +
        ", defaultSHKW='" + defaultSHKW + '\'' +
        ", defaultFHKW='" + defaultFHKW + '\'' +
        '}';
  }

  public String getCk() {
    return ck;
  }

  public void setCk(String ck) {
    this.ck = ck;
  }

  public String getKw() {
    return kw;
  }

  public void setKw(String kw) {
    this.kw = kw;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }

  public String getDefaultSHKW() {
    return defaultSHKW;
  }

  public void setDefaultSHKW(String defaultSHKW) {
    this.defaultSHKW = defaultSHKW;
  }

  public String getDefaultFHKW() {
    return defaultFHKW;
  }

  public void setDefaultFHKW(String defaultFHKW) {
    this.defaultFHKW = defaultFHKW;
  }
}
