package com.wolfsl.fragprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button analyzeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout l=findViewById(R.id.linear_layer);
        LayoutInflater li=getLayoutInflater();
//        View v=li.inflate(R.layout.sub_class,null);

        View v=li.inflate(R.layout.sub_class,l,false);

        onClickBtn();
//        l.addView(v);
    }

    public void onClickBtn(){

        analyzeBtn=(Button) findViewById(R.id.analyze);

        analyzeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout l2=findViewById(R.id.linear2);
                LayoutInflater li1=getLayoutInflater();
                View v1=li1.inflate(R.layout.sub_btn,l2,true);

                analyzeBtn.setEnabled(false);
                analyzeBtn.setVisibility(View.GONE);
            }
        });


    }


}