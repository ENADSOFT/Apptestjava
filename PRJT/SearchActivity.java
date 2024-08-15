package com.example.myapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    private EditText searchInput;
    private TextView searchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchInput = findViewById(R.id.search);
        searchResults = findViewById(R.id.search_results);

        // Simulating a search action
        searchResults.setText("Displaying search results for: " + searchInput.getText().toString());
    }
}

