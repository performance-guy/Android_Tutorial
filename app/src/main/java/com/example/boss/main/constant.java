package com.example.boss.main;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class constant {

    public static Context mainArchitect;
// MY_PREFS_NAME - a static String variable like:
    public static final String MY_PREFS_NAME = "MyPrefsFile";

    public static void save (String a,String b){

        SharedPreferences.Editor editor = mainArchitect.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString(a, b);
        editor.apply();
    }

    public static String load (String a, String b){
        SharedPreferences prefs = mainArchitect.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString(a, null);
        String value = "";
        if (restoredText != null) {
            value  = prefs.getString(a, "No Data Saved");//"No name defined" is the default value.
            return value;
        }
        return value;
    }

}
