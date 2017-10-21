package com.example.arif.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private   CheckBox milkCheckBox, butterCheckBox, waterCheckBox;
     private Button showButton;
     TextView showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        milkCheckBox = (CheckBox) findViewById(R.id.milkID);
        butterCheckBox = (CheckBox) findViewById(R.id.butterID);
        waterCheckBox = (CheckBox) findViewById(R.id.waterID);

        showButton = (Button) findViewById(R.id.buttonID);
        showResult = (TextView) findViewById(R.id.textViewID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                if (milkCheckBox.isChecked())
                {
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered \n");
                }

                if (butterCheckBox.isChecked())
                {
                    String value = butterCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered \n");
                }

                if (waterCheckBox.isChecked())
                {
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n ");
                }


                showResult.setText(stringBuilder);
            }
        });
    }
}
