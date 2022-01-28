package com.example.a1405178.practice;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref=getSharedPreferences("Preferences",MODE_WORLD_READABLE);
        SharedPreferences.Editor editor= pref.edit();
        editor.putBoolean("keyBoolean",true);
        editor.putFloat("keyFloat",1.0f);
        editor.putInt("keyInt",1);
        editor.putLong("keyLong",1000000L);
        editor.putString("keyString","Hello Android");
        editor.commit();
        boolean dataFromPrefBool= pref.getBoolean("keyBoolean",false);
        float dataFromPrefFloat=pref.getFloat("keyFloat",0.0f);
        int dataFromPrefInt= pref.getInt("keyInt",0);
        long dataFromPrefLong=pref.getLong("keyLong",0);
        String dataFromPrefString=pref.getString("keyString",null);


    }
}
