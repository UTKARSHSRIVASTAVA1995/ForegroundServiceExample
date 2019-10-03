package com.example.foregroundserviceexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextinput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinput = findViewById(R.id.edit_text_input);

    }
    public void startService(View v){
        String input = editTextinput.getText().toString();
        Intent serviceIntent = new Intent(this,ExampleService.class);
        serviceIntent.putExtra("inputextra",input);

        startService(serviceIntent);

    }
    public void stopService (View v){

        Intent serviceIntent = new Intent(this,ExampleService.class);
        stopService(serviceIntent);


    }
}
