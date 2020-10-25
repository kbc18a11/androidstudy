package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        btClick.setOnClickListener(new HelloListener());

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(new ClearListener());
    }

    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            String inputStr = input.getText().toString();
            output.setText(inputStr + "殺す");
        }
    }

    private class ClearListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            input.setText("");
            output.setText("");
        }
    }
}