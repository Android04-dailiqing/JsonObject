package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class ThreeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn;
    private Button mBtnscale;
    private Button mBtnrotate;
    private Button mBtntranslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        mBtn = (Button) findViewById(R.id.btn_three_alpha);
        mBtnscale = (Button) findViewById(R.id.btn_three_scale);
        mBtnrotate = (Button) findViewById(R.id.btn_three_rotate);
        mBtntranslate = (Button) findViewById(R.id.btn_three_translate);
        mBtn.setOnClickListener(this);
        mBtnscale.setOnClickListener(this);
        mBtnrotate.setOnClickListener(this);
        mBtntranslate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mBtn){
            Animation animator = AnimationUtils.loadAnimation(this,R.anim.anim);
            mBtn.startAnimation(animator);
        }
        if(v == mBtnscale){
//            Animation animation = new ScaleAnimation(1,0,1,0,0.5f,0.5f);
            Animation animation = new ScaleAnimation(1,0,1,0,
                    Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            animation.setDuration(3000);
            mBtnscale.startAnimation(animation);
        }
        if(v == mBtnrotate){
            Animation animator = new RotateAnimation(0,720,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            animator.setDuration(3000);
            mBtnrotate.startAnimation(animator);
        }
        if(v == mBtntranslate){
            Animation animator = new TranslateAnimation(0,100,0,100);
            animator.setDuration(3000);
            mBtntranslate.startAnimation(animator);
        }
    }
}
