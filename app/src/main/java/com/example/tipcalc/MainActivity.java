package com.example.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcTip(View v){
        //
        EditText editBill = (EditText) findViewById(R.id.totalBill);
        EditText editTip = (EditText) findViewById(R.id.percentTip);
        EditText totalTip = (EditText) findViewById(R.id.totalTip);
        EditText totalBill = (EditText) findViewById(R.id.tippedBill);

        double billBefore = Float.parseFloat(editBill.getText().toString());
        double tipPercent = Float.parseFloat(editTip.getText().toString());

        DecimalFormat df = new DecimalFormat("######.00");

        double tipAmount = billBefore * (tipPercent/100);
        double billAfter = tipAmount + billBefore;

        totalTip.setText(df.format(tipAmount));
        totalBill.setText(df.format(billAfter));
    }

}
