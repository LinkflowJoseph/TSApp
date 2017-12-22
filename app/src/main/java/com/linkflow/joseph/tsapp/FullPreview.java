package com.linkflow.joseph.tsapp;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FullPreview extends AppCompatActivity implements View.OnClickListener{
    Button button_display_mode_switcher, button_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullpreview);
        init_view();
    }

    private void init_view(){
        button_display_mode_switcher = (Button) findViewById(R.id.button_display_mode_switcher);
        button_reset = (Button) findViewById(R.id.button_reset);
        button_display_mode_switcher.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_display_mode_switcher :
                if(button_display_mode_switcher.getText() == "NORMAL")
                {
                    button_display_mode_switcher.setText("TOUCH");
                    /*Touch Mode display*/

                } else{
                    button_display_mode_switcher.setText("NORMAL");
                    /*Normal Mode display*/
                }

                break;
        }
    }
}
