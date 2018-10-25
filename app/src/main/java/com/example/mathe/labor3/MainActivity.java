package com.example.mathe.labor3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{

    public Button gomb1,gomb2,gomb3,gomb4,gomb5,gomb6,gomb7,gomb8,gomb9;
    public int ertek1,ertek2,ertek3,ertek4,ertek5,ertek6,ertek7,ertek8,ertek9 =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gomb1 = (Button) findViewById(R.id.btn);
        gomb1.setOnClickListener(this);
        gomb2 = (Button) findViewById(R.id.btn2);
        gomb2.setOnClickListener(this);
        gomb3 = (Button) findViewById(R.id.btn3);
        gomb3.setOnClickListener(this);
        gomb4 = (Button) findViewById(R.id.btn4);
        gomb4.setOnClickListener(this);
        gomb5 = (Button) findViewById(R.id.btn5);
        gomb5.setOnClickListener(this);
        gomb6 = (Button) findViewById(R.id.btn6);
        gomb6.setOnClickListener(this);
        gomb7 = (Button) findViewById(R.id.btn7);
        gomb7.setOnClickListener(this);
        gomb8 = (Button) findViewById(R.id.btn8);
        gomb8.setOnClickListener(this);
        gomb9 = (Button) findViewById(R.id.btn9);
        gomb9.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn){
            ertek1++;
            if(ertek1>9){
                ertek1 = 1;
            }
            gomb1.setText(String.valueOf(ertek1));
        }else if(v.getId() == R.id.btn2){
            ertek2++;
            if(ertek2>9){
                ertek2 = 1;
            }
            gomb2.setText(String.valueOf(ertek2));
        }else if(v.getId() == R.id.btn3){
            ertek3++;
            if(ertek3>9){
                ertek3 = 1;
            }
            gomb3.setText(String.valueOf(ertek3));
        }else if(v.getId() == R.id.btn4){
            ertek4++;
            if(ertek4>9){
                ertek4 = 1;
            }
            gomb4.setText(String.valueOf(ertek4));
        }else if(v.getId() == R.id.btn5){
            ertek5++;
            if(ertek5>9){
                ertek5 = 1;
            }
            gomb5.setText(String.valueOf(ertek5));
        }else if(v.getId() == R.id.btn6){
            ertek6++;
            if(ertek6>9){
                ertek6 = 1;
            }
            gomb6.setText(String.valueOf(ertek6));
        }else if(v.getId() == R.id.btn7){
            ertek7++;
            if(ertek7>9){
                ertek7 = 1;
            }
            gomb7.setText(String.valueOf(ertek7));
        }else if(v.getId() == R.id.btn8){
            ertek8++;
            if(ertek8>9){
                ertek8 = 1;
            }
            gomb9.setText(String.valueOf(ertek8));
        }else if(v.getId() == R.id.btn9){
            ertek9++;
            if(ertek9>9){
                ertek9 = 1;
            }
            gomb9.setText(String.valueOf(ertek9));
        }
    }

}
