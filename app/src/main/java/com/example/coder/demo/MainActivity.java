package com.example.coder.demo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.RotationRatingBar;
import com.willy.ratingbar.ScaleRatingBar;


public class MainActivity extends Activity {
    ScaleRatingBar sr;
    RotationRatingBar rr;
    BaseRatingBar br;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.button);
        br=(BaseRatingBar)findViewById(R.id.simpleRatingBar);
        sr=(ScaleRatingBar)findViewById(R.id.scaleratingbar);
        rr=(RotationRatingBar)findViewById(R.id.rotationbar);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float currentrating=br.getRating();
                br.setRating(currentrating+0.25f);
                currentrating=sr.getRating();
                sr.setRating(currentrating+0.25f);
                currentrating=rr.getRating();
                rr.setRating(currentrating+0.25f);
            }
        });

    }





}
