package com.example.class229_forloopinandroidpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        button.setText(" ");

        for(int x=1;x<=1000;x++){



            if(x%5==0 &&x%11==0)  button.append(" "+x);



        }


    }


}