package com.example.tencenter.changetheme;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        Util.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_theme_light:
                Util.changeToTheme(this, Constants.THEME_LIGHT);
                break;
            case R.id.action_theme_dark:
                Util.changeToTheme(this, Constants.THEME_DARK);
                break;
            case R.id.action_theme_blue:
                Util.changeToTheme(this, Constants.THEME_BLUE);
                break;
            case R.id.action_theme_red:
                Util.changeToTheme(this, Constants.THEME_RED);
                break;
            default:
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
