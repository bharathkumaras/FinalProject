package com.example.sandy.finalproject;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by sandy on 01-Apr-19.
 */

public class Sharedpreferences {
    private SharedPreferences sharedPreferences;
    private Context context;
    boolean status;
     Sharedpreferences(Context context)
    {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("Myfile",Context.MODE_PRIVATE);
    }

    public void Writepreferences(boolean status)
    {
       SharedPreferences.Editor editor = sharedPreferences.edit();
       editor.putBoolean(context.getResources().getString(R.string.login_status_preferences),status);
       editor.commit();
    }

    public boolean getstatus()
    {
        status = false;
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preferences),false);
        return status;
    }
}
