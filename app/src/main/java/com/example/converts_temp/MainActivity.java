package com.example.converts_temp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.converts_temp.model.Body;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ctof = findViewById(R.id.ctof_button);
        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.enter_editText);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.output_textView);

                String show = Integer.toString(body.tranform_c_to_f());
                output.setText(show);
            }
        });
        Button ftoc = findViewById(R.id.ftoc_button);
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.enter_editText);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.output_textView);

                String show = String.format("%.2f", body.tranform_f_to_c());
                output.setText(show);
            }
        });
    }
}
/*
package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.temperatureconverter.Model.Body;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c_to_f = findViewById(R.id.c_to_f_button);
        c_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input_text);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.output_text);

                String show = Integer.toString(body.tranform_c_to_f());
                output.setText(show);
            }
        });

        Button f_to_c = findViewById(R.id.f_to_c_button);
        f_to_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input_text);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);

                final TextView output = findViewById(R.id.output_text);

                String show = String.format("%.2f", body.tranform_f_to_c());
                output.setText(show);
            }
        });
    }
}

*/