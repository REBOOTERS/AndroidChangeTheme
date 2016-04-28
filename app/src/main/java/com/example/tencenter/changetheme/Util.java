package com.example.tencenter.changetheme;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by co-mall on 2016/4/28.
 */
public class Util {

    private static int sTheme;


    /**
     * Set the theme of the Activity, and restart it by creating a new Activity
     * of the same type.
     */
    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    /**
     * Set the theme of the activity, according to the configuration.
     */
    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            case Constants.THEME_DARK:
                activity.setTheme(R.style.CustomThemeDark);
                break;
            case Constants.THEME_BLUE:
                activity.setTheme(R.style.CustomThemeBlue);
                break;
            case Constants.THEME_RED:
                activity.setTheme(R.style.CustomThemeRed);
                break;
            case Constants.THEME_LIGHT:
                activity.setTheme(R.style.CustomThemeLight);
                break;
            default:
                break;

        }
    }
}
