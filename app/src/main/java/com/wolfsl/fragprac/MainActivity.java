package com.wolfsl.fragprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button analyzeBtn;
    double ph=6.0;
    double temp=40.5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        View v=li.inflate(R.layout.sub_class,null);



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

                LayoutInflater li=getLayoutInflater();
                LinearLayout l=findViewById(R.id.linear_layer);

                analyzeBtn.setEnabled(false);
                analyzeBtn.setVisibility(View.GONE);

                if(ph>7.0 && temp>30){
                    View v1=li1.inflate(R.layout.sub_btn,l2,true);

                }
                else{
                    View v=li.inflate(R.layout.sub_class,l,true);
                }
            }
        });


    }


}