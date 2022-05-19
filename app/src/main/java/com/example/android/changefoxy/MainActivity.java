package com.example.android.changefoxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView fox1ImageView, fox2ImageView;
    boolean isFox1Visible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fox1ImageView = findViewById(R.id.fox1ImageView);
        fox2ImageView = findViewById(R.id.fox2ImageView);
    }

    public void eraseFox1(View view) {

        if (isFox1Visible) {

            fox1ImageView.animate().scaleY(0).scaleX(0).rotation(fox1ImageView.getRotation()+3600).alpha(0).setDuration(1500);
            fox2ImageView.animate().scaleY(1).scaleX(1).rotation(fox2ImageView.getRotation()+3600).alpha(1).setDuration(1500);
            isFox1Visible = false;
        } else {
            fox2ImageView.animate().scaleY(0).scaleX(0).rotation(fox2ImageView.getRotation()+3600).alpha(0).setDuration(1500);
            fox1ImageView.animate().scaleY(1).scaleX(1).rotation(fox1ImageView.getRotation()+3600).alpha(1).setDuration(1500);
            isFox1Visible = true;
        }
    }
}