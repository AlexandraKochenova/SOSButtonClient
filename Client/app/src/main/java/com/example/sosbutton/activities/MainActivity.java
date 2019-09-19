package com.example.sosbutton.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sosbutton.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo
    }

    public void onProfileBtnClick(View v) {
        Toast.makeText(getApplicationContext(), "Start click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "End click", Toast.LENGTH_SHORT).show();
    }

}

