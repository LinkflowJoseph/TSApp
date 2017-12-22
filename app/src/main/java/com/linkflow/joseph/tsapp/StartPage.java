package com.linkflow.joseph.tsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StartPage extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout layout_gallery, layout_photo, layout_setting;
//    Drawable menu_circle_gray = getDrawable(R.drawable.menu_circle_gray);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        if(savedInstanceState == null)
            startActivity(new Intent(this, ShanActivity.class));
        initView();
    }

    private void initView(){
        layout_gallery = (RelativeLayout) findViewById(R.id.layout_gallery);
        layout_gallery.setOnClickListener(this);
//        layout_gallery.setOnTouchListener(this);
        layout_photo = (RelativeLayout) findViewById(R.id.layout_photo);
        layout_photo.setOnClickListener(this);
//        layout_photo.setOnTouchListener(this);
        layout_setting = (RelativeLayout) findViewById(R.id.layout_setting);
        layout_setting.setOnClickListener(this);
//        layout_setting.setOnTouchListener(this);

    }




    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.layout_gallery :
                if(layout_gallery.getBackground() == getDrawable(R.drawable.button_gallery)){
                    layout_gallery.setBackground(getDrawable(R.drawable.button_gallery_02));
                } else {
                    layout_gallery.setBackground(getDrawable(R.drawable.button_gallery));
                }
                intent = new Intent(StartPage.this,Gallery.class);
                startActivity(intent);
                break;
            case R.id.layout_photo :
                if(layout_photo.getBackground() == getDrawable(R.drawable.button_live_02)){
                    layout_photo.setBackground(getDrawable(R.drawable.button_live));
                } else {
                    layout_photo.setBackground(getDrawable(R.drawable.button_live_02));
                }
                intent = new Intent(StartPage.this,FullPreview.class);
                startActivity(intent);
                break;
            case R.id.layout_setting :
                if(layout_setting.getBackground() == getDrawable(R.drawable.button_settings_02)){
                    layout_setting.setBackground(getDrawable(R.drawable.button_settings));
                } else {
                    layout_setting.setBackground(getDrawable(R.drawable.button_settings_02));
                }
                intent = new Intent(StartPage.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
//
//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN: {
//                switch (v.getId()) {
//                    case R.id.layout_gallery:
//                        layout_gallery.setBackground(getDrawable(R.drawable.button_gallery_02));
//                        layout_gallery.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Intent intent = new Intent(StartPage.this,Gallery.class);
//                                startActivity(intent);
//                            }
//                        });
//                        break;
//                    case R.id.layout_photo:
//                        layout_photo.setBackground(getDrawable(R.drawable.button_live_02));
//                        layout_photo.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Intent intent = new Intent(StartPage.this,FullPreview.class);
//                                startActivity(intent);
//                            }
//                        });
//                        break;
//                    case R.id.layout_setting:
//                        layout_setting.setBackground(getDrawable(R.drawable.button_settings_02));
//                        layout_setting.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Intent intent = new Intent(StartPage.this,MainActivity.class);
//                                startActivity(intent);
//                            }
//                        });
//                        break;
//                }
//                return true;
//            }
//        }
//        return false; // allow other events like Click to be processed;
//    }

}


