package com.example.whatsthemove;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import com.example.whatsthemove.databinding.ActivityBookBinding;

import androidx.appcompat.app.AppCompatActivity;

public class BookActivity extends AppCompatActivity {

    private Button btnBookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookvenue);


        btnBookNow = findViewById(R.id.btnBookNow);
        btnBookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}