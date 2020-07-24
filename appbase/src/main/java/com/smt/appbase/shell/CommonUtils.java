package com.smt.appbase.shell;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public class CommonUtils {
  public static int getAppVersionCode(Context context) {
    int versioncode = 0;
    try {
      PackageManager pm = context.getPackageManager();
      PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
      // versionName = pi.versionName;
      versioncode = pi.versionCode;
    } catch (Exception e) {
      Log.e("VersionInfo", "Exception", e);
    }
    return versioncode;
  }

  /**
   * 返回当前程序版本名
   */
  public static String getAppVersionName(Context context) {
    String versionName = null;
    try {
      PackageManager pm = context.getPackageManager();
      PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
      versionName = pi.versionName;
    } catch (Exception e) {
      Log.e("VersionInfo", "Exception", e);
    }
    return versionName;
  }

  public static String getWGRQByXPP(String xpp) {
    if (xpp.length() != 13) {
      return "";
    } else {
      int year = Integer.parseInt("20" + xpp.substring(0, 2));
      int month;
      int day;
      if (xpp.substring(2, 4).startsWith("0")) {
        month = Integer.parseInt(xpp.substring(3, 4));
      } else {
        month = Integer.parseInt(xpp.substring(2, 4));
      }
      if (xpp.substring(4, 6).startsWith("0")) {
        day = Integer.parseInt(xpp.substring(5, 6));
      } else {
        day = Integer.parseInt(xpp.substring(4, 6));
      }
      return year + "/" + month + "/" + day;
    }
  }
}
