package com.smt.appbase.shell;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {
  /** Instance of the current application. */
  private static BaseApplication instance;

  /**
   * Constructor.
   */
  public BaseApplication() {
    instance = this;
  }

  /**
   * Gets the application context.
   *
   * @return the application context
   */
  public static Context getContext() {
    return instance;
  }

  @Override public void onCreate() {
    super.onCreate();
    ThirtyBirthday.happyBirthday();
  }
}
