package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button profileButton;
    private Button searchButton;
    private Button cartButton;
    private Button notificationButton;
    private Button shareButton;
    private Button paymentButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profileButton = findViewById(R.id.profile_button);
        searchButton = findViewById(R.id.search_button);
        cartButton = findViewById(R.id.cart_button);
        notificationButton = findViewById(R.id.notification_button);
        shareButton = findViewById(R.id.share_button);
        paymentButton = findViewById(R.id.payment_button);
        logoutButton = findViewById(R.id.logout_button);

        profileButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, ProfileActivity.class)));
        searchButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, SearchActivity.class)));
        cartButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, CartActivity.class)));
        notificationButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, NotificationActivity.class)));
        shareButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, ShareActivity.class)));
        paymentButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, PaymentActivity.class)));
        logoutButton.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, MainActivity.class)));
    }
}
