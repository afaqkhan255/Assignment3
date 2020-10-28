package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup group1;
    RadioGroup group2;

    RadioButton btn1;
    RadioButton btn2;

    TextView t1;

    CheckBox cb1 ;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;

    String str;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group1 = findViewById(R.id.radioGroup1);
        group2 = findViewById(R.id.radioGroup3);
        t1 = findViewById(R.id.text);

        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);

        btn = findViewById(R.id.button);
    }


    public void OnClick(View view) {

        int g1 = group1.getCheckedRadioButtonId();
        int g2 = group2.getCheckedRadioButtonId();

        btn1 = findViewById(g1);
        btn2 = findViewById(g2);

        str = btn1.getText().toString().concat(" & ").concat(btn2.getText().toString());

        if(cb1.isChecked())
        {
            str = str.concat("\n").concat(cb1.getText().toString());
        }
        if(cb2.isChecked())
        {
            str = str.concat("\n").concat(cb2.getText().toString());
        }
        if(cb3.isChecked())
        {
            str = str.concat("\n").concat(cb3.getText().toString());
        }
        if(cb4.isChecked())
        {
            str = str.concat("\n").concat(cb3.getText().toString());
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity2.class);
                intent.putExtra("data" , str);
                startActivity(intent);
            }
        });
    }
}