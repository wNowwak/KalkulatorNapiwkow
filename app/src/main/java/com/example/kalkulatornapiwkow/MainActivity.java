package com.example.kalkulatornapiwkow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCount;
    private EditText edtValue;
    private TextView txtTip, txtSum;
    private RatingBar rateFood, rateService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = (Button) findViewById(R.id.btnCount);
        edtValue = (EditText) findViewById(R.id.edtValue);
        txtTip = (TextView) findViewById(R.id.txtTip);
        rateFood = (RatingBar) findViewById(R.id.rateFood);
        rateService = (RatingBar) findViewById(R.id.rateService);
        txtSum = (TextView) findViewById(R.id.txtSum);



        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value = Float.parseFloat(edtValue.getText().toString());
                float tipForService = rateService.getRating();
                float tipForFood = rateFood.getRating();

                float Tip = value*(tipForFood+tipForService)/100;
                float sum = value + Tip;
                txtTip.setText(Float.toString(Tip));
                txtSum.setText(Float.toString(sum));

            }
        });
    }
}
