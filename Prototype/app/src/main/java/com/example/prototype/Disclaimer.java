package com.example.prototype;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Objects;

public class Disclaimer extends BaseActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);
        Objects.requireNonNull(getSupportActionBar()).hide();

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}