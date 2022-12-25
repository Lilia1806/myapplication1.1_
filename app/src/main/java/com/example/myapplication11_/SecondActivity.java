package com.example.myapplication11_;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication11_.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ImageView photo;
    String photoW = "WhatsApp";
    String photoG = "Google";
    String photoY = "YouTube";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        photo = findViewById(R.id.photo);

        Bundle argument = getIntent().getExtras();

        String text = argument.getString("text");
        if (argument != null) {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        switch (text) {
            case "WhatsApp":
                photo.setImageResource(R.drawable.WhatsApp);
                break;

            case "YouTub":
                photo.setImageResource(R.drawable.Google);
                break;

            case "Chrome":
                photo.setImageResource(R.drawable.YouTube);
                break;
        }
    }
}