package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText username;
    private Button saveButton;
    private TextView successMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        username = findViewById(R.id.username);
        saveButton = findViewById(R.id.save_button);
        successMessage = findViewById(R.id.success_message);

        saveButton.setOnClickListener(v -> successMessage.setText("Profile updated successfully!"));
    }
}
