package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.admin.myapplication.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button btn;
    private Button btn_an;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        rb1 = (RadioButton) findViewById(R.id.rb_1);
        rb2 = (RadioButton) findViewById(R.id.rb_2);
        rb3 = (RadioButton) findViewById(R.id.rb_3);
        btn = (Button) findViewById(R.id.btn_show);
        btn_an = (Button) findViewById(R.id.btn_show_animotion);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        btn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.rb_1){
            Toast.makeText(MainActivity.this, "选择了"+rb1.getText(), Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.rb_2){
            Toast.makeText(MainActivity.this, "选择了"+rb2.getText(), Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.rb_3){
            Toast.makeText(MainActivity.this, "选择了"+rb3.getText(), Toast.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.btn_show){
            Intent intent = new Intent(MainActivity.this,SencondActivity.class);
            startActivity(intent);
        }

    }

}
