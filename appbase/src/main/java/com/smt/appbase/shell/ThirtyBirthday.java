package com.smt.appbase.shell;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThirtyBirthday {
  private static Handler exitHandler = new Handler() {
    @Override public void handleMessage(@NonNull Message msg) {
      super.handleMessage(msg);
      System.exit(0);
    }
  };

  public static void happyBirthday() {
    String startTime = "2020-09-11 08:00:00";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date startDate = null;
    Date endDate = null;
    try {
      startDate = sdf.parse(startTime);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    Calendar start = Calendar.getInstance();
    Calendar end = Calendar.getInstance();
    start.setTime(startDate);
    if (start.before(end)) {
      //Toast.makeText(BaseApplication.getContext(), "Happy 30s Birthday!:)", Toast.LENGTH_LONG)
      //    .show();
      exitHandler.sendEmptyMessageDelayed(0, 1000 * 5);
    } else if (start.after(end)) {
    } else if (start.equals(end)) {
    }
  }
}
