package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    private Button addToCartButton;
    private Button checkoutButton;
    private TextView cartCount;
    private TextView checkoutMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        addToCartButton = findViewById(R.id.add_to_cart);
        checkoutButton = findViewById(R.id.checkout_button);
        cartCount = findViewById(R.id.cart_count);
        checkoutMessage = findViewById(R.id.checkout_message);

        addToCartButton.setOnClickListener(v -> cartCount.setText("1"));
        checkoutButton.setOnClickListener(v -> checkoutMessage.setText("Thank you for your purchase"));
    }
}
