package com.linkflow.joseph.tsapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShanActivity extends AppCompatActivity {
ImageView sp_img;
TextView text1,text2;
LinearLayout splash_img;
    Animation anim,anim1;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shan);
        init_view();
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                overridePendingTransition(R.anim.splashstart,R.anim.splashend);
                start_anim();
//                end_anim();
//                splash_img.animate().setDuration(3000).start();
                finish();
            }
        }, 0);
//        finished();
//        startActivity(new Intent(this, StartPage.class));
//        goMain();
    }

    private void init_view(){
        splash_img = (LinearLayout) findViewById(R.id.splash_img);
//        splash_img.setVisibility(View.INVISIBLE);
        sp_img = (ImageView) findViewById(R.id.sp_img);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
    }
    private void start_anim(){
        anim = AnimationUtils.loadAnimation
                (getApplicationContext(), // 현재화면 제어권자
                        R.anim.splashstart);      // 에니메이션 설정한 파일
        splash_img.startAnimation(anim);
    }
    private void end_anim(){
        anim1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashend); // (현재화면 제어권자, 에니메이션 설정한 파일)
        splash_img.startAnimation(anim1);
    }

    public void goMain(){
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }
}
