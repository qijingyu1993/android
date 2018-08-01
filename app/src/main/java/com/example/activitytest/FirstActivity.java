package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        //onclick activity跳转1
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Intent intent=new Intent("com.example.activitytest.Action_START");
                Intent intent=new Intent("com.example.activitytest.Action_START");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            }
        });

        //intent隐式 activity跳转2
        Button button2=(Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(FirstActivity.this, "Hi Button2",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("com.example.activitytest.Action_START2");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }
        });

    }
}
