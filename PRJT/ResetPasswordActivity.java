package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText email;
    private Button resetButton;
    private TextView successMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        email = findViewById(R.id.email);
        resetButton = findViewById(R.id.reset_button);
        successMessage = findViewById(R.id.success_message);

        resetButton.setOnClickListener(v -> successMessage.setText("Password reset link sent!"));
    }
}
