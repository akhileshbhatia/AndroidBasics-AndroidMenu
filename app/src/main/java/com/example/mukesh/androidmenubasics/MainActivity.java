package com.example.mukesh.androidmenubasics;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        //setup action bar
        ActionBar actionBar =  getSupportActionBar();
        actionBar.setIcon(R.drawable.ic_launcher_background);
        actionBar.setTitle("Menu App");
        actionBar.setSubtitle("Menu App Subtitle");
        actionBar.setDisplayOptions(
                ActionBar.DISPLAY_HOME_AS_UP |
                ActionBar.DISPLAY_SHOW_TITLE |
                ActionBar.DISPLAY_USE_LOGO |
                ActionBar.DISPLAY_SHOW_CUSTOM
        );
        actionBar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.about_item:
                textView.setText("About item selected");
                break;
            case R.id.alarm_item:
                textView.setText("Alarm item selected");
                break;
            case R.id.color_setting_item:
                textView.setText("Color setting item selected");
                break;
            case R.id.settings_item:
                textView.setText("Setting selected");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
