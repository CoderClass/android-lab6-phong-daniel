package com.codepath.android.themeswitcher.app;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by phongnguyen on 3/23/17.
 */

public class Utils {
  private static int sTheme;

  public static final int MATERIAL_LIGHT_THEME = 0;
  public static final int SEXY_DANIEL_THEME = 1;

  public static void changeToTheme(Activity activity, int theme) {
    sTheme = theme;
    activity.finish();
    activity.startActivity(new Intent(activity, activity.getClass()));
    activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
  }

  public static void onActivityCreateSetTheme(Activity activity){
    switch (sTheme){
      default:
      case MATERIAL_LIGHT_THEME:
        activity.setTheme(R.style.Theme_Material_Light);
        break;
      case SEXY_DANIEL_THEME:
        activity.setTheme(R.style.Theme_Sexy_Daniel);
        break;
    }
  }
}
