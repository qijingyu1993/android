package com.example.activitytest;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activitytest.Bean.Word;
import com.example.activitytest.Dom.Dom;

import java.io.File;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button1=(Button) findViewById(R.id.button_word);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Intent intent=new Intent("com.example.activitytest.Action_START");
                Dom td=new Dom();
                File file=new File("lesson01_cn.xml");
                List<Word> list=td.getWord(file);
                for (int i = 0; i <list.size(); i++) {
                   Word word = list.get(i);
                   System.out.println(word.toString());
               }

            }
        });
    }
}
