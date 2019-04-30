package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt;

    @Override


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        txt=findViewById(R.id.txt);
        button();
        text();

    }
    public void button(){
        txt.setVisibility(View.INVISIBLE);
    }
    public  void  text(){
        btn.setVisibility(View.INVISIBLE);
    }


}
