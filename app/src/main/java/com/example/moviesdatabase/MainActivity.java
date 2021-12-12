package com.example.moviesdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button retry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retry = findViewById(R.id.retryButt);
    }

   public void checker(View view) {

        /*
        InternetConnectionChecker checker = new InternetConnectionChecker();*/
        if (InternetConnectionChecker.hasConnection(getApplicationContext())){
            Toast.makeText(getApplicationContext(), getString(R.string.toast_retry), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), getString(R.string.toast_please_connect), Toast.LENGTH_SHORT).show();
        }
    }
}
