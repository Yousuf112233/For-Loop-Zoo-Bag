package com.example.class229_forloopinandroidpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

LinearLayout linearlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearlayout=findViewById(R.id.linearlayout);



        for (int x=1;x<1000;x++){

            Button button =new Button(MainActivity.this);

            button.setText("Button"+x);

            linearlayout.addView(button);

        }





    }


}