package com.example.turate.s2_assign4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.widget.CompoundButton.*;

public class MainActivity extends AppCompatActivity {

    private ToggleButton button;
    private TextView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (ToggleButton) findViewById(R.id.tb1);
        image  = (TextView) findViewById(R.id.img1);

        button.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    button.setTextOn("SEEK");
                    image.setVisibility(INVISIBLE);
                } else {
                    button.setTextOff("HIDE");
                    image.setVisibility(VISIBLE);
                }
            }
        });
    }


}
