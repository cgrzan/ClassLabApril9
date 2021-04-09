package com.example.classlabapril9;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText aValue;
    private EditText bValue;
    private TextView Answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.aValue = this.findViewById(R.id.A);
        this.bValue = this.findViewById(R.id.B);
        this.Answer = this.findViewById(R.id.Answer);
    }

    public void onCalcButtonClicked(View v){

        this.Answer.setText("");
        Integer A = Integer.valueOf(aValue.getText().toString());
        Integer B = Integer.valueOf(bValue.getText().toString());


        int AB = (A * A) + (B * B);
        double Answer = Math.sqrt(AB);
        this.Answer.setText((int) Answer);
    }

}